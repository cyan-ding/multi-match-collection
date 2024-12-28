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
data class ModeSelectionPage(val match: Int)

@Composable

fun ModeSelectionPage(onModeSelect: (Mode) -> Unit, onNavigateStartingPage: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally ) {
        Button(onClick = { onModeSelect(Mode.OBJ) }) {
            Text("Objective Collection")
        }
        Button(onClick = { onModeSelect(Mode.SUBJ) }) {
            Text("Subjective Collection")
        }

        Button(onClick = onNavigateStartingPage) {
            Text("Proceed")
        }
    }
}