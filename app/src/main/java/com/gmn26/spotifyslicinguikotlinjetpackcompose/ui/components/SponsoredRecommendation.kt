package com.gmn26.spotifyslicinguikotlinjetpackcompose.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SponsoredRecommendation() {
    Column(
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(
            "Vibe momen tertentu",
            color = Color(0xFFFFFFFF),
            fontSize = 20.sp,
            fontWeight = FontWeight.W700,
        )
        Text(
            "Rekomendasi bersponsor",
            fontSize = 10.sp,
            color = Color(0xFFBBBBBB)
        )
        Row (
            modifier = Modifier
                .height(150.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(color = Color(0X33FFFFFF))
        ) {
            Box(
                modifier = Modifier
                    .weight(2f)
                    .fillMaxHeight()
                    .clip(RoundedCornerShape(4.dp))
                    .background(color = Color(0xFFFFFFFF))
            )
            Column (
                modifier = Modifier
                    .weight(3f)
            ) {  }
        }
    }
}