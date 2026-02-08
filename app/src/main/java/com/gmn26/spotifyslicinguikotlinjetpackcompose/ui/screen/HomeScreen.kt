package com.gmn26.spotifyslicinguikotlinjetpackcompose.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gmn26.spotifyslicinguikotlinjetpackcompose.ui.screen.tabs.HomeTabContent
import com.gmn26.spotifyslicinguikotlinjetpackcompose.ui.screen.tabs.SearchTabContent

@Composable
fun HomeScreen() {
    var activeTabIndex by rememberSaveable { mutableIntStateOf(1) }

    Scaffold(
        bottomBar = {
            Box(modifier = Modifier
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color(0x00111111),
                            Color(color = 0xEE111111),
                            Color(0xFF111111),
                        )
                    )
                )
            ) {
                NavigationBar(
                    modifier = Modifier.fillMaxWidth(),
                    containerColor = Color.Transparent,
                ) {
                    NavigationBarItem(
                        selected = activeTabIndex == 0,
                        onClick = { activeTabIndex = 0 },
                        icon = {
                            Icon(
                                Icons.Default.Home,
                                contentDescription = "Home",
                                tint = if (activeTabIndex == 0) Color.White else Color(0xAAFFFFFF),
                                modifier = Modifier
                                    .background(Color.Transparent)
                            )
                        },
                        colors = NavigationBarItemDefaults.colors(
                            indicatorColor = Color.Transparent,
                        ),
                        label = {
                            Text(
                                "Home",
                                color = if (activeTabIndex == 0) Color.White else Color(0xAAFFFFFF)
                            )
                        }
                    )
                    NavigationBarItem(
                        selected = activeTabIndex == 1,
                        onClick = { activeTabIndex = 1 },
                        icon = {
                            Icon(
                                Icons.Default.Search,
                                contentDescription = "Search",
                                tint = if (activeTabIndex == 1) Color.White else Color(0xAAFFFFFF),
                            )
                        },
                        colors = NavigationBarItemDefaults.colors(
                            indicatorColor = Color.Transparent,
                        ),
                        label = {
                            Text(
                                "Cari",
                                color = if (activeTabIndex == 0) Color.White else Color(0xAAFFFFFF)
                            )
                        }
                    )
                    NavigationBarItem(
                        selected = activeTabIndex == 2,
                        onClick = { activeTabIndex = 2 },
                        icon = {
                            Icon(
                                Icons.Default.Add,
                                contentDescription = "Add",
                                tint = if (activeTabIndex == 2) Color.White else Color(0xAAFFFFFF),
                            )
                        },
                        colors = NavigationBarItemDefaults.colors(
                            indicatorColor = Color.Transparent,
                        ),
                        label = {
                            Text(
                                "Buat",
                                color = if (activeTabIndex == 0) Color.White else Color(0xAAFFFFFF)
                            )
                        }
                    )
                }
            }
        }
    ) { innerPadding ->
        Box(modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF111111),
                        Color(0xEE111111)
                    )
                )
            )
            .padding(top = innerPadding.calculateTopPadding())
        ){
            if(activeTabIndex == 0) {
                HomeTabContent()
            } else if (activeTabIndex == 1) {
                SearchTabContent()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHomeScreen() {
    HomeScreen()
}
