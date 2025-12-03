package com.example.themusicwidget.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface MusicDao {
    @Query("SELECT * FROM music_table ORDER BY id DESC")
    fun getAllMusic(): Flow<List<MusicEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMusic(music: MusicEntity)

    @Update
    suspend fun updateMusic(music: MusicEntity)
    
    @Query("SELECT * FROM music_table WHERE id = :id")
    suspend fun getMusicById(id: Int): MusicEntity?
}
