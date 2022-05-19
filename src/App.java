

import modelo.pokemon.Combate;
import modelo.pokemon.Entrenador;
import modelo.pokemon.EnumEstado;
import modelo.pokemon.EnumTipo;
import modelo.pokemon.Movimiento;
import modelo.pokemon.Pokemon;
import modelo.pokemon.Turno;

public class App {
    public static void main(String[] args) throws Exception {
        /*Combate c = new Combate();
        Turno t1 = new Turno(1, 
        "Charmander usa Ascuas",
        "Squirtle usa Burbuja");

        c.addTurno(t1);

        c.escribirCombate();*/

        Entrenador entrenador = new Entrenador("Alvaro");
        Combate combate = new Combate();
        Pokemon poke1 = new Pokemon("Charmander", "Jose Juan", 39, 52, 60, 43, 50, 65, 100, 1, listaMovimientos, 10, EnumEstado.SIN_ESTADO, EnumTipo.FUEGO);
        Movimiento m1 = new Movimiento() {
          
        };

        int opcion=2;
        do{
            System.out.println("Que quieres hacer?");
            System.out.println("1. Capturar");
            System.out.println("2. Combatir");
    
            
            switch(opcion) {
                case 1:
                  entrenador.capturar();
                  break;
                case 2:
                  combate.combatir();
                  break;
                default:
                System.out.println("Opción no válida");
              }
        }while(opcion==2 || opcion==1);
        
    }
}
