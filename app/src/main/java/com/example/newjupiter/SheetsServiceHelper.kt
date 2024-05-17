package com.example.newjupiter

import android.content.Context
import com.google.api.client.extensions.android.http.AndroidHttp
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential
import com.google.api.client.json.jackson2.JacksonFactory
import com.google.api.services.sheets.v4.Sheets
import com.google.api.services.sheets.v4.model.ValueRange
import java.io.IOException
import java.io.InputStream

class SheetsServiceHelper(context: Context, private val spreadsheetId: String) {

    private val sheetsService: Sheets

    init {
        val credential: GoogleCredential
        val jsonInputStream: InputStream = context.resources.openRawResource(R.raw.jupiter_credentials)
        credential = GoogleCredential.fromStream(jsonInputStream)
            .createScoped(listOf("https://www.googleapis.com/auth/spreadsheets"))

        sheetsService = Sheets.Builder(
            AndroidHttp.newCompatibleTransport(),
            JacksonFactory.getDefaultInstance(),
            credential
        ).setApplicationName("NewJupiter")
            .build()
    }

    @Throws(IOException::class)
    fun getData(range: String): List<List<Any>> {
        val response: ValueRange = sheetsService.spreadsheets().values()
            .get(spreadsheetId, range)
            .execute()
        return response.getValues() ?: emptyList()
    }

    @Throws(IOException::class)
    fun updateData(range: String, values: List<List<Any>>) {
        val body = ValueRange().setValues(values)
        sheetsService.spreadsheets().values()
            .update(spreadsheetId, range, body)
            .setValueInputOption("RAW")
            .execute()
    }
}
