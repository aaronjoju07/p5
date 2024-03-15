package com.example.p5

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.p5.ui.theme.Purple40

@Composable
fun SpinnerDemo() {
    val items = listOf("School of Sciences","School of Architecture", "School of Arts and Humanities", "School of Business and Management","School of Commerce, Finance and Accountancy","School of Education")
    var selectedIndex by remember { mutableStateOf(0) }
    var expanded by remember { mutableStateOf(false) }

    // Function to toggle dropdown visibility
    val toggleDropdown: () -> Unit = { expanded = !expanded }

    Column(
        modifier = Modifier.fillMaxWidth()
    ) {

        TextField(
            value = TextFieldValue(items[selectedIndex]),
            onValueChange = {},
            readOnly = true,
            trailingIcon = {
                Icon(
                    imageVector = Icons.Filled.ArrowDropDown,
                    contentDescription = null,
                    modifier = Modifier.clickable { toggleDropdown() }
                )
            },
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 8.dp)
                .fillMaxWidth()
        )

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier.width(IntrinsicSize.Min)
        ) {
            items.forEachIndexed { index, item ->
                DropdownMenuItem(
                    onClick = {
                        selectedIndex = index
                        expanded = false
                    },
                    text = {
                        Text(
                            text = item,
                            color = androidx.compose.ui.graphics.Color.Black // Specify the text color here
                        )
                    },
                     // Add background color
                )
            }
        }

    }
}


@Composable
fun Spinner() {
    Text(text = "Select School Divisions",
        modifier = Modifier.fillMaxWidth().padding(10.dp,10.dp),
        color = Purple40,
        fontSize = 20.sp
    )
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        SpinnerDemo()
    }
}

