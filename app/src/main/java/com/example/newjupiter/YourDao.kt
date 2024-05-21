package com.example.newjupiter

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface YourDao {
    @Query("SELECT * FROM your_entity")
    fun getAll(): List<YourEntity>

    @Insert
    fun insertAll(vararg entities: YourEntity)
}
