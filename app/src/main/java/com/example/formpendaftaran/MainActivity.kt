package com.example.formpendaftaran

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.formpendaftaran.ui.theme.FormPendaftaranTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FormPendaftaranTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    // Atur warna Surface menjadi gelap (abu-abu/hitam)
                    color = Color(0xFF333333)
                ) {
                    // Memanggil FormPendaftaran tanpa Scaffold tambahan
                    FormPendaftaran()
                }
                }
            }
        }
    }

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FormPendaftaranTheme {
        Greeting("Android")
    }
}