package com.example.p5

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.p5.ui.theme.Purple40

@Composable
fun ToggleSwitch() {
    var isChecked by remember { mutableStateOf(false) }

    Switch(
        checked = isChecked,
        onCheckedChange = { isChecked = it },
        colors = SwitchDefaults.colors(
            checkedThumbColor = Purple40, // Customize thumb color when checked
            checkedTrackColor = Purple40.copy(alpha = 0.5f), // Customize track color when checked
            uncheckedThumbColor = Color.Gray, // Customize thumb color when unchecked
            uncheckedTrackColor = Color.Gray.copy(alpha = 0.5f), // Customize track color when unchecked
        ),
        modifier = Modifier.padding(10.dp)
    )
}

@Composable
fun ToggleSwitchDemo() {
    Row(
        modifier = Modifier.fillMaxWidth().padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "Notify me",fontSize = 20.sp,
            color = Purple40,)
        ToggleSwitch()
    }
}