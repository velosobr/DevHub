package com.ragnlabs.devhub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import com.ragnlabs.devhub.ui.theme.DevHubTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DevHubTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    GreetingChallenge(
                        name = "Lino Veloso",
                        githubUser = "velosobr",
                        bioContent = "Software Engineer at @ifood. " +
                                "Bachelor in Informational Systems at @UFSC."
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingChallenge(name: String, githubUser: String, bioContent: String) {

    Image(R.drawable.ic_launcher_background)
    Column {
        Text(text = name)
        Text(text = githubUser)
        Text(text = bioContent)
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DevHubTheme {
        GreetingChallenge(
            name = "Lino Veloso",
            githubUser = "velosobr",
            bioContent = "Software Engineer at @ifood. Bachelor in Informational Systems at @UFSC."
        )
    }
}