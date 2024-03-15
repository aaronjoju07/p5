package com.example.p5

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.p5.ui.theme.Purple40

@Composable
fun RadioButtonDemo() {
    var selectedOption by remember { mutableStateOf("Option 1") }
    Column(
        modifier = Modifier
            .background(Color.White)
            .padding(0.dp, 0.dp)
    ) {

        Text(
            text = "Choose the venue",
            fontSize = 20.sp,
            color = Purple40,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp, 15.dp)
        )

        Row(
            modifier = Modifier.padding(0.dp)
        ) {
            RadioButtonGroup(selectedOption = selectedOption) { option ->
                selectedOption = option
            }
        }
    }
}

@Composable
fun RadioButtonGroup(
    selectedOption: String,
    onOptionSelected: (String) -> Unit
) {
    val options = listOf("Cafeteria", "Library", "Class")

    options.forEach { option ->
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(vertical = 8.dp)
        ) {
            RadioButton(
                selected = (option == selectedOption),
                onClick = { onOptionSelected(option) }
            )
            Text(
                text = option,
                modifier = Modifier.padding(start = 8.dp)
            )
        }
    }
}