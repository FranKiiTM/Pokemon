import modelo.pokemon.Combate;
import modelo.pokemon.Entrenador;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Entrenador entrenador = new Entrenador("Alvaro");
        Combate combate = new Combate();

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
                case 3:
                    
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion <= 1 && opcion <= 2);
        teclado.close();
    }
}
