package eu.tutorials.naszi.musicappui

import androidx.annotation.DrawableRes

data class Lib(
    @DrawableRes val icon: Int,
    val name: String
)

val libraries = listOf<Lib>(
    Lib(
        R.drawable.ic_baseline_queue_music_24,
        "Playlist"
    ),
    Lib(
        R.drawable.ic_baseline_mic_24,
        "Artists"
    ),
    Lib(
        R.drawable.ic_baseline_album_24,
        "Album"
    ),
    Lib(
        R.drawable.ic_baseline_music_note_24,
        "Songs"
    ),
    Lib(
        R.drawable.ic_baseline_equalizer_24,
        "Genre"
    )

)
