package com.example.pokemon.retrofit;

import android.database.Observable;

import com.example.pokemon.model.Pokedex;

import retrofit2.http.GET;

public interface IPokemonDex {
    @GET("pokedex.json")
    Observable<Pokedex> getListPokemon();
}
