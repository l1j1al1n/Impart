package com.impart.vibecollector.ui

import androidx.lifecycle.ViewModel
import com.impart.vibecollector.data.ClipMemory
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

@HiltViewModel
class MemoryViewModel @Inject constructor() : ViewModel() {
    private val seedMemories = listOf(
        ClipMemory(
            content = "Retrofit integration note: keep API keys out of source control.",
            summary = "AI setup guardrail",
            tag = "Code",
            source = "Clipboard",
            capturedAt = 0
        ),
        ClipMemory(
            content = "Book a review slot and export weekly snippets to Markdown.",
            summary = "Planning reminder",
            tag = "Todo",
            source = "Accessibility",
            capturedAt = 0
        ),
        ClipMemory(
            content = "https://developer.android.com/jetpack/compose",
            summary = "Compose reference",
            tag = "Link",
            source = "Clipboard",
            capturedAt = 0
        )
    )

    private val _uiState = MutableStateFlow(MemoryUiState(memories = seedMemories))
    val uiState: StateFlow<MemoryUiState> = _uiState
}

data class MemoryUiState(
    val memories: List<ClipMemory> = emptyList(),
    val activeFilter: String = "all"
)
