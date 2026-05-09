package com.impart.vibecollector.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ClipMemoryDao {
    @Query("SELECT * FROM clip_memories ORDER BY capturedAt DESC")
    fun observeAll(): Flow<List<ClipMemory>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(memory: ClipMemory)
}
