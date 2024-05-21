package com.example.newjupiter

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "your_entity")
data class YourEntity(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val name: String
)
