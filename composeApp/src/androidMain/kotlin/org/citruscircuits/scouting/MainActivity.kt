package org.citruscircuits.scouting

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import org.citruscircuits.scouting.data.MainActivityViewModel
import org.citruscircuits.scouting.obj.AutoPage
import org.citruscircuits.scouting.obj.EndgamePage
import org.citruscircuits.scouting.obj.TelePage
import org.citruscircuits.scouting.subj.CollectionPage

class MainActivity : ComponentActivity() {
    private val viewModel: MainActivityViewModel by viewModels()


    @SuppressLint("WrongNavigateRouteType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val navController = rememberNavController()
            // Nav graph for navigation
            NavHost(navController = navController, startDestination = ModeSelectionPage(1)) {

                composable<ModeSelectionPage> { backStackEntry ->
                    val page: ModeSelectionPage = backStackEntry.toRoute()

                    ModeSelectionPage(
                        onModeSelect = { viewModel._mode.value = it },
                        onNavigateStartingPage = {

                            navController.navigate(
                                route = StartingPage(
                                    page.match,
                                    viewModel.mode.value
                                )
                            )
                        }
                    )
                }

                composable<StartingPage> { backStackEntry ->
                    val page: StartingPage = backStackEntry.toRoute()
                    StartingPage(startingPage = page, onNavigateAutoPage = {
                        navController.navigate(route = AutoPage(page.match))
                    }
                    )
                }
                composable<AutoPage> { backStackEntry ->
                    val page: AutoPage = backStackEntry.toRoute()
                    AutoPage(autoPage = page, onNavigateToTelePage = {
                        navController.navigate(route = TelePage(page.match))
                    }
                    )
                }
                composable<TelePage> { backStackEntry ->
                    val page: TelePage = backStackEntry.toRoute()
                    TelePage(telePage = page, onNavigateEndgamePage = {
                        navController.navigate(route = EndgamePage(page.match))
                    }
                    )
                }
                composable<EndgamePage> { backStackEntry ->
                    val page: EndgamePage = backStackEntry.toRoute()
                    EndgamePage(endgamePage = page, onNavigateMatchEditPage = {
                        navController.navigate(route = MatchEditPage(page.match))
                    }
                    )
                }
                composable<MatchEditPage> { backStackEntry ->
                    val page: MatchEditPage = backStackEntry.toRoute()
                    MatchEditPage(matchEditPage = page, onNavigateQrPage = {
                        navController.navigate(route = QrPage(page.match))
                    }
                    )
                }
                composable<QrPage> { backStackEntry ->
                    val page: QrPage = backStackEntry.toRoute()
                    QrPage(qrPage = page, onProceed = {
                        navController.navigate(
                            route = StartingPage(
                                page.match,
                                viewModel.mode.value
                            )
                        )
                    }
                    )
                }

                // Subj
                composable<CollectionPage> { backStackEntry ->
                    val page: CollectionPage = backStackEntry.toRoute()
                    CollectionPage(collectionPage = page, onNavigateMatchEditPage = {
                        navController.navigate(route = MatchEditPage(page.match))
                    }
                    )
                }
                // Add more destinations similarly.
            }
        }
    }
}
