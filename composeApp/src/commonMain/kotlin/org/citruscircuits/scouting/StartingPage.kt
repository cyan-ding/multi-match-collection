package org.citruscircuits.scouting

import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import kotlinx.serialization.Serializable
import org.jetbrains.compose.ui.tooling.preview.Preview

enum class Mode {
    OBJ, SUBJ
}

@Serializable
data class StartingPage(val match: Int, val mode: Mode)


@Composable

fun StartingPage() {
    MaterialTheme {
        Scaffold {
            Column() {

            }
        }
    }
}