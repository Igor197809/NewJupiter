package com.example.newjupiter

import android.content.Context
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential
import com.google.api.services.sheets.v4.Sheets
import com.google.api.services.sheets.v4.model.ValueRange
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class SheetsServiceHelper(context: Context) {

    private val sheetsService: Sheets by lazy {
        val credential = GoogleCredential.fromStream(context.resources.openRawResource(R.raw.jupiter_credentials))
            .createScoped(listOf("https://www.googleapis.com/auth/spreadsheets"))

        Sheets.Builder(
            com.google.api.client.http.javanet.NetHttpTransport(),
            com.google.api.client.json.jackson2.JacksonFactory(),
            credential
        ).setApplicationName("NewJupiter").build()
    }

    suspend fun writeSheet(spreadsheetId: String, range: String, values: List<List<Any>>): Boolean {
        return withContext(Dispatchers.IO) {
            try {
                val body = ValueRange().setValues(values)
                sheetsService.spreadsheets().values().update(spreadsheetId, range, body)
                    .setValueInputOption("RAW")
                    .execute()
                true
            } catch (e: Exception) {
                e.printStackTrace()
                false
            }
        }
    }
}
