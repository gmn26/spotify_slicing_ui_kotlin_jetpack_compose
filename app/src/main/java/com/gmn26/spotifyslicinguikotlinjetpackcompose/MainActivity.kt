package com.gmn26.spotifyslicinguikotlinjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.gmn26.spotifyslicinguikotlinjetpackcompose.ui.screen.HomeScreen
import com.gmn26.spotifyslicinguikotlinjetpackcompose.ui.theme.SpotifySlicingUIKotlinJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SpotifySlicingUIKotlinJetpackComposeTheme {
                HomeScreen()
            }
        }
    }
}