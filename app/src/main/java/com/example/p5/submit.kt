package com.example.p5

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun submit(){
    val openDialog = remember {
        mutableStateOf(false)
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp, 20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { openDialog.value = true }) {
            Text(text = "submit",
                modifier = Modifier.padding(20.dp,10.dp))
        }

        if (openDialog.value){
            AlertDialog(onDismissRequest = { openDialog.value = false },
                title = {
                    Text(text = "Confirmation")
                },
                text = {
                    Text(text = "do you want to confirm")
                },
                confirmButton = {
                    Button(onClick = { openDialog.value = false }) {
                        Text(text = "CONFIRM")
                    }
                },
                dismissButton = {
                    Button(onClick = { openDialog.value = false }) {
                        Text(text = "CANCEL")
                    }
                }
            )
        }
    }
}
