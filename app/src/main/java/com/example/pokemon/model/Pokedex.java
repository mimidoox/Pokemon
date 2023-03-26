package com.example.pokemon.model;

import java.util.List;

public class Pokedex {
        private List<Pokemon> pokemons ;

        public List<Pokemon> getPokemons() {
                return pokemons;
        }

        public void setPokemons(List<Pokemon> pokemons) {
                this.pokemons = pokemons;
        }

        public Pokedex(List<Pokemon> pokemons) {
                this.pokemons = pokemons;
        }
}
