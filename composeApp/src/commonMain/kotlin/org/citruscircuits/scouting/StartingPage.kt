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
import org.citruscircuits.scouting.data.Mode


@Serializable
data class StartingPage(val match: Int, val mode: Mode)


@Composable

fun StartingPage(startingPage: StartingPage, onNavigateAutoPage: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(startingPage.match.toString())

        Button(
            onClick = onNavigateAutoPage
        ) {
            Text("To Auto")
        }
    }
}