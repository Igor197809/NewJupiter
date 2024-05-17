package com.example.newjupiter

import android.content.Context
import androidx.room.Room

class DatabaseClient private constructor(context: Context) {

    val appDatabase: AppDatabase = Room.databaseBuilder(
        context.applicationContext,
        AppDatabase::class.java, "MyDatabase"
    ).build()

    companion object {
        @Volatile
        private var instance: DatabaseClient? = null

        fun getInstance(context: Context): DatabaseClient {
            return instance ?: synchronized(this) {
                instance ?: DatabaseClient(context).also { instance = it }
            }
        }
    }
}
