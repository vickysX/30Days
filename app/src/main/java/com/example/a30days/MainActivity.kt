package com.example.a30days

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a30days.data.Daysource
import com.example.a30days.model.Day
import com.example.a30days.ui.theme.ThirtyDaysTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThirtyDaysTheme() {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ThirtyDaysApp()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ThirtyDaysApp() {
    Scaffold(
        topBar = {
            AppTopBar()
        }
    ) {
        LazyColumn(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.background)
        ) {
            items(Daysource.days) {
                DayItem(day = it)
            }
        }
    }
}

@Composable
fun AppTopBar(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(Alignment.CenterHorizontally)
            .padding(8.dp)
            .background(MaterialTheme.colorScheme.background),

    ) {
        Text(
            text = stringResource(id = R.string.app_title),
            textAlign = TextAlign.Center
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DayItem(
    modifier: Modifier = Modifier,
    day : Day
) {
    Card() {
        Column() {

        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun LightThemePreview() {
    ThirtyDaysTheme(darkTheme = false) {
        ThirtyDaysApp()
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun DarkThemePreview() {
    ThirtyDaysTheme(darkTheme = false) {
        ThirtyDaysApp()
    }
}