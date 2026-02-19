package com.gmn26.spotifyslicinguikotlinjetpackcompose.ui.screen.tabs

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.gmn26.spotifyslicinguikotlinjetpackcompose.R
import com.gmn26.spotifyslicinguikotlinjetpackcompose.ui.components.Album
import com.gmn26.spotifyslicinguikotlinjetpackcompose.ui.components.ForYouNewRelease
import com.gmn26.spotifyslicinguikotlinjetpackcompose.ui.components.MiniAlbumGrid
import com.gmn26.spotifyslicinguikotlinjetpackcompose.ui.components.SponsoredRecommendation
import com.gmn26.spotifyslicinguikotlinjetpackcompose.ui.components.TopCategoryNav

@Composable
fun HomeTabContent(modifier: Modifier = Modifier) {
    val dummyAlbums = listOf(
        Album(title = "VANDAL (DELUXE)", R.drawable.vandal_album_pict),
        Album(title = "Banda Neira", R.drawable.banda_neira_album_pict),
        Album(title = "Basboi", R.drawable.basboi_album_pict),
        Album(title = "Lagu yang Disukai", R.drawable.liked_song_album_pict),
        Album(title = "Rumah Terakhir", R.drawable.rumah_terakhir_album_pict),
        Album(title = "Kalkulasi Berat", R.drawable.kalkulasi_berat_album_pict),
        Album(title = "Kartun Minggu Pagi", R.drawable.kartun_minggu_pagi_album_pict),
        Album(title = "Jason Ranti", R.drawable.jason_ranti_album_pict),
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