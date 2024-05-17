package com.example.newjupiter

import android.content.Context
import androidx.work.PeriodicWorkRequest
import androidx.work.WorkManager
import java.util.concurrent.TimeUnit

object SyncManager {
    fun startSync(context: Context) {
        val syncWorkRequest = PeriodicWorkRequest.Builder(SyncWorker::class.java, 15, TimeUnit.MINUTES)
            .build()
        WorkManager.getInstance(context).enqueue(syncWorkRequest)
    }
}
