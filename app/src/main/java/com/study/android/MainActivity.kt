package com.study.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.study.android.ui.theme.AndroidStudioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidStudioTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

/**
 * @Composable
 * UI를 생성하는 데 사용된다고 Kotlin 컴파일러에 알림
 **/
@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!",
        color = Color.Red,
        modifier = Modifier.padding(horizontal = 6.dp))
}

/**
 * @Preview
 * 전체 앱을 빌드하지 않고도 앱이 어떻게 표시되는지 확인
 **/
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AndroidStudioTheme {
        Surface(color = Color.Yellow) {
            Greeting("YR AN")
        }
    }
}