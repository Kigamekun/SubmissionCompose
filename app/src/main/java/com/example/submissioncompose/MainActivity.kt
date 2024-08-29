package com.example.submissioncompose

import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.submissioncompose.ui.theme.SubmissionComposeTheme
import com.example.submissioncompose.ui.viewmodel.MainViewModel
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsControllerCompat


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
                    val viewModel: MainViewModel = viewModel()
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
        Handler().postDelayed({
            splashView.animate()
                .setDuration(500)
                .withEndAction {
                    splashScreenShown = true
                    setContent {
                        SubmissionComposeTheme {
                            val viewModel: MainViewModel = viewModel()
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
