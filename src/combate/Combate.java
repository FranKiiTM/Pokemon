package combate;

import entrenador.Entrenador;
import turno.Turno;

public class Combate {
    
    private Entrenador jugador;
    private Entrenador entrenadorRival;
    private Turno turnoCombate;
    private Entrenador ganador;
    private int pkmnKoJugador;
    private int pkmnKoRival;

    public Combate(Entrenador jugador, Entrenador entrenadorRival, Turno turnoCombate, Entrenador ganador, int numPokemonKoJugador, int numPokemonKoRival ){
        this.jugador= jugador;
        this.entrenadorRival= entrenadorRival;
        this.turnoCombate = turnoCombate;
        this.ganador= ganador;
        this.pkmnKoJugador = numPokemonKoJugador;
        this.pkmnKoRival = numPokemonKoRival;
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

    public int getPkmnKoJugador() {
        return pkmnKoJugador;
    }

    public int getPkmnKoRival() {
        return pkmnKoRival;
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

    public void setPkmnKoJugador(int pkmnKoJugador) {
        this.pkmnKoJugador = pkmnKoJugador;
    }

    public void setPkmnKoRival(int pkmnKoRival) {
        this.pkmnKoRival = pkmnKoRival;
    }

    public void setTurnoCombate(Turno turnoCombate) {
        this.turnoCombate = turnoCombate;
    }
    
    public void ganarPerderPokedollares(){
        int pokedollaresGanados = 0;
        int pokedollaresRestantes = 0;
        if (jugador == ganador){
            pokedollaresGanados = (int) (jugador.getPokedollares()*0.33);
            System.out.println("Has ganado, recibes "+pokedollaresGanados+" pokedollares");
        }
        else if (entrenadorRival == ganador){
            pokedollaresGanados = (int) (jugador.getPokedollares()*0.33);
            pokedollaresRestantes-=pokedollaresGanados;
            System.out.println("Has perdido, pierdes "+pokedollaresGanados+" pokedollares");
            System.out.println("Te quedan "+pokedollaresRestantes+" pokedollares");
        }
    }

    public void retirarse(boolean retirada){
        if(retirada == true){
            System.out.println("Te retiras de la batalla...");
            entrenadorRival = ganador;
            ganarPerderPokedollares();
        }
        else if(retirada == false){
            System.out.println("Sigue luchando");
        }
    }

    public void combatir(){
        int numTurno=1;
    
        do {
            numTurno++;
        } while (pkmnKoJugador<4 || pkmnKoRival<4);
        
        if(pkmnKoJugador == 4 ){
            entrenadorRival=ganador;
            ganarPerderPokedollares();
        }
        else if(pkmnKoRival == 4){
            jugador=ganador;
            ganarPerderPokedollares();
        //TODO: Añadir mas tarde el metodo subir de nivel
        }
        else {
            retirarse(true);
        }
    }
}
