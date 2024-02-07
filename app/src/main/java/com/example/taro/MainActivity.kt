package com.example.taro

import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.TopCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taro.ui.theme.TaroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaroTheme {
                TaroApp()
            }
        }
    }
}

@Composable
fun TaroWithButtonAndImage() {

    var result by remember { mutableStateOf(0) }

    val imageResource = when (result) {
        0 -> R.drawable.rubashka
        1 -> R.drawable.vsandnik
        2 -> R.drawable.clever
        3 -> R.drawable.korabl
        4 -> R.drawable.dom
        5 -> R.drawable.derevo
        6 -> R.drawable.tuchi
        7 -> R.drawable.zmeya
        8 -> R.drawable.grob
        9 -> R.drawable.byket
        10 -> R.drawable.kosa
        11 -> R.drawable.metla
        12 -> R.drawable.ptizi
        13 -> R.drawable.baby
        14 -> R.drawable.lisa
        15 -> R.drawable.bear
        16 -> R.drawable.stars
        17 -> R.drawable.aist
        18 -> R.drawable.sobaka
        19 -> R.drawable.bashnya
        20 -> R.drawable.sad
        21 -> R.drawable.gora
        22 -> R.drawable.razvilka
        23 -> R.drawable.mice
        24 -> R.drawable.heart
        25 -> R.drawable.ring
        26 -> R.drawable.book
        27 -> R.drawable.pismo
        28 -> R.drawable.man
        29 -> R.drawable.woman
        30 -> R.drawable.lilii
        31 -> R.drawable.sun
        32 -> R.drawable.moon
        33 -> R.drawable.key
        34 -> R.drawable.fish
        35 -> R.drawable.uakor
        else -> R.drawable.krest
    }

    val isImageVisible = remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally){
        Box (
            modifier = Modifier.fillMaxHeight()
        ){
            Text(
                "⭐ Задай свой вопрос и узнай ответ у карт ⭐",
                fontSize = 20.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .align(TopCenter)
                    .padding(top = 50.dp, bottom = 10.dp, start = 20.dp, end = 20.dp)
            )
            Button(
                onClick = {
                    result = (1..36).random()},
                modifier = Modifier.align(BottomCenter),
                colors = ButtonDefaults.buttonColors(Color.Yellow, contentColor = Color.Black)
            ) {
                Text("Вытянуть карту")
            }
            Image(painter = painterResource(id = imageResource),
                contentDescription = "Изображение",
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .align(Center).width(300.dp).height(400.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TaroApp(){
    TaroWithButtonAndImage()
}