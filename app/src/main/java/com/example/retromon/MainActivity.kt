package com.example.retromon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import com.example.retromon.model.Pokemon
import com.example.retromon.ui.theme.RetromonTheme
import com.example.retromon.viewModel.PokemonViewModel

class MainActivity : ComponentActivity() {

    private val ViewModel : PokemonViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            )   {
                val pokemons by ViewModel.pokemons.collectAsState()
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
    RetromonTheme {
        Greeting("Android")
    }
}

@Composable
fun PokemonItem(pokemon: Pokemon){
    Row(modifier = Modifier.padding(8.do)){
        Image(painter = painter, contentDescription = )
    }
}