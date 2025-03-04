package eu.tutorials.naszi.musicappui.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import eu.tutorials.naszi.musicappui.Lib
import eu.tutorials.naszi.musicappui.libraries

@Composable
fun LibraryView() {
    LazyColumn() {
        items(libraries) {lib ->
            LibItem(lib = lib)
        }
    }
}

@Composable
fun LibItem(lib: Lib) {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row {
                Icon(
                    painter = painterResource(id = lib.icon),
                    contentDescription = lib.name,
                    modifier = Modifier.padding(end = 8.dp)
                )
                Text(text = lib.name)
            }
            Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight, contentDescription = null)
        }
        Divider()
    }
}