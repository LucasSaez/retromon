package com.example.retromon.network

import com.example.retromon.model.PokemonResponse
import retrofit2.http.GET

interface PokeApiService {
    @GET("pokemon")
    suspend fun getPokemons(): PokemonResponse
}