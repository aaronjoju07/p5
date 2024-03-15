package com.example.p5

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.p5.ui.theme.Purple40


@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun firstRow() {
    Column(
        modifier = Modifier
            .background(Color.White)
            .padding(10.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = "Choose the Time",
            color = Purple40,
            fontSize = 20.sp,
            textAlign = TextAlign.Left,
            modifier = Modifier
                .padding(0.dp, 15.dp)
        )
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {

            TimePickerDemo()
        }
    }

//    Spacer(modifier = Modifier.padding(10.dp).background(Color.White))

    Column(
        modifier = Modifier
            .background(Color.White)
            .padding(10.dp, 0.dp)
    ) {
        Text(
            text = "Choose the Date",
            fontSize = 20.sp,
            color = Purple40,
            modifier = Modifier
                .padding(0.dp, 15.dp)
        )
        DatePickerDemo()
    }
}