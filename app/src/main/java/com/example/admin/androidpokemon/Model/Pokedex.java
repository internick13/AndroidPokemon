package com.example.admin.androidpokemon.Model;

import java.util.List;

public class Pokedex
{
    private List<Pokemon> pokemon;

    public Pokedex(List<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }

    public Pokedex() {
    }

    public List<Pokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(List<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }
}
