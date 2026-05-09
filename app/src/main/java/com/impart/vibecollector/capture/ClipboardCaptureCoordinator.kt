package com.impart.vibecollector.capture

import android.content.ClipboardManager
import javax.inject.Inject

class ClipboardCaptureCoordinator @Inject constructor(
    private val clipboardManager: ClipboardManager
) {
    fun start() {
        // Clipboard listener placeholder: capture, deduplicate, persist, then classify.
    }
}
