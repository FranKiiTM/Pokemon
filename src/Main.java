import modelo.pokemon.Combate;
import modelo.pokemon.Entrenador;
import modelo.pokemon.EnumEstado;
import modelo.pokemon.EnumTipo;
import modelo.pokemon.MovimientoAtaque;
import modelo.pokemon.MovimientoEstado;
import modelo.pokemon.Pokemon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Entrenador entrenador = new Entrenador("Alvaro");
        Combate combate = new Combate();

        Pokemon charmander = new Pokemon("Charmander", "Jose Juan", 39, 52, 60, 43, 50, 65, 100, 1, 10, EnumEstado.SIN_ESTADO, EnumTipo.FUEGO);
        MovimientoAtaque m1Charmander = new MovimientoAtaque(EnumTipo.FUEGO, "Ascuas", 5, 40);
        MovimientoAtaque m2Charmander = new MovimientoAtaque(EnumTipo.FUEGO, "Colmillo Ígneo", 5, 65);
        MovimientoAtaque m3Charmander = new MovimientoAtaque(EnumTipo.FUEGO, "Lanzallamas", 5, 90);
        MovimientoAtaque m4Charmander = new MovimientoAtaque(EnumTipo.FUEGO, "Pirotecia", 5, 70);

        Pokemon squirtle = new Pokemon("Squirtle", "Mbappe", 44, 48, 50, 65, 64, 43, 100, 1, 10, EnumEstado.SIN_ESTADO, EnumTipo.AGUA);
        MovimientoAtaque m1Squirtle = new MovimientoAtaque(EnumTipo.AGUA, "Burbuja", 5, 40);
        MovimientoAtaque m2Squirtle = new MovimientoAtaque(EnumTipo.AGUA, "Pistola agua", 5, 40);
        MovimientoAtaque m3Squirtle = new MovimientoAtaque(EnumTipo.AGUA, "Acuacola", 5, 90);
        MovimientoAtaque m4Squirtle = new MovimientoAtaque(EnumTipo.AGUA, "Hidropulso", 5, 60);
        

        Pokemon phanpy = new Pokemon("Phanpy", "Francis", 90, 60, 40, 60, 40, 40, 100, 1, 10, EnumEstado.SIN_ESTADO, EnumTipo.TIERRA);
        MovimientoAtaque m1Phanpy = new MovimientoAtaque(EnumTipo.AGUA, "Pistola agua", 5, 40);
        MovimientoAtaque m2Phanpy = new MovimientoAtaque(EnumTipo.TIERRA, "Bofeton lodo", 5, 20);
        MovimientoAtaque m3Phanpy = new MovimientoAtaque(EnumTipo.TIERRA, "Terremoto", 5, 100);
        MovimientoAtaque m4Phanpy = new MovimientoAtaque(EnumTipo.TIERRA, "Tierra viva", 5, 90);

        Pokemon caterpie = new Pokemon("Caterpie", "Gusanito", 45, 30, 20, 35, 20, 45, 100, 1, 10, EnumEstado.SIN_ESTADO, EnumTipo.BICHO);
        MovimientoAtaque m1Caterpie = new MovimientoAtaque(EnumTipo.AGUA, "Burbuja", 5, 40);
        MovimientoAtaque m2Caterpie = new MovimientoAtaque(EnumTipo.BICHO, "Electrotela", 5, 55);
        MovimientoAtaque m3Caterpie = new MovimientoAtaque(EnumTipo.BICHO, "Picadura", 5, 90);
        MovimientoAtaque m4Caterpie = new MovimientoAtaque(EnumTipo.AGUA, "Hidropulso", 5, 60);

        Pokemon spearow = new Pokemon("Spearow", "Pajarico", 40, 60, 31, 30, 31, 70, 100, 1, 10, EnumEstado.SIN_ESTADO, EnumTipo.VOLADOR);
        MovimientoAtaque m1Spearow = new MovimientoAtaque(EnumTipo.VOLADOR, "Pìcotazo", 5, 35);
        MovimientoAtaque m2Spearow = new MovimientoAtaque(EnumTipo.VOLADOR, "Golpe aéreo", 5, 60);
        MovimientoAtaque m3Spearow = new MovimientoAtaque(EnumTipo.VOLADOR, "Vuelo", 5, 90);
        MovimientoAtaque m4Spearow = new MovimientoAtaque(EnumTipo.VOLADOR, "Aire afilado", 5, 60);

        Pokemon pikachu = new Pokemon("Pikachu", "Pika pika", 35, 55, 50, 40, 50, 90, 100, 1, 10, EnumEstado.SIN_ESTADO, EnumTipo.ELECTRICO);
        MovimientoAtaque m1Pikachu = new MovimientoAtaque(EnumTipo.ELECTRICO, "Impactrueno", 5, 40);
        MovimientoEstado m2Pikachu = new MovimientoEstado(EnumTipo.ELECTRICO, "Onda trueno", 5, EnumEstado.PARALIZADO);
        MovimientoAtaque m3Pikachu = new MovimientoAtaque(EnumTipo.ELECTRICO, "Trueno", 5, 110);
        MovimientoAtaque m4Pikachu = new MovimientoAtaque(EnumTipo.ELECTRICO, "Rayo", 5, 90);

        Pokemon sandshrew = new Pokemon("Sandshrew", "Bobito", 50, 75, 20, 85, 30, 40, 100, 1, 10, EnumEstado.SIN_ESTADO, EnumTipo.TIERRA);
        MovimientoAtaque m1Sandshrew = new MovimientoAtaque(EnumTipo.TIERRA, "Excavar", 5, 80);
        MovimientoAtaque m2Sandshrew = new MovimientoAtaque(EnumTipo.TIERRA, "Terremoto", 5, 100);
        MovimientoAtaque m3Sandshrew = new MovimientoAtaque(EnumTipo.BICHO, "Corte furia", 5, 40);
        MovimientoAtaque m4Sandshrew = new MovimientoAtaque(EnumTipo.TIERRA, "Bucle arena", 5, 35);

        Pokemon meganium = new Pokemon("Meganium", "Florecilla", 80, 82, 83, 100, 100, 80, 100, 1, 10, EnumEstado.SIN_ESTADO, EnumTipo.PLANTA);
        MovimientoAtaque m1Meganium = new MovimientoAtaque(EnumTipo.PLANTA, "Danza pétalo", 5, 120);
        MovimientoAtaque m2Meganium = new MovimientoAtaque(EnumTipo.PLANTA, "Hoja mágica", 5, 60);
        MovimientoAtaque m3Meganium = new MovimientoAtaque(EnumTipo.PLANTA, "Tormenta floral", 5, 90);
        MovimientoAtaque m4Meganium = new MovimientoAtaque(EnumTipo.PLANTA, "Hoja afilada", 5, 55);

        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("Que quieres hacer?");
            System.out.println("1. Capturar");
            System.out.println("2. Combatir");
            System.out.println("3. Salir");
            
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    entrenador.capturar();
                    break;
                case 2:
                    combate.combatir();
                    break;  
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion <= 1 && opcion <= 2);
        teclado.close();
    }
}
