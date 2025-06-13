package com.evanpratama0137.digiperpus

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.evanpratama0137.digiperpus.ui.screen.MainScreen
import com.evanpratama0137.digiperpus.ui.theme.DigiPerpusTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DigiPerpusTheme {
                MainScreen()
            }
        }
    }
}