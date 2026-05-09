package com.impart.vibecollector.data

import javax.inject.Inject
import kotlinx.coroutines.flow.Flow

class MemoryRepository @Inject constructor(
    private val dao: ClipMemoryDao
) {
    fun observeMemories(): Flow<List<ClipMemory>> = dao.observeAll()
}
