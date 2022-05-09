package turno;

import entrenador.Entrenador;
import pokemon.Pokemon;

public class Turno {

    private int numTurno;
    private Entrenador turnoEntrenador;
    private Entrenador turnoRival;
    private Pokemon turnoPokemon;

    public Turno(int numTurno) {
        this.numTurno = 1;
    }

    public int getNumTurno() {
        return numTurno;
    }

    public void setNumTurno(int numTurno) {
        this.numTurno = numTurno;
    }

    public void accionEntrenador() {
        System.out.println("Entrenador " + turnoEntrenador.getNombre()+": "+turnoPokemon.getNombre()+" usa "+); //TODO: añadir movimiento
    }

    public void accionRival() {
        System.out.println("Entrenador rival" + turnoRival.getNombre()+": "+turnoPokemon.getNombre()+" usa "+); //TODO: añadir movimiento
    }

}
