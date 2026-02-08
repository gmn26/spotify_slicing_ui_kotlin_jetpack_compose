package com.gmn26.spotifyslicinguikotlinjetpackcompose.ui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.*

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun TopCategoryNav() {
    var actived by remember { mutableStateOf("Semua") }

    val categories = listOf("Semua", "Musik", "Podcast")

    Box(modifier = Modifier.height(40.dp)) {
        Row(
            modifier = Modifier.align(Alignment.Center),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .clip(RoundedCornerShape(32.dp))
                    .background(Color.White)
            )

            categories.forEach { category ->
                val isSelected = actived == category

                val animatedBackground by animateColorAsState(
                    targetValue = if (isSelected) Color(0xFF1AD85F) else Color(0xFF343434),
                    label = "bgAnimation"
                )

                val animatedTextColor by animateColorAsState(
                    targetValue = if (isSelected) Color.Black else Color.White,
                    label = "textAnimation"
                )

                Button(
                    onClick = { actived = category },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = animatedBackground
                    )
                ) {
                    Text(text = category, color = animatedTextColor)
                }
            }
        }
    }
}

