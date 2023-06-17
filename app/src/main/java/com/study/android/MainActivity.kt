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
    // 인사말에 사용되는 정보. 변수 선언
    private val age = 20
    private val name = "yran"
    private val year = 1990

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidStudioTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
//                    Greeting(getGreetingText(name, age, year))
                    Greeting(getGreetingText(age = 29, year = 2034))
                }
            }
        }
    }
}

// 인사말 Text 반환하는 함수 선언
fun getGreetingText(name: String = "gdhong", age: Int, year: Int): String {
    return "Hi, I'm $name, $age years old. I was born in ${year-age+1}"
}

/**
 * @Composable
 * UI를 생성하는 데 사용된다고 Kotlin 컴파일러에 알림
 **/
@Composable
fun Greeting(greeting: String) {
    Text(text = greeting,
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
            Greeting(getGreetingText("YR AN", 27, 2023))
        }
    }
}