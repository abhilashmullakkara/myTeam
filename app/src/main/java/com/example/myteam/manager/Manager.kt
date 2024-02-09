package com.example.myteam.manager

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myteam.OpeningWindowScreen
import com.example.myteam.operation.DonationScreen
import com.example.myteam.operation.EventScreen
import com.example.myteam.operation.GalleryScreen
import com.example.myteam.operation.ServiceScreen

@Composable
fun Manager(){
    val navController = rememberNavController()
    NavHost(navController, startDestination = "OpeningWindowScreen") {
        composable("OpeningWindowScreen") {
            OpeningWindowScreen(navController)
        }
        composable("ServiceScreen") {
            ServiceScreen(navController )
        }
        composable("GalleryScreen"){
            GalleryScreen(navController)
        }
        composable("EventScreen"){
            EventScreen(navController )
        }
        composable("DonationScreen"){
            DonationScreen(navController)
        }
    }
}