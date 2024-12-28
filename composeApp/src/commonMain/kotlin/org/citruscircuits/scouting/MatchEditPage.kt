package org.citruscircuits.scouting

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import kotlinx.serialization.Serializable

@Serializable
data class MatchEditPage(val match: Int)

@Composable
fun MatchEditPage(matchEditPage: MatchEditPage, onNavigateQrPage: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Button(
            onClick = onNavigateQrPage
        ) {
            Text("To QR Page")
        }
    }
}