package com.impart.vibecollector.capture

import android.accessibilityservice.AccessibilityService
import android.view.accessibility.AccessibilityEvent

class ImpartAccessibilityService : AccessibilityService() {
    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        // Capture pipeline placeholder: normalize text, store it, then ask AI for tags.
    }

    override fun onInterrupt() = Unit
}
