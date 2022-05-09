package main;

import pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Pokemon p = new Pokemon();

        p.getEstamina();
        p.atacar(5);
        p.getEstado();
    }
}