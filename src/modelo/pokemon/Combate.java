package modelo.pokemon;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Combate {
    
    private List<Turno>turnos;
    public static final String PATH_LOG="./log/combate.log";

    private Entrenador jugador;
    private Entrenador entrenadorRival;
    private Entrenador ganador;
    private int pkmnKoJugador;
    private int pkmnKoRival;

    public Combate(Entrenador jugador, Entrenador entrenadorRival, Entrenador ganador, int numPokemonKoJugador, int numPokemonKoRival ){
        
        this.jugador= jugador;
        this.entrenadorRival= entrenadorRival;
        this.ganador= ganador;
        this.pkmnKoJugador = numPokemonKoJugador;
        this.pkmnKoRival = numPokemonKoRival;
    }
    public Combate(){
        turnos=new LinkedList<>();
    }

    public List<Turno> getTurnos() {
        return turnos;
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

    public void addTurno(Turno t){
        this.turnos.add(t);
    }

    public void escribirCombate(){
        File fichero = new File(PATH_LOG);
        try {
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Turno turno : turnos) {
                bw.write("Turno "+turno.getNumTurno()+":\n");
                bw.write("Entrenador: "+turno.getAccionEntrenador()+"\n");
                bw.write("Rival: "+turno.getAccionRival()+"\n");
            }

            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
            System.out.println("Turno "+numTurno);
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
