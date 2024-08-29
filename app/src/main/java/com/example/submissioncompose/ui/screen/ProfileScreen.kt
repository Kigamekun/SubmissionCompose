package com.example.submissioncompose.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.submissioncompose.R

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.team_reksa),
            modifier = Modifier
                .fillMaxWidth()
                .padding(1.dp)
                .clip(RoundedCornerShape(16.dp)),
            contentDescription = "cow_card",
            contentScale = ContentScale.Crop
        )
        Text(text = "Profile" )
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Name : Reksa Prayoga Syahputra" )
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Email: reksa.prayoga1012@gmail.com" )
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = { /* Implement Logout */ }) {
            Text(text = "Logout")
        }
    }
}