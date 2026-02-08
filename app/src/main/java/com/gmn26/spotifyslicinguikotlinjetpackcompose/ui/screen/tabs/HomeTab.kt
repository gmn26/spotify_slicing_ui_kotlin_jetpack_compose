package com.gmn26.spotifyslicinguikotlinjetpackcompose.ui.screen.tabs

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.gmn26.spotifyslicinguikotlinjetpackcompose.ui.components.Album
import com.gmn26.spotifyslicinguikotlinjetpackcompose.ui.components.ForYouNewRelease
import com.gmn26.spotifyslicinguikotlinjetpackcompose.ui.components.MiniAlbumGrid
import com.gmn26.spotifyslicinguikotlinjetpackcompose.ui.components.SponsoredRecommendation
import com.gmn26.spotifyslicinguikotlinjetpackcompose.ui.components.TopCategoryNav

@Composable
fun HomeTabContent(modifier: Modifier = Modifier) {
    val dummyAlbums = listOf(
        Album(title = "VANDAL (DELUXE)"),
        Album(title = "Banda Neira"),
        Album(title = "Basboi"),
        Album(title = "Lagu yang Disukai"),
        Album(title = "Rumah Terakhir"),
        Album(title = "Kalkulasi Berat"),
        Album(title = "Kartun Minggu Pagi"),
        Album(title = "Jason Ranti"),
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item { TopCategoryNav() }
        item { MiniAlbumGrid(albums = dummyAlbums) }
        item { SponsoredRecommendation() }
        items(2) { ForYouNewRelease() }
    }
}