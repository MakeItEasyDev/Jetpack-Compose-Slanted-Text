package com.jetpack.slantedtextcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Slider
import androidx.compose.material.Surface
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jetpack.slantedtextcompose.ui.theme.Purple500
import com.jetpack.slantedtextcompose.ui.theme.SlantedTextComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SlantedTextComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Scaffold(
                        topBar = {
                            CenterAlignedTopAppBar(
                                title = {
                                    Text(
                                        text = "Slanted Text",
                                        color = Color.White,
                                        fontSize = 20.sp
                                    )
                                },
                                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(Purple500)
                            )
                        }
                    ) {
                        var width by remember { mutableStateOf(0.2f) }

                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(16.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.SpaceEvenly
                            ) {
                                SlantedText(
                                    text = "Compose",
                                    textSize = 15.sp,
                                    thickness = (width * 100f).dp,
                                    padding = 30.dp,
                                    slantedMode = SlantedMode.TOP_LEFT,
                                    bold = false
                                ) {
                                   Box(
                                       modifier = Modifier
                                           .size(150.dp, 100.dp)
                                           .background(Color.Black)
                                   )
                                }
                                Spacer(modifier = Modifier.padding(10.dp))
                                SlantedText(
                                    text = "Make it",
                                    textSize = 15.sp,
                                    thickness = (width * 100f).dp,
                                    padding = 30.dp,
                                    slantedMode = SlantedMode.TOP_RIGHT,
                                    bold = false
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .size(150.dp, 100.dp)
                                            .background(Color.Black)
                                    )
                                }
                            }
                            Spacer(modifier = Modifier.padding(10.dp))
                            Row(
                                horizontalArrangement = Arrangement.SpaceEvenly
                            ) {
                                SlantedText(
                                    text = "Jetpack",
                                    textSize = 15.sp,
                                    thickness = (width * 100f).dp,
                                    padding = 30.dp,
                                    slantedMode = SlantedMode.BOTTOM_LEFT,
                                    bold = false
                                ) {
                                   Box(
                                       modifier = Modifier
                                           .size(150.dp, 100.dp)
                                           .background(Color.Black)
                                   )
                                }
                                Spacer(modifier = Modifier.padding(10.dp))
                                SlantedText(
                                    text = "Easy",
                                    textSize = 15.sp,
                                    thickness = (width * 100f).dp,
                                    padding = 30.dp,
                                    slantedMode = SlantedMode.BOTTOM_RIGHT,
                                    bold = false
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .size(150.dp, 100.dp)
                                            .background(Color.Black)
                                    )
                                }
                            }

                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(16.dp),
                                modifier = Modifier.padding(top = 20.dp)
                            ) {
                                Text(text = "Thickness: ${(width * 100f).toInt()} dp")
                                Slider(value = width, onValueChange = { width = it })
                            }
                        }
                    }
                }
            }
        }
    }
}























