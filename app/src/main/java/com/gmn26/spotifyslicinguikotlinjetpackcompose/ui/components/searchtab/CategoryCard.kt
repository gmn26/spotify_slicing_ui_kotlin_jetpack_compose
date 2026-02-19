package com.gmn26.spotifyslicinguikotlinjetpackcompose.ui.components.searchtab

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.gmn26.spotifyslicinguikotlinjetpackcompose.R

@Composable
fun RowScope.CategoryCard(
    label: String,
    bgColor: Color
) {
    Box(
        modifier = Modifier
            .weight(1f)
            .height(90.dp)
            .clip(RoundedCornerShape(4.dp))
            .background(color = bgColor)
            .padding(8.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.jason_ranti_album_pict),
            contentDescription = "Album Picture",
            modifier = Modifier
                .size(80.dp)
                .align(Alignment.BottomEnd)
                .offset(x = 10.dp, y = 20.dp)
                .rotate(30f)
                .clip(RoundedCornerShape(6.dp)),
            contentScale = ContentScale.Crop
        )
        Text(
            label,
            color = Color.White,
            fontWeight = FontWeight.W800
        )
    }
}