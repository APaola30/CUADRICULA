package com.example.cuadricula.data
import TopicCard
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CoursesGrid(topics: List<Topic>, modifier: Modifier = Modifier) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),       // 2 columnas
        contentPadding = PaddingValues(8.dp),
        modifier = modifier
    ) {
        items(topics) { topic ->
            TopicCard(topic = topic, modifier = Modifier.padding(8.dp))
        }
    }
}
