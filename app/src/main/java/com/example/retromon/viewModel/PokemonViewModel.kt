package com.example.retromon.viewModel

import com.example.retromon.model.Pokemon
import com.example.retromon.network.RetrofitInstance
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.ViewModel

class PokemonViewModel: ViewModel() {

    private val _pokemons = MutableStateFlow<List<Pokemon>>(emptyList())
    val pokemons: StateFlow<List<Pokemon>> = _pokemons

    init {
        fetchPokemons()
    }

    private fun fetchPokemons(){
        viewModelScope.launch{
            val response = RetrofitInstance.api.getPokemons()
             _pokemons.value = response.result
        }
    }
}

