package com.example.p5

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

@Composable
fun TextAreaDemo() {
    var textState by remember { mutableStateOf(TextFieldValue()) }

    OutlinedTextField(
        value = textState,
        onValueChange = { textState = it },
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        label = { Text("Description") },
        maxLines = 5 // Set the number of lines for the multi-line text input
    )
}