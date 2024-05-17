package com.example.newjupiter

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface DataDao {
    @Insert
    suspend fun insert(data: DataEntity)

    @Query("SELECT * FROM data_table")
    suspend fun getAllData(): List<DataEntity>
}
