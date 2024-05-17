plugins {
    id 'com.android.application'
    id 'kotlin-android'
    id 'kotlin-kapt'
}

android {
    namespace 'com.example.newjupiter'
    compileSdk 33

    defaultConfig {
        applicationId "com.example.newjupiter"
        minSdk 21
        targetSdk 33
        versionCode 1
        versionName "1.0"

        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_17
                targetCompatibility JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = '17'
    }
}

dependencies {
    implementation 'androidx.core:core-ktx:1.9.0'
    implementation 'androidx.appcompat:appcompat:1.6.1'
    implementation 'com.google.android.material:material:1.8.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
    implementation 'androidx.lifecycle:lifecycle-runtime-ktx:2.5.1'
    implementation 'androidx.activity:activity-ktx:1.7.0'
    implementation 'com.google.api-client:google-api-client-android:1.31.5'
    implementation 'com.google.apis:google-api-services-sheets:v4-rev614-1.25.0'
    implementation 'com.google.android.gms:play-services-auth:20.2.0'
    implementation 'com.google.api-client:google-api-client-gson:1.31.5'
    implementation 'androidx.room:room-runtime:2.5.0'
    kapt 'androidx.room:room-compiler:2.5.0'
    implementation 'androidx.work:work-runtime-ktx:2.8.0'
    testImplementation 'junit:junit:4.13.2'
    androidTestImplementation 'androidx.test.ext:junit:1.1.5'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.5.1'
}
