package com.example.p5

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
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
fun venue() {
    Column(
        modifier = Modifier
            .background(Color.White)
            .padding(10.dp, 0.dp)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Top, // Set vertical alignment to the top
    ) {

        Text(
            text = "Meeting Purpose",
            fontSize = 20.sp,
            color = Purple40,
            modifier = Modifier
                .padding(0.dp, 15.dp)
        )

        // First set of options
        Column {
            var clarificationOfDoubts by remember { mutableStateOf(false) }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Checkbox(
                    checked = clarificationOfDoubts,
                    onCheckedChange = { clarificationOfDoubts = it },
                )
                Text(
                    text = "Clarification of Doubts",
                )
            }

            var academicProgressReview by remember { mutableStateOf(false) }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Checkbox(
                    checked = academicProgressReview,
                    onCheckedChange = { academicProgressReview = it },
                )
                Text(
                    text = "Academic Progress Review",
                )
            }

            var individualizedGuidance by remember { mutableStateOf(false) }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Checkbox(
                    checked = individualizedGuidance,
                    onCheckedChange = { individualizedGuidance = it },
                )
                Text(
                    text = "Individualized Guidance",
                )
            }

            var behavioralConcerns by remember { mutableStateOf(false) }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Checkbox(
                    checked = behavioralConcerns,
                    onCheckedChange = { behavioralConcerns = it },
                )
                Text(
                    text = "Behavioral Concerns",
                )
            }
        }

        // Second set of options
        Column {
            var timetable by remember { mutableStateOf(false) }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Checkbox(
                    checked = timetable,
                    onCheckedChange = { timetable = it },
                )
                Text(
                    text = "Timetable",
                )
            }

            var fest by remember { mutableStateOf(false) }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Checkbox(
                    checked = fest,
                    onCheckedChange = { fest = it },
                )
                Text(
                    text = "Fest",
                )
            }
        }
    }
}
