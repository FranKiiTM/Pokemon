package modelo.entrenador;

import java.util.ArrayList;
import java.util.Random;

import modelo.pokemon.Pokemon;

public class Entrenador {

    private String nombre;
    private int pokedollares;
    private ArrayList<Pokemon> equipo;
    private ArrayList<Pokemon> cajaPokemon;
    private int objetos;

    Random aleatorio = new Random();

    public Entrenador(String nombre, int objetos) {
        this.nombre = nombre;
        this.pokedollares = aleatorio.nextInt(800, 1000) + 800;
        this.equipo = new ArrayList<>(4);
        this.cajaPokemon = new ArrayList<>(10);
        this.objetos = objetos;
    }

    public ArrayList<Pokemon> getCajaPokemon() {
        return cajaPokemon;
    }

    public ArrayList<Pokemon> getEquipo() {
        return equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getObjetos() {
        return objetos;
    }

    public int getPokedollares() {
        return pokedollares;
    }

    public void setCajaPokemon(ArrayList<Pokemon> cajaPokemon) {
        this.cajaPokemon = cajaPokemon;
    }

    public void setEquipo(ArrayList<Pokemon> equipo) {
        this.equipo = equipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setObjetos(int objetos) {
        this.objetos = objetos;
    }

    public void setPokedollares(int pokedollares) {
        this.pokedollares = pokedollares;
    }

    public void moverACaja(Pokemon pokemon) {
        if (equipo.size() >= 1) {
            System.out.println("Moviendo pokemon a caja...");
            cajaPokemon.add(pokemon);
        } else {
            System.out.println("Error, debes tener minimo un Pokemon en tu equipo principal");
        }
    }

    public void moverAEquipo(Pokemon pokemon) {
        if (equipo.size() != 4) {
            System.out.println("Moviendo pokemon a equipo principal...");
            equipo.add(pokemon);
        } else {
            System.out.println("Error, tienes ya 4 Pokemons en tu equipo principal");
        }
    }

    Random random = new Random();

    public void capturar() {

        Pokemon pokemoncito = new Pokemon(); // TODO: añadir caracteristicas de cada pokemon de forma aleatoria mas adelante con bases de datos
        
        int comprobador = random.nextInt(3) + 1;

        if (comprobador == 1 || comprobador == 2) {
            System.out.println("Capturado!!");
        } else if (comprobador == 3) {
            System.out.println("El pokemon ha escapado de la pokeball");
        }
    }

}
