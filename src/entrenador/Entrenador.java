package entrenador;

import java.util.ArrayList;
import java.util.Random;

import pokemon.Pokemon;
import combate.Combate;

public class Entrenador {

    private String nombre;
    private int pokedollares;
    private ArrayList <Pokemon> equipo;
    private ArrayList <Pokemon> cajaPokemon;
    private int objetos;

    Random aleatorio= new Random();
    public Entrenador(String nombre, int objetos){
        this.nombre = nombre;
        this.pokedollares = aleatorio.nextInt(800, 1000)+800;
        this.equipo = equipo.size(4);
        this.cajaPokemon = new Pokemon[10];
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
    

    public boolean moverACaja(){
        if(equipo.size(4))
        for(int i = 0; i<equipo.length; i++){
            if(equipo[i] != null){
                System.out.println("Moviendo pokemon a caja...");
                cajaPokemon[i]=equipo[i];
            }
            else if(equipo[i] == null){
                return false;
            }
        }   
        return true;
    }

    public boolean moverAEquipo(){
        for(int i = 0; i<cajaPokemon.length; i++){
            if(cajaPokemon[i] >= cajaPokemon[]  ){
                System.out.println("Moviendo pokemon a equipo principal...");
                equipo[i]=cajaPokemon[i];
            }
            else if(cajaPokemon[i] == null){
                return false;
            }
        }
        return true;
    }

    public boolean capturar(){

    }

    
}
