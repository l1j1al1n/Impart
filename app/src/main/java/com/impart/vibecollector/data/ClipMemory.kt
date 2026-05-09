package com.impart.vibecollector.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "clip_memories")
data class ClipMemory(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val content: String,
    val summary: String,
    val tag: String,
    val source: String,
    val capturedAt: Long
)
