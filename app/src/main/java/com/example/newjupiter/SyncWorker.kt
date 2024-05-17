package com.example.newjupiter

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters
import java.io.IOException

class SyncWorker(context: Context, params: WorkerParameters) : Worker(context, params) {

    override fun doWork(): Result {
        val db = DatabaseClient.getInstance(applicationContext).appDatabase
        val dataDao = db.dataDao()
        val localData = dataDao.getAllData()

        val sheetsHelper = SheetsServiceHelper(applicationContext, "your-spreadsheet-id")
        return try {
            val remoteData = sheetsHelper.getData("Sheet1!A1:B10")
            remoteData.forEach { row ->
                val entity = DataEntity(data = row[0].toString())
                dataDao.insert(entity)
            }

            val values = localData.map { listOf(it.data) }
            sheetsHelper.updateData("Sheet1!A1", values)

            Result.success()
        } catch (e: IOException) {
            e.printStackTrace()
            Result.retry()
        }
    }
}
