package com.example.newjupiter

import android.util.Log
import com.google.api.client.extensions.android.http.AndroidHttp
import com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential
import com.google.api.client.json.gson.GsonFactory
import com.google.api.services.sheets.v4.Sheets
import com.google.api.services.sheets.v4.model.ValueRange
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.IOException

class SheetsServiceHelper(private val credential: GoogleAccountCredential) {

    private val service: Sheets by lazy {
        Sheets.Builder(AndroidHttp.newCompatibleTransport(), GsonFactory(), credential)
            .setApplicationName("NewJupiter")
            .build()
    }

    suspend fun writeSheet(spreadsheetId: String, range: String, values: List<List<Any>>): Boolean {
        return withContext(Dispatchers.IO) {
            try {
                Log.d("SheetsServiceHelper", "Writing to sheet...")
                val body = ValueRange().setValues(values)
                val result = service.spreadsheets().values().update(spreadsheetId, range, body)
                    .setValueInputOption("RAW")
                    .execute()
                Log.d("SheetsServiceHelper", "Write successful: ${result.updatedCells} cells updated.")
                result.updatedCells > 0
            } catch (e: IOException) {
                Log.e("SheetsServiceHelper", "Error writing to sheet", e)
                false
            }
        }
    }
}
