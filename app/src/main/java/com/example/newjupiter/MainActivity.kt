package com.example.newjupiter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.newjupiter.ui.theme.NewJupiterTheme
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : ComponentActivity() {

    private lateinit var sheetsServiceHelper: SheetsServiceHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sheetsServiceHelper = SheetsServiceHelper(this)

        setContent {
            NewJupiterTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    MainScreen(sheetsServiceHelper)
                }
            }
        }
    }
}

@Composable
fun MainScreen(sheetsServiceHelper: SheetsServiceHelper) {
    var result by remember { mutableStateOf("") }
    val coroutineScope = rememberCoroutineScope()

    Column(modifier = Modifier.padding(16.dp)) {
        Button(onClick = {
            coroutineScope.launch {
                val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
                val timeFormat = SimpleDateFormat("HH:mm:ss", Locale.getDefault())
                val date = dateFormat.format(Date())
                val time = timeFormat.format(Date())
                val success = sheetsServiceHelper.writeSheet(
                    "1J5wxqk1_nCPEUBnilSHI8RgnWU7CUV-vxrAVGl6LX5M",
                    "Sheet1!A1:B1",
                    listOf(listOf(date, time))
                )
                result = if (success) "Data written successfully" else "Failed to write data"
            }
        }) {
            Text("Write Date and Time to Google Sheets")
        }
        Text(text = result, modifier = Modifier.padding(top = 16.dp))
    }
}
