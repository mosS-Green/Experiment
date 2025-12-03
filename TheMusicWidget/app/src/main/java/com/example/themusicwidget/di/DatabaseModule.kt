package com.example.themusicwidget.di

import android.content.Context
import androidx.room.Room
import com.example.themusicwidget.data.MusicDao
import com.example.themusicwidget.data.MusicDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): MusicDatabase {
        return Room.databaseBuilder(
            context,
            MusicDatabase::class.java,
            "music_database"
        ).build()
    }

    @Provides
    fun provideMusicDao(database: MusicDatabase): MusicDao {
        return database.musicDao()
    }
}
