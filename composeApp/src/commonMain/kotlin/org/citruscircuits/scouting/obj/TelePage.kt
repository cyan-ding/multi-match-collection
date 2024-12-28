package org.citruscircuits.scouting.obj

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
data class TelePage(val match: Int)

@Composable
fun TelePage(telePage: TelePage, onNavigateEndgamePage: () -> Unit) {


    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Button(
            onClick = onNavigateEndgamePage
        ) {
            Text("To Endgame")
        }
    }
}