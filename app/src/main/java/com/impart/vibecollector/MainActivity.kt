package com.impart.vibecollector

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.ComponentActivity
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.saveable.rememberSaveable
import com.impart.vibecollector.ui.MemoryRoute
import com.impart.vibecollector.ui.AppLanguage
import com.impart.vibecollector.ui.theme.ImpartTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            var language by rememberSaveable { mutableStateOf(AppLanguage.Chinese) }
            ImpartTheme {
                MemoryRoute(
                    language = language,
                    onToggleLanguage = {
                        language = if (language == AppLanguage.Chinese) {
                            AppLanguage.English
                        } else {
                            AppLanguage.Chinese
                        }
                    }
                )
            }
        }
    }
}
