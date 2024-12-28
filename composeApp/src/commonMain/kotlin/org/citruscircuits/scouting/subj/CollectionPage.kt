package org.citruscircuits.scouting.subj

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
data class CollectionPage(val match: Int)

@Composable
fun CollectionPage(collectionPage: CollectionPage, onNavigateMatchEditPage: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Text(collectionPage.match.toString())

        Button(
            onClick = onNavigateMatchEditPage
        ) {
            Text("To Match Edit Page")
        }
    }
}