package com.example.admin.androidpokemon.Retrofit;

import com.example.admin.androidpokemon.Model.Pokedex;
import io.reactivex.Observable;
import retrofit2.http.GET;

public interface  IPokemonDex {

    @GET("pokedex.json")
    Observable<Pokedex> getListPokemon();

}
