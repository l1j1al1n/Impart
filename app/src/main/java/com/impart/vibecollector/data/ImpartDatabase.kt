package com.impart.vibecollector.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ClipMemory::class], version = 1, exportSchema = false)
abstract class ImpartDatabase : RoomDatabase() {
    abstract fun clipMemoryDao(): ClipMemoryDao
}
