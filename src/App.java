

import modelo.pokemon.Combate;
import modelo.pokemon.Entrenador;
import modelo.pokemon.EnumEstado;
import modelo.pokemon.EnumTipo;
import modelo.pokemon.Movimiento;
import modelo.pokemon.MovimientoAtaque;
import modelo.pokemon.MovimientoEstado;
import modelo.pokemon.MovimientoMejora;
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

        Pokemon charmander = new Pokemon("Charmander", "Jose Juan", 39, 52, 60, 43, 50, 65, 100, 1, listaMovimientos, 10, EnumEstado.SIN_ESTADO, EnumTipo.FUEGO);
        MovimientoAtaque m1Charmander = new MovimientoAtaque(EnumTipo.FUEGO, "Ascuas", 5, 40);
        MovimientoAtaque m2Charmander = new MovimientoAtaque(EnumTipo.FUEGO, "Colmillo Ígneo", 5, 65);
        MovimientoAtaque m3Charmander = new MovimientoAtaque(EnumTipo.FUEGO, "Lanzallamas", 5, 90);
        MovimientoAtaque m4Charmander = new MovimientoAtaque(EnumTipo.FUEGO, "Pirotecia", 5, 70);

        Pokemon squirtle = new Pokemon("Squirtle", "Mbappe", 44, 48, 50, 65, 64, 43, 100, 1, listaMovimientos, 10, EnumEstado.SIN_ESTADO, EnumTipo.AGUA);
        MovimientoAtaque m1Squirtle = new MovimientoAtaque(EnumTipo.AGUA, "Burbuja", 5, 40);
        MovimientoAtaque m2Squirtle = new MovimientoAtaque(EnumTipo.AGUA, "Pistola agua", 5, 40);
        MovimientoAtaque m3Squirtle = new MovimientoAtaque(EnumTipo.AGUA, "Acuacola", 5, 90);
        MovimientoAtaque m4Squirtle = new MovimientoAtaque(EnumTipo.AGUA, "Hidropulso", 5, 60);

        Pokemon phanpy = new Pokemon("Phanpy", "Francis", 90, 60, 40, 60, 40, 40, 100, 1, listaMovimientos, 10, EnumEstado.SIN_ESTADO, EnumTipo.TIERRA);
        MovimientoAtaque m1Phanpy = new MovimientoAtaque(EnumTipo.AGUA, "Pistola agua", 5, 40);
        MovimientoAtaque m2Phanpy = new MovimientoAtaque(EnumTipo.TIERRA, "Bofeton lodo", 5, 20);
        MovimientoAtaque m3Phanpy = new MovimientoAtaque(EnumTipo.TIERRA, "Terremoto", 5, 100);
        MovimientoAtaque m4Phanpy = new MovimientoAtaque(EnumTipo.TIERRA, "Tierra viva", 5, 90);

        Pokemon caterpie = new Pokemon("Caterpie", "Gusanito", 45, 30, 20, 35, 20, 45, 100, 1, listaMovimientos, 10, EnumEstado.SIN_ESTADO, EnumTipo.BICHO);
        MovimientoAtaque m1Caterpie = new MovimientoAtaque(EnumTipo.AGUA, "Burbuja", 5, 40);
        MovimientoMejora m2Caterpie = new MovimientoMejora(EnumTipo.BICHO, "Disparo demora", 5, EnumM)
        MovimientoAtaque m3Caterpie = new MovimientoAtaque(EnumTipo.BICHO, "Picadura", 5, 90);
        MovimientoAtaque m4Caterpie = new MovimientoAtaque(EnumTipo.AGUA, "Hidropulso", 5, 60);

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
