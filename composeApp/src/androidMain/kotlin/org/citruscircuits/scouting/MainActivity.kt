package org.citruscircuits.scouting

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.citruscircuits.scouting.obj.AutoPage
import org.citruscircuits.scouting.obj.EndgamePage
import org.citruscircuits.scouting.obj.TelePage
import org.citruscircuits.scouting.subj.CollectionPage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val navController = rememberNavController()
            // Nav graph for navigation
            NavHost(navController = navController, startDestination = StartingPage(1, Mode.OBJ)) {
                composable<AutoPage> { AutoPage( /* ... */) }
                composable<TelePage> { TelePage( /* ... */) }
                composable<EndgamePage> { EndgamePage() }
                composable<QrPage> { QrPage() }
                composable<MatchEditPage> { MatchEditPage() }
                // Subj
                composable<CollectionPage> { CollectionPage() }
                // Add more destinations similarly.
            }
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    StartingPage()
}