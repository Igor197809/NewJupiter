package com.example.newjupiter

import android.util.Log
import com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential
import com.google.api.client.json.gson.GsonFactory
import com.google.api.client.http.javanet.NetHttpTransport
import com.google.api.services.sheets.v4.Sheets
import com.google.api.services.sheets.v4.model.ValueRange
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.IOException

class SheetsServiceHelper(private val credential: GoogleAccountCredential) {

    private val TAG = "SheetsServiceHelper"

    private val service: Sheets by lazy {
        Sheets.Builder(NetHttpTransport(), GsonFactory.getDefaultInstance(), credential)
            .setApplicationName("NewJupiter")
            .build()
    }

    suspend fun readSheet(spreadsheetId: String, range: String): List<List<Any>>? {
        return withContext(Dispatchers.IO) {
            try {
                val response = service.spreadsheets().values().get(spreadsheetId, range).execute()
                response.getValues()
            } catch (e: IOException) {
                Log.e(TAG, "Error reading sheet: $e")
                null
            }
        }
    }

    suspend fun writeSheet(spreadsheetId: String, range: String, values: List<List<Any>>): Boolean {
        return withContext(Dispatchers.IO) {
            try {
                val body = ValueRange().setValues(values)
                val result = service.spreadsheets().values().update(spreadsheetId, range, body)
                    .setValueInputOption("RAW")
                    .execute()
                result.updatedCells > 0
            } catch (e: IOException) {
                Log.e(TAG, "Error writing sheet: $e")
                false
            }
        }
    }
}
