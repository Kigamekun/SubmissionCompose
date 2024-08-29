package com.example.submissioncompose

import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.submissioncompose.ui.theme.SubmissionComposeTheme
import android.os.Handler
import android.os.Looper


class MainActivity : ComponentActivity() {
    private val tDelay = 3000L
    private var splashScreenShown = false


    @RequiresApi(Build.VERSION_CODES.S)
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        if (!splashScreenShown) {
            showSplashScreen()
        } else {
            setContent {
                SubmissionComposeTheme {
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                    ) {
                        HeyCow()
                    }
                }
            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.S)
    private fun showSplashScreen() {
        setContentView(R.layout.activity_main)
        val splashView: View = findViewById(R.id.main)
        Handler(Looper.getMainLooper()).postDelayed({
            splashView.animate()
                .setDuration(500)
                .withEndAction {
                    splashScreenShown = true
                    setContent {
                        SubmissionComposeTheme {
                            Surface(
                                modifier = Modifier.fillMaxSize(),
                                color = MaterialTheme.colorScheme.background
                            ) {
                                HeyCow()
                            }
                        }
                    }
                }
                .start()
        }, tDelay)
    }
}
