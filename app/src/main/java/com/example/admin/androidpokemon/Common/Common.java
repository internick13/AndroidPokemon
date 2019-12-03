package com.example.admin.androidpokemon.Common;

import android.content.Intent;
import android.widget.ListView;

import com.example.admin.androidpokemon.Model.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class Common {

    public static final String KEY_ENABLE_HOME = "enable_home" ;
    public static final String KEY_NUM_EVOLUTION = "num_evolution";

    public static List<Pokemon> commonPokemonList = new ArrayList<>();

    public static Pokemon findPokemonByNum(String num){
        for(Pokemon pokemon:Common.commonPokemonList)
            if (pokemon.getNum().equals(num))
                return pokemon;
        return null;
    }


}
