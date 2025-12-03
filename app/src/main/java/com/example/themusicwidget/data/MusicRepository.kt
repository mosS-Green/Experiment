package com.example.themusicwidget.data

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MusicRepository @Inject constructor(private val musicDao: MusicDao) {
    val allMusic: Flow<List<MusicEntity>> = musicDao.getAllMusic()

    suspend fun insert(music: MusicEntity) {
        musicDao.insertMusic(music)
    }

    suspend fun update(music: MusicEntity) {
        musicDao.updateMusic(music)
    }
}
