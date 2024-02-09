plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}



android {
    namespace = "com.example.myteam"
    compileSdk = 34


    defaultConfig {
        applicationId = "com.example.myteam"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }



    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    //AppNext
    // For the Interstitial and Rewarded/Fullscreen video ad unit:
    implementation ("com.appnext.sdk:ads:2.7.1.473")
    // For the Banners ad unit:
    implementation ("com.appnext.sdk:banners2.5.0:")
    // For the New Native Ads and Suggested Apps ad unit:
    implementation ("com.appnext.sdk:native-ads2:2.5.0")
    // For the Actions ad unit:
    //implementation ("com.appnext.sdk:actions:2")
    implementation ("com.app next.sdk:sdk:2.5.0")
    // For the MAX-applovin Adapter
    implementation ("com.appnext.sdk.adapters:max-ads:2.7.1.473")
    implementation("com.google.android.gms:play-services-ads:22.6.0")
        implementation ("com.google.android.gms:play-services-ads-identifier:18.0.1")
    implementation ("androidx.annotation:annotation:1.7.1") // Mandatory
    implementation ("androidx.work:work-runtime:2.9.0")
    // Mandatory
    implementation ("com.github.bumptech.glide:glide:4.12.0")
    implementation("com.android.support:support-annotations:28.0.0")// Mandatory
    annotationProcessor ("com.github.bumptech.glide:compiler:4.11.0")
    implementation("com.applovin:applovin-sdk:12.1.0")


    implementation ("androidx.navigation:navigation-compose:2.7.6")

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
    implementation("androidx.activity:activity-compose:1.8.2")
    implementation(platform("androidx.compose:compose-bom:2023.08.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.08.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
}
