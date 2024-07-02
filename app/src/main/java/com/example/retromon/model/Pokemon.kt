package com.example.retromon.model

data class Pokemon (
    val name: String,
    val url: String
)

data class PokemonResponse(
    val result: List<Pokemon>
)