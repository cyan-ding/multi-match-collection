package org.citruscircuits.scouting.data

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainActivityViewModel: ViewModel() {
    var _mode = MutableStateFlow(Mode.OBJ)
    val mode = _mode.asStateFlow()
}




enum class Mode {
    OBJ, SUBJ
}