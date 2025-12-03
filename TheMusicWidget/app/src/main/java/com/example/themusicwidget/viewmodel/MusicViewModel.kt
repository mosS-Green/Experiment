package com.example.themusicwidget.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.themusicwidget.data.MusicEntity
import com.example.themusicwidget.data.MusicRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MusicViewModel @Inject constructor(
    private val repository: MusicRepository
) : ViewModel() {

    val musicList: StateFlow<List<MusicEntity>> = repository.allMusic
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    fun addMusic(music: MusicEntity) {
        viewModelScope.launch {
            repository.insert(music)
        }
    }

    fun updateProgress(music: MusicEntity, newProgress: Long) {
        viewModelScope.launch {
            repository.update(music.copy(progress = newProgress))
        }
    }
}
