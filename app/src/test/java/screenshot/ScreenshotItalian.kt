package screenshot

import app.cash.paparazzi.DeviceConfig.Companion.PIXEL_5
import app.cash.paparazzi.Paparazzi
import org.junit.Rule
import org.junit.Test

class ScreenshotItalian : Screenshot() {

    @get:Rule
    val paparazzi = Paparazzi(
        deviceConfig = PIXEL_5.copy(
            locale = "it"
        ),
        theme = "android:Theme.Material.Light.NoActionBar"
    )

    @Test
    fun screen1MainActivity() {
        super.screen1MainActivity(paparazzi)
    }

    @Test
    fun screen2InsertActivity() {
        super.screen2InsertActivity(paparazzi)
    }

    @Test
    fun screen3SettingsActivity() {
        super.screen3SettingsActivity(paparazzi)
    }

    @Test
    fun screen4InfoActivity() {
        super.screen4InfoActivity(paparazzi)
    }

}