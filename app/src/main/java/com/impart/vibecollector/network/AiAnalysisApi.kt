package com.impart.vibecollector.network

import kotlinx.serialization.Serializable
import retrofit2.http.Body
import retrofit2.http.POST

interface AiAnalysisApi {
    @POST("v1/chat/completions")
    suspend fun analyze(@Body request: AiAnalysisRequest): AiAnalysisResponse
}

@Serializable
data class AiAnalysisRequest(
    val model: String,
    val messages: List<AiMessage>
)

@Serializable
data class AiMessage(
    val role: String,
    val content: String
)

@Serializable
data class AiAnalysisResponse(
    val id: String? = null
)
