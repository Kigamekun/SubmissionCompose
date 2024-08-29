package com.example.submissioncompose.ui.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.submissioncompose.data.Cows
import com.example.submissioncompose.data.CowsData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch


class MainViewModel : ViewModel() {
    private val _favoriteCows = MutableStateFlow<Set<Int>>(emptySet())
    val favoriteCows: StateFlow<Set<Int>> = _favoriteCows

    // Example Cows list; in a real app, this might come from a repository or data source
    private val allCows = CowsData.list

    // Get favorite Cows based on their IDs
    fun getFavoriteCows(): List<Cows> {
        return allCows.filter { cow -> _favoriteCows.value.contains(cow.id) }
    }

    fun toggleFavorite(cow: Cows) {
        _favoriteCows.value = if (_favoriteCows.value.contains(cow.id)) {
            _favoriteCows.value - cow.id
        } else {
            _favoriteCows.value + cow.id
        }
    }
}

