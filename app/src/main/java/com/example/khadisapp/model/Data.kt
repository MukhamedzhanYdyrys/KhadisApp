package com.example.khadisapp.model.allHadeest

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "allHadeethInCategory")
data class Data(
    @PrimaryKey() val id: String,
    @ColumnInfo(name = "title") val title: String
)