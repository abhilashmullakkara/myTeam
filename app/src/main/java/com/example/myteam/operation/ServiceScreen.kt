package com.example.myteam.operation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun ServiceScreen(navController: NavController){
    Surface(color = Color(0xFFECF3ED), modifier = Modifier.fillMaxSize()) {
        Column {

        Button(
            onClick = {
                navController.popBackStack("OpeningWindowScreen", inclusive = false)
            },
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 25.dp,
                pressedElevation = 2.dp,
                disabledElevation = 20.dp
            ),
            modifier = Modifier
                .width(70.dp)
                .height(40.dp),
            shape = CircleShape,
            border = BorderStroke(width = 1.dp, color = Color.White),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFFF6F00),
                contentColor = Color.White
            )
        ) {
            Icon(Icons.Outlined.ArrowBack, tint = Color.White,
                contentDescription = "Localized description")
        }






    }

    }
}


@Preview(showBackground = true)
@Composable
fun ServiceScreenPreview() {
    ServiceScreen(navController = rememberNavController())
}