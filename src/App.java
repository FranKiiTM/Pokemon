

import modelo.pokemon.Combate;
import modelo.pokemon.Turno;

public class App {
    public static void main(String[] args) throws Exception {
        Combate c = new Combate();
        Turno t1 = new Turno(1, 
        "Charmander usa Ascuas",
        "Squirtle usa Burbuja");

        c.addTurno(t1);

        c.escribirCombate();
    }
}
