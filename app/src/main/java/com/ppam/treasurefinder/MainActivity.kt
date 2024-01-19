package com.ppam.treasurefinder

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ppam.treasurefinder.ui.theme.TreasureFinderTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TreasureFinderTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun CaptainGame() {
    val treasureFound = remember { mutableStateOf(0) }
    val direction = remember { mutableStateOf("North") }

    Column {
        Text(text = "Treasure Found: ${treasureFound.value}")
        Text(text = "Current Direction: ${direction.value}")


    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TreasureFinderTheme {
        Greeting("Android")
    }
}