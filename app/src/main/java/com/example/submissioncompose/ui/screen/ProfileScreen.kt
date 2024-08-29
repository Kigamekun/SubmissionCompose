package com.example.submissioncompose.ui.screen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.submissioncompose.ui.screen.ui.theme.SubmissionComposeTheme

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Profile", )
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "User Name: John Doe", )
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Email: johndoe@example.com", )
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = { /* Implement Logout */ }) {
            Text(text = "Logout")
        }
    }
}