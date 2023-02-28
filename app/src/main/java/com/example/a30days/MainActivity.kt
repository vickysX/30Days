package com.example.a30days

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a30days.ui.theme.ThirtyDaysTheme

//.30DaysTheme

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
        LazyColumn(content = {})
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
    ) {
        Text(
            text = stringResource(id = R.string.app_title),
            textAlign = TextAlign.Center
        )
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