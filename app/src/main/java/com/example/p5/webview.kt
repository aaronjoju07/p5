package com.example.p5

import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun WebViewComponent(url: String) {
    AndroidView(
        modifier = Modifier.fillMaxSize(),
        factory = { context ->
            WebView(context).apply {
                // Configure WebView settings
                settings.javaScriptEnabled = true
                webViewClient = WebViewClient()
                // Load URL
                loadUrl(url)
            }
        }
    )
}

@Composable
fun webViewDemo() {
    WebViewComponent(url = "https://christuniversity.in")
}
