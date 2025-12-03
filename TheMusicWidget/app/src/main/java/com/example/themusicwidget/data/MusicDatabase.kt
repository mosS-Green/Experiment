package com.example.themusicwidget.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [MusicEntity::class], version = 1, exportSchema = false)
abstract class MusicDatabase : RoomDatabase() {
    abstract fun musicDao(): MusicDao
}
