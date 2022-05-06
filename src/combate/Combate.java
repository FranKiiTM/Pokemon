package combate;

import entrenador.Entrenador;

public class Combate {
    
    private Entrenador jugador;
    private Entrenador entrenadorRival;
    private Turno turnoCombate;
    private Entrenador ganador;
    private int numPokemonKoJugador;
    private int numPokemonKoRival;

    public Combate(Entrenador paramJugador, Entrenador paramEntrenadorRival, Entrenador paramGanador, int ParamNumPokemonKoJugador, int ParamNumPokemonKoRival ){
        this.jugador= paramJugador;
        this.entrenadorRival= paramEntrenadorRival;
        this.turnoCombate = 1;
        this.ganador= paramGanador;
        this.numPokemonKoJugador = ParamNumPokemonKoJugador;
        this.numPokemonKoRival = ParamNumPokemonKoRival;
    }

    public Entrenador getEntrenadorRival() {
        return entrenadorRival;
    }

    public Entrenador getGanador() {
        return ganador;
    }

    public Entrenador getJugador() {
        return jugador;
    }

    public int getNumPokemonKoJugador() {
        return numPokemonKoJugador;
    }

    public int getNumPokemonKoRival() {
        return numPokemonKoRival;
    }

    public Turno getTurnoCombate() {
        return turnoCombate;
    }
    
    public void setEntrenadorRival(Entrenador entrenadorRival) {
        this.entrenadorRival = entrenadorRival;
    }
    
    public void setGanador(Entrenador ganador) {
        this.ganador = ganador;
    }

    public void setJugador(Entrenador jugador) {
        this.jugador = jugador;
    }

    public void setNumPokemonKoJugador(int numPokemonKoJugador) {
        this.numPokemonKoJugador = numPokemonKoJugador;
    }

    public void setNumPokemonKoRival(int numPokemonKoRival) {
        this.numPokemonKoRival = numPokemonKoRival;
    }

    public void setTurnoCombate(Turno turnoCombate) {
        this.turnoCombate = turnoCombate;
    }
    

    public int perderPokedollares(){
        int pokedollaresGanados = 0;
        if (jugador == ganador){
            pokedollaresGanados = pokedollares*0.33;
        }
        else if (entrenadorRival == ganador){
            pokedollaresGanados = pokedollares*0.33;
        }
    }

    public void retirarse(boolean retirada){
        if(retirada == true){
            System.out.println("Te retiras de la batalla...");
            entrenadorRival = ganador;
            perderPokedollares();
        }
        else if(retirada ==false){
            System.out.println("Sigue luchando");
        }
    }

    public void combatir(){
        for(int i=0; i<turnoCombate; i++){
            if(numPokemonKoJugador == 4 ){
                entrenadorRival=ganador;
            }
            else if(numPokemonKoRival == 4){
                jugador=ganador;
            //TODO: Añadir mas tarde el metodo subir de nivel
            }
            else {
                retirarse(true);
            }
        }
    }
}
