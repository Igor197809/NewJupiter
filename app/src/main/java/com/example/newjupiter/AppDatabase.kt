package com.example.newjupiter

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [YourEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun yourDao(): YourDao
}
