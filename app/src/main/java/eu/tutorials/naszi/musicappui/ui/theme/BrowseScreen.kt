package eu.tutorials.naszi.musicappui.ui.theme

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import eu.tutorials.naszi.musicappui.R

@Composable
fun BrowseScreen() {
    val categories = listOf(
        "Hits",
        "Happy",
        "Workout",
        "Running",
        "TGIF",
        "Yoga"
    )
    LazyVerticalGrid(columns = GridCells.Fixed(2)) {
        items(categories) {item ->
            BrowserItem(cat = item, drawable = R.drawable.ic_baseline_open_in_browser_24)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BrowseView() {
    BrowseScreen()
}