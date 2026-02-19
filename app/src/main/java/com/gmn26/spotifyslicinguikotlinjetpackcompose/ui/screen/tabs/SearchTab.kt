package com.gmn26.spotifyslicinguikotlinjetpackcompose.ui.screen.tabs

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.gmn26.spotifyslicinguikotlinjetpackcompose.R
import com.gmn26.spotifyslicinguikotlinjetpackcompose.ui.components.searchtab.CategoryCard

@Composable
fun SearchTabContent(modifier: Modifier = Modifier) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Box(modifier = Modifier
            .height(40.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(18.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .clip(RoundedCornerShape(32.dp))
                        .background(Color.White)
                )

                Text(
                    "Cari",
                    fontSize = 6.em,
                    fontWeight = FontWeight.W600,
                    color = Color.White
                )
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(7.dp))
                .background(color = Color.White)
                .padding(horizontal = 6.dp, vertical = 8.dp)
        ) {
            Row (
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Menu Button",
                    tint = Color.DarkGray
                )
                Text(
                    "Apa yang ingin kamu dengarkan?",
                    color = Color.DarkGray,
                    fontWeight = FontWeight.W800,
                    fontSize = 14.sp,
                )
            }
        }
        Text(
            "Mulai Menjalajahi",
            style = TextStyle(
                color = Color.White,
                fontWeight = FontWeight.W800,
                fontSize = 5.em,
            )
        )
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Row(
                modifier = modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                CategoryCard(label = "Musik", bgColor = Color(0xFFd04c73))
                CategoryCard(label = "Podcast", bgColor = Color(0xFF0b6623))
            }
            Row(
                modifier = modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                CategoryCard(label = "Acara Langsung", bgColor = Color(0xFF673ab7))
                CategoryCard(label = "J-Pop", bgColor = Color(0xFF023e8a))
            }
        }
    }
}