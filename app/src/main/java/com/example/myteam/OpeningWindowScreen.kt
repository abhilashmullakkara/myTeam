package com.example.myteam


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardDefaults.cardElevation
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.appnext.base.Appnext
import com.example.myteam.manager.Manager
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView

@Composable
fun MyApp(){
    //OpeningWindowScreen(navController)
    Manager()
}
@Composable
fun OpeningWindowScreen(navController: NavController) {

    Surface(color = Color(0xFFECF3ED), modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.padding(start=10.dp), verticalArrangement = Arrangement.Top,
            horizontalAlignment =Alignment.Start)
        {


            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF61B767),//0xFF2CF13A
                ),
                border = BorderStroke(width = 1.dp, color = Color.White) //Color(0xFF53EB5D))

                ,
                content = {
                    Row {
                        Spacer(modifier = Modifier.fillMaxWidth(0.2f))
                        Text(
                            "Welcome to the world ",
                            color = Color.White,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.SemiBold,
                            textAlign = TextAlign.Center
                        )
                    }

                },
                elevation = cardElevation(
                    defaultElevation = 25.dp,
                    pressedElevation = 2.dp,
                    disabledElevation = 20.dp

                ),
                shape = CircleShape,
                modifier = Modifier
                    .fillMaxWidth(1.0f)
                    .height(50.dp)
                    .padding(start = 10.dp, top = 20.dp, end = 10.dp)
                // .shadow(elevation = 5.dp, shape = RectangleShape, clip = true)
            )

            Spacer(modifier = Modifier.height(10.dp))
            Row(modifier = Modifier.fillMaxWidth()) {
                Column (
                    modifier = Modifier.weight(1f),
                     horizontalAlignment  = Alignment.CenterHorizontally

                ){


                    Button(
                        onClick = {
                            navController.navigate("ServiceScreen")
                        },
                        elevation = ButtonDefaults.buttonElevation(
                            defaultElevation = 25.dp,
                            pressedElevation = 2.dp,
                            disabledElevation = 20.dp

                        ),
                        modifier = Modifier
                            .width(90.dp)
                            .height(90.dp),
                        // .padding(start = 10.dp, top = 20.dp),
                        //shape = CircleShape,
                        border = BorderStroke(width = 2.dp, color = Color.White),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFFF6F00),
                        )
                    ) {
                       // Icon(
                            Icon(painter = painterResource(id = R.drawable.baseline_kitesurfing_24),
                                    modifier = Modifier.size(50.dp),
                                contentDescription ="service" )
                           // contentDescription = "Localized description"
                       // )
                        // Text("Service", fontSize = 12.sp,color= Color.White)
                    }
                    Text(
                        "Service",
                        modifier = Modifier.padding(start = 10.dp),
                        color = Color.Black,
                        fontSize = 14.sp
                    )
                }
                Spacer(modifier = Modifier.width(10.dp))
                Column(
                    modifier = Modifier.weight(1f),
                    horizontalAlignment  = Alignment.CenterHorizontally
                ) {


                Button(
                    onClick = {
                        navController.navigate("GalleryScreen")
                    },
                    elevation = ButtonDefaults.buttonElevation(
                        defaultElevation = 25.dp,
                        pressedElevation = 2.dp,
                        disabledElevation = 20.dp

                    ),
                    modifier = Modifier
                        .width(90.dp)
                        .height(90.dp),
                    // .padding(start = 10.dp, top = 20.dp),
                    //shape = CircleShape,
                    border = BorderStroke(width = 2.dp, color = Color.White),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFFF6F00),
                    )
                ) {
                   // Text("Gallary", fontSize = 13.sp, color = Color.White)
                    Icon(painter = painterResource(id = R.drawable.baseline_browse_gallery_24),
                        modifier = Modifier.size(50.dp),
                        contentDescription ="Gallery" )
                }
                    Text("Gallery", modifier = Modifier.padding(start=10.dp), color = Color.Black, fontSize = 14.sp)
                }
                Spacer(modifier = Modifier.width(10.dp))
                Column (
                    modifier = Modifier.weight(1f),
                    horizontalAlignment  = Alignment.CenterHorizontally
                ){


                    Button(
                        onClick = {
                            navController.navigate("DonationScreen")
                        },
                        elevation = ButtonDefaults.buttonElevation(
                            defaultElevation = 25.dp,
                            pressedElevation = 2.dp,
                            disabledElevation = 20.dp

                        ),
                        modifier = Modifier
                            .width(90.dp)
                            .height(90.dp),
                        // .padding(start = 10.dp, top = 20.dp),
                        //shape = CircleShape,
                        border = BorderStroke(width = 2.dp, color = Color.White),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFFF6F00),
                        )
                    ) {
                       // Text("Test", fontSize = 13.sp, color = Color.White)
                        Icon(painter = painterResource(id = R.drawable.baseline_deck_24),
                            modifier = Modifier.size(50.dp),
                            contentDescription ="Donation" )
                    }
                    Text("Donation", modifier = Modifier.padding(start=10.dp), color = Color.Black, fontSize = 14.sp)
                }

            }
            Spacer(modifier = Modifier.height(10.dp))
Divider(thickness = 3.dp, color = Color.LightGray)
            Column (
                modifier = Modifier.weight(1f).padding(start=10.dp,top=15.dp),
                horizontalAlignment  = Alignment.CenterHorizontally
            ){


                Button(
                    onClick = {
                         navController.navigate("EventScreen")
                    },
                    elevation = ButtonDefaults.buttonElevation(
                        defaultElevation = 25.dp,
                        pressedElevation = 2.dp,
                        disabledElevation = 20.dp

                    ),
                    modifier = Modifier
                        .width(90.dp)
                        .height(90.dp),
                    border = BorderStroke(width = 2.dp, color = Color.White),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFFF6F00),
                    )
                ) {
                    Icon(painter = painterResource(id = R.drawable.baseline_event_seat_24),
                        modifier = Modifier.size(50.dp),
                        contentDescription ="Events" )
                }
                Text("Events", modifier = Modifier.padding(start=10.dp), color = Color.Black, fontSize = 14.sp)
            }


     }




    }
}

@Preview(showBackground = true)
@Composable
fun OpeningWindowScreenPreview() {
   OpeningWindowScreen(navController =rememberNavController())
}


@Composable
fun AppnextBannerAdView(isTest: Boolean = true) {
    val unitId = if (isTest) "YOUR_TEST_UNIT_ID" else "YOUR_PRODUCTION_UNIT_ID"
    AndroidView(factory = { context ->
        val adView = AdView(context)
        val adRequest = AdRequest.Builder().build()

        // Initialize Appnext SDK (if necessary)
        Appnext.init(context)

        // Load ad (replace this line with Appnext ad loading logic)
        adView.loadAd(adRequest)
        adView
    })
}



//@Composable
//fun AppnextAd(context: Context) {
//    // Create an Interstitial object
//    val interstitial = Interstitial(context)
//
//    // Configure the ad
//    val config = InterstitialConfig()
//    interstitial.config = config
//
//    // Set an InterstitialListener to handle ad events
//    interstitial.setOnAdListener(object : InterstitialListener {
//        override fun onAdLoaded() {
//            // Ad loaded successfully, display the ad
//            interstitial.showAd()
//        }
//
//        override fun onAdOpened() {
//            // Ad opened
//        }
//
//        override fun onAdClicked() {
//        }
//
//        override fun onAdClosed() {
//            // Ad closed
//        }
//
//        override fun onError(error: String?) {
//            // Error loading or displaying ad
//        }
//    })
//
//    // Load the ad
//    interstitial.loadAd()
//
//    // Display the ad using AndroidView
//    AndroidView(factory = { interstitial })
//}


