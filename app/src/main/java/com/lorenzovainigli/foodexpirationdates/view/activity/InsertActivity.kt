package com.lorenzovainigli.foodexpirationdates.view.activity

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.lorenzovainigli.foodexpirationdates.di.AppModule
import com.lorenzovainigli.foodexpirationdates.di.DaggerAppComponent
import com.lorenzovainigli.foodexpirationdates.view.composable.activity.InsertActivityLayout
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class InsertActivity : ComponentActivity() {

    private lateinit var activity: Activity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activity = this
        val itemId = intent.extras?.getInt("ITEM_ID")
        DaggerAppComponent.builder()
            .appModule(AppModule())
            .build()
        setContent {
            InsertActivityLayout(
                context = this,
                itemId = itemId
            )
        }
    }

}