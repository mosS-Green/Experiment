package com.example.themusicwidget.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.themusicwidget.data.MusicEntity
import com.example.themusicwidget.viewmodel.MusicViewModel

@Composable
fun MainScreen(viewModel: MusicViewModel) {
    val musicList by viewModel.musicList.collectAsStateWithLifecycle()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "My Music",
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(musicList) { music ->
                MusicItem(music)
            }
            if (musicList.isEmpty()) {
                item {
                    Text("No music found. Add some to the database.")
                    Button(onClick = {
                        viewModel.addMusic(
                            MusicEntity(
                                title = "Demo Song ${System.currentTimeMillis()}",
                                artist = "Unknown Artist",
                                duration = 180000,
                                progress = 0,
                                uri = ""
                            )
                        )
                    }) {
                        Text("Add Demo Song")
                    }
                }
            }
        }
    }
}

@Composable
fun MusicItem(music: MusicEntity) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(text = music.title, style = MaterialTheme.typography.titleMedium)
                Text(text = music.artist, style = MaterialTheme.typography.bodyMedium)
            }
            IconButton(onClick = { /* Play */ }) {
                Icon(Icons.Default.PlayArrow, contentDescription = "Play")
            }
        }
    }
}
