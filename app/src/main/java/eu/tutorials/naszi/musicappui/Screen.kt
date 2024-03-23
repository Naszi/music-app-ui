package eu.tutorials.naszi.musicappui

import androidx.annotation.DrawableRes

sealed class Screen(
    val title: String,
    val route: String
) {
    sealed class BottomScreen(
        val bTitle: String,
        val bRoute: String,
        @DrawableRes val icon: Int
    ): Screen(bTitle, bRoute) {
        object Home: BottomScreen(
            bTitle = "Home",
            bRoute = "home",
            icon = R.drawable.ic_baseline_home_24
        )
        object Library: BottomScreen(
            bTitle = "Library",
            bRoute = "library",
            icon = R.drawable.ic_baseline_library_music_24
        )
        object Browse: BottomScreen(
            bTitle = "Browse",
            bRoute = "browse",
            icon = R.drawable.ic_baseline_open_in_browser_24
        )
    }

    sealed class DrawerScreen(
        val dTitle: String,
        val dRoute: String,
        @DrawableRes val icon: Int
    ): Screen(dTitle, dRoute) {
        object Account: DrawerScreen(
            "Account",
            "account",
            R.drawable.ic_account
        )
        object Subscription: DrawerScreen(
            "Subscription",
            "subscribe",
            R.drawable.ic_subscribe
        )
        object AddAccount: DrawerScreen(
            "Add Account",
            "add_account",
            R.drawable.ic_baseline_person_add_alt_1_24
        )
    }
}

val screensInBottom = listOf(
    Screen.BottomScreen.Home,
    Screen.BottomScreen.Browse,
    Screen.BottomScreen.Library
)

val screensInDrawer = listOf(
    Screen.DrawerScreen.Account,
    Screen.DrawerScreen.Subscription,
    Screen.DrawerScreen.AddAccount
)