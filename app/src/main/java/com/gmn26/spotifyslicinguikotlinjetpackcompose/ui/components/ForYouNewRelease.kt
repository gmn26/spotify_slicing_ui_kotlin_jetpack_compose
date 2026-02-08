package com.gmn26.spotifyslicinguikotlinjetpackcompose.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ForYouNewRelease() {
    Column (
        verticalArrangement = Arrangement.spacedBy(10.dp),
    ) {
        Text(
            "Rilis Baru Untukmu",
            color = Color(0xFFFFFFFF),
            fontSize = 20.sp,
            fontWeight = FontWeight.W700,
        )
        Row(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()),
        ) {
            ForYouNewReleaseItem()
            ForYouNewReleaseItem()
            ForYouNewReleaseItem()
            ForYouNewReleaseItem()
            ForYouNewReleaseItem()
        }
    }
}

@Composable
fun ForYouNewReleaseItem() {
    Column (
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier
            .width(140.dp)
    ) {
        Box(modifier = Modifier
            .height(140.dp)
            .width(140.dp)
            .clip(RoundedCornerShape(4.dp))
            .background(
                color = Color(0xFFFFFFFF)
            )
        )
        Text("Pelari Kalcer",
            color = Color(0xFFFFFFFF),
            fontWeight = FontWeight.W500,
        )
        Text("Sastra Silalahi, Mamang Kesbor",
            color = Color(0xFFBBBBBB)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewForYouNewRelease() {
    ForYouNewRelease()
}
