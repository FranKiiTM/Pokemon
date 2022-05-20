package modelo.pokemon;

import java.util.ArrayList;
import java.util.Random;

public class Entrenador {

    private String nombre;
    private int pokedollares;
    private ArrayList<Pokemon> equipo;
    private ArrayList<Pokemon> cajaPokemon;

    Random aleatorio = new Random();

    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.pokedollares = aleatorio.nextInt(800, 1000) + 800;
        this.equipo = new ArrayList<>(4);
        this.cajaPokemon = new ArrayList<>(10);
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

    public void setPokedollares(int pokedollares) {
        this.pokedollares = pokedollares;
    }

    public void moverACaja(Pokemon pokemon) {
        if (equipo.size() >= 1) {
            System.out.println("Moviendo pokemon a caja...");
            cajaPokemon.add(pokemon);
            equipo.remove(pokemon);
        } else {
            System.out.println("Error, debes tener minimo un Pokemon en tu equipo principal");
        }
    }

    public void moverAEquipo(Pokemon pokemon) {
        if (equipo.size() < 4) {
            System.out.println("Moviendo pokemon a equipo principal...");
            equipo.add(pokemon);
            cajaPokemon.remove(pokemon);
        } else {
            System.out.println("Error, tienes ya 4 Pokemons en tu equipo principal");
            moverACaja(pokemon);
        }
    }

    Random random = new Random();

    public void capturar() {
        Pokemon charmander = new Pokemon("Charmander", "Jose Juan", 39, 52, 60, 43, 50, 65, 100, 1, 10, EnumEstado.SIN_ESTADO, EnumTipo.FUEGO);
        Pokemon squirtle = new Pokemon("Squirtle", "Mbappe", 44, 48, 50, 65, 64, 43, 100, 1, 10, EnumEstado.SIN_ESTADO, EnumTipo.AGUA);
        Pokemon phanpy = new Pokemon("Phanpy", "Francis", 90, 60, 40, 60, 40, 40, 100, 1, 10, EnumEstado.SIN_ESTADO, EnumTipo.TIERRA);
        Pokemon caterpie = new Pokemon("Caterpie", "Gusanito", 45, 30, 20, 35, 20, 45, 100, 1, 10, EnumEstado.SIN_ESTADO, EnumTipo.BICHO);
        Pokemon spearow = new Pokemon("Spearow", "Pajarico", 40, 60, 31, 30, 31, 70, 100, 1, 10, EnumEstado.SIN_ESTADO, EnumTipo.VOLADOR);
        Pokemon pikachu = new Pokemon("Pikachu", "Pika pika", 35, 55, 50, 40, 50, 90, 100, 1, 10, EnumEstado.SIN_ESTADO, EnumTipo.ELECTRICO);
        Pokemon sandshrew = new Pokemon("Sandshrew", "Bobito", 50, 75, 20, 85, 30, 40, 100, 1, 10, EnumEstado.SIN_ESTADO, EnumTipo.TIERRA);
        Pokemon meganium = new Pokemon("Meganium", "Florecilla", 80, 82, 83, 100, 100, 80, 100, 1, 10, EnumEstado.SIN_ESTADO, EnumTipo.PLANTA);
        
        int comprobador = random.nextInt(3) + 1;
        int pokeRandom = random.nextInt(8) + 1;

        if (pokeRandom==1){

            if (comprobador == 1 || comprobador == 2) {
                System.out.println("Charmander capturado!!");
                moverAEquipo(charmander);
            } else if (comprobador == 3) {
                System.out.println("Charmander ha escapado de la pokeball");
            }

        }
        if (pokeRandom==2){

            if (comprobador == 1 || comprobador == 2) {
                System.out.println("Squirtle capturado!!");
                moverAEquipo(squirtle);
            } else if (comprobador == 3) {
                System.out.println("Squirtle ha escapado de la pokeball");
            }

        }
        if (pokeRandom==3){
            if (comprobador == 1 || comprobador == 2) {
                System.out.println("Phanpy capturado!!");
                moverAEquipo(phanpy);
            } else if (comprobador == 3) {
                System.out.println("Phanpy ha escapado de la pokeball");
            }
        }
        if (pokeRandom==4){
            if (comprobador == 1 || comprobador == 2) {
                System.out.println("Caterpie capturado!!");
                moverAEquipo(caterpie);
            } else if (comprobador == 3) {
                System.out.println("Caterpie ha escapado de la pokeball");
            }
        }
        if (pokeRandom==5){
            if (comprobador == 1 || comprobador == 2) {
                System.out.println("Spearow capturado!!");
                moverAEquipo(spearow);
            } else if (comprobador == 3) {
                System.out.println("Spearow ha escapado de la pokeball");
            }
        }
        if (pokeRandom==6){
            if (comprobador == 1 || comprobador == 2) {
                System.out.println("Pikachu capturado!!");
                moverAEquipo(pikachu);
            } else if (comprobador == 3) {
                System.out.println("Pikachu ha escapado de la pokeball");
            }
        }
        if (pokeRandom==7){
            if (comprobador == 1 || comprobador == 2) {
                System.out.println("Sandshrew capturado!!");
                moverAEquipo(sandshrew);
            } else if (comprobador == 3) {
                System.out.println("Sandshrew ha escapado de la pokeball");
            }
        }
        if (pokeRandom==8){
            if (comprobador == 1 || comprobador == 2) {
                System.out.println("Meganium capturado!!");
                moverAEquipo(meganium);
            } else if (comprobador == 3) {
                System.out.println("Meganium ha escapado de la pokeball");
            }
        }
    }
}
