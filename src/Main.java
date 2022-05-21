import modelo.pokemon.Combate;
import modelo.pokemon.Entrenador;
import modelo.pokemon.EnumEstado;
import modelo.pokemon.EnumTipo;
import modelo.pokemon.MovimientoAtaque;
import modelo.pokemon.MovimientoEstado;
import modelo.pokemon.Pokemon;
import modelo.pokemon.Turno;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Entrenador entrenador = new Entrenador("Alvaro");
        Combate combate = new Combate();


        Pokemon charmander = new Pokemon("Charmander", "Jose Juan", 39, 52, 60, 43, 50, 65, 100, 1, 10, EnumEstado.SIN_ESTADO, EnumTipo.FUEGO);
        MovimientoAtaque m1Charmander = new MovimientoAtaque(EnumTipo.FUEGO, "Ascuas", 5, 4);
        MovimientoAtaque m2Charmander = new MovimientoAtaque(EnumTipo.FUEGO, "Colmillo Ígneo", 5, 6);
        MovimientoAtaque m3Charmander = new MovimientoAtaque(EnumTipo.FUEGO, "Lanzallamas", 5, 9);
        MovimientoAtaque m4Charmander = new MovimientoAtaque(EnumTipo.FUEGO, "Pirotecia", 5, 7);

        Pokemon squirtle = new Pokemon("Squirtle", "Mbappe", 44, 48, 50, 65, 64, 43, 100, 1, 10, EnumEstado.SIN_ESTADO, EnumTipo.AGUA);
        MovimientoAtaque m1Squirtle = new MovimientoAtaque(EnumTipo.AGUA, "Burbuja", 5, 4);
        MovimientoAtaque m2Squirtle = new MovimientoAtaque(EnumTipo.AGUA, "Pistola agua", 5, 4);
        MovimientoAtaque m3Squirtle = new MovimientoAtaque(EnumTipo.AGUA, "Acuacola", 5, 9);
        MovimientoAtaque m4Squirtle = new MovimientoAtaque(EnumTipo.AGUA, "Hidropulso", 5, 6);
        

        Pokemon phanpy = new Pokemon("Phanpy", "Francis", 90, 60, 40, 60, 40, 40, 100, 1, 10, EnumEstado.SIN_ESTADO, EnumTipo.TIERRA);
        MovimientoAtaque m1Phanpy = new MovimientoAtaque(EnumTipo.AGUA, "Pistola agua", 5, 4);
        MovimientoAtaque m2Phanpy = new MovimientoAtaque(EnumTipo.TIERRA, "Bofeton lodo", 5, 2);
        MovimientoAtaque m3Phanpy = new MovimientoAtaque(EnumTipo.TIERRA, "Terremoto", 5, 10);
        MovimientoAtaque m4Phanpy = new MovimientoAtaque(EnumTipo.TIERRA, "Tierra viva", 5, 9);

        Pokemon caterpie = new Pokemon("Caterpie", "Gusanito", 45, 30, 20, 35, 20, 45, 100, 1, 10, EnumEstado.SIN_ESTADO, EnumTipo.BICHO);
        MovimientoAtaque m1Caterpie = new MovimientoAtaque(EnumTipo.AGUA, "Burbuja", 5, 4);
        MovimientoAtaque m2Caterpie = new MovimientoAtaque(EnumTipo.BICHO, "Electrotela", 5, 5);
        MovimientoAtaque m3Caterpie = new MovimientoAtaque(EnumTipo.BICHO, "Picadura", 5, 9);
        MovimientoAtaque m4Caterpie = new MovimientoAtaque(EnumTipo.AGUA, "Hidropulso", 5, 6);

        Pokemon spearow = new Pokemon("Spearow", "Pajarico", 40, 60, 31, 30, 31, 70, 100, 1, 10, EnumEstado.SIN_ESTADO, EnumTipo.VOLADOR);
        MovimientoAtaque m1Spearow = new MovimientoAtaque(EnumTipo.VOLADOR, "Pìcotazo", 5, 3);
        MovimientoAtaque m2Spearow = new MovimientoAtaque(EnumTipo.VOLADOR, "Golpe aéreo", 5, 6);
        MovimientoAtaque m3Spearow = new MovimientoAtaque(EnumTipo.VOLADOR, "Vuelo", 5, 9);
        MovimientoAtaque m4Spearow = new MovimientoAtaque(EnumTipo.VOLADOR, "Aire afilado", 5, 6);

        Pokemon pikachu = new Pokemon("Pikachu", "Pika pika", 35, 55, 50, 40, 50, 90, 100, 1, 10, EnumEstado.SIN_ESTADO, EnumTipo.ELECTRICO);
        MovimientoAtaque m1Pikachu = new MovimientoAtaque(EnumTipo.ELECTRICO, "Impactrueno", 5, 4);
        MovimientoEstado m2Pikachu = new MovimientoEstado(EnumTipo.ELECTRICO, "Onda trueno", 5, EnumEstado.PARALIZADO);
        MovimientoAtaque m3Pikachu = new MovimientoAtaque(EnumTipo.ELECTRICO, "Trueno", 5, 11);
        MovimientoAtaque m4Pikachu = new MovimientoAtaque(EnumTipo.ELECTRICO, "Rayo", 5, 9);

        Pokemon sandshrew = new Pokemon("Sandshrew", "Bobito", 50, 75, 20, 85, 30, 40, 100, 1, 10, EnumEstado.SIN_ESTADO, EnumTipo.TIERRA);
        MovimientoAtaque m1Sandshrew = new MovimientoAtaque(EnumTipo.TIERRA, "Excavar", 5, 8);
        MovimientoAtaque m2Sandshrew = new MovimientoAtaque(EnumTipo.TIERRA, "Terremoto", 5, 10);
        MovimientoAtaque m3Sandshrew = new MovimientoAtaque(EnumTipo.BICHO, "Corte furia", 5, 4);
        MovimientoAtaque m4Sandshrew = new MovimientoAtaque(EnumTipo.TIERRA, "Bucle arena", 5, 3);

        Pokemon meganium = new Pokemon("Meganium", "Florecilla", 80, 82, 83, 100, 100, 80, 100, 1, 10, EnumEstado.SIN_ESTADO, EnumTipo.PLANTA);
        MovimientoAtaque m1Meganium = new MovimientoAtaque(EnumTipo.PLANTA, "Danza pétalo", 5, 12);
        MovimientoAtaque m2Meganium = new MovimientoAtaque(EnumTipo.PLANTA, "Hoja mágica", 5, 6);
        MovimientoAtaque m3Meganium = new MovimientoAtaque(EnumTipo.PLANTA, "Tormenta floral", 5, 9);
        MovimientoAtaque m4Meganium = new MovimientoAtaque(EnumTipo.PLANTA, "Hoja afilada", 5, 5);

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
                    System.out.println("Has elegido la opcion de combate.");
                    System.out.println("Que pokemon quieres usar?");
                    System.out.println("1. Charmander");
                    System.out.println("2. Squirtle");
                    System.out.println("3. Phanpy");
                    System.out.println("4. Vulpix");
                    System.out.println("5. Spearow");
                    System.out.println("6. Pikachu");
                    System.out.println("7. Sandshrew");
                    System.out.println("8. Meganium");
                    int opcion2=0;
                    opcion2 = teclado.nextInt();

                    Random random = new Random();
                    int enemigoRandom = random.nextInt(8) + 1;

                    switch(opcion2){
                        
                        case 1:
                            System.out.println("Tu pokemon elegido es Charmander");
                            enemigoRandom = random.nextInt(8) + 1;

                            if (enemigoRandom==1){
                                Pokemon charmanderEnemigo = new Pokemon("Charmander", "Jose Juan", 39, 52, 60, 43, 50, 65, 100, 1, 10, EnumEstado.SIN_ESTADO, EnumTipo.FUEGO);
                                System.out.println("El pokemon enemigo es Charmander");
                                System.out.println("Elige un movimiento");
                                System.out.println("1. "+m1Charmander.getNombreMov());
                                System.out.println("2. "+m2Charmander.getNombreMov());
                                System.out.println("3. "+m3Charmander.getNombreMov());
                                System.out.println("4. "+m4Charmander.getNombreMov());
                                System.out.println("5. Huir");
                                
                                int opcion3=0;
                                opcion3 = teclado.nextInt();
                                switch(opcion3){
                                    case 1:
                                        charmander.comprobarVentaja(charmanderEnemigo);
                                        charmander.atacar(charmanderEnemigo, m1Charmander);
                                        Turno t1 = new Turno(1, 
                                        charmander.getNombre()+" usa "+m1Charmander,
                                        charmanderEnemigo.getNombre()+" usa "+m1Charmander);
                                        combate.addTurno(t1);
                                        combate.escribirCombate();
                                        break;
                                    case 2:
                                        charmander.atacar(charmanderEnemigo, m2Charmander);
                                        break;
                                    case 3:
                                        charmander.atacar(charmanderEnemigo, m3Charmander);
                                        break;
                                    case 4:
                                        charmander.atacar(charmanderEnemigo, m4Charmander);
                                        break;
                                    case 5:
                                        combate.retirarse();
                                        break;
                                }
                            }
                            if (enemigoRandom==2){
                                Pokemon squirtleEmemigo = new Pokemon("Squirtle", "Mbappe", 44, 48, 50, 65, 64, 43, 100, 1, 10, EnumEstado.SIN_ESTADO, EnumTipo.AGUA);
                                System.out.println("El pokemon enemigo es Squirtle");
                                System.out.println("Elige un movimiento");
                                System.out.println("1. "+m1Charmander.getNombreMov());
                                System.out.println("2. "+m2Charmander.getNombreMov());
                                System.out.println("3. "+m3Charmander.getNombreMov());
                                System.out.println("4. "+m4Charmander.getNombreMov());
                                System.out.println("5. Huir");
                                
                                int opcion4=0;
                                opcion4 = teclado.nextInt();
                                switch(opcion4){
                                    case 1:
                                        charmander.atacar(squirtleEmemigo, m1Squirtle);
                                        break;
                                    case 2:
                                        charmander.atacar(squirtleEmemigo, m2Squirtle);
                                        break;
                                    case 3:
                                        charmander.atacar(squirtleEmemigo, m3Squirtle);
                                        break;
                                    case 4:
                                        charmander.atacar(squirtleEmemigo, m4Squirtle);
                                        break;
                                    case 5:
                                        combate.retirarse();
                                        break;
                                }
                            }
                            if (enemigoRandom==3){
                                System.out.println("El pokemon enemigo es Phanpy");
                            }
                            if (enemigoRandom==4){
                                System.out.println("El pokemon enemigo es Vulpix");
                            }
                            if (enemigoRandom==5){
                                System.out.println("El pokemon enemigo es Spearow");
                            }
                            if (enemigoRandom==6){
                                System.out.println("El pokemon enemigo es Pikachu");
                            }
                            if (enemigoRandom==7){
                                System.out.println("El pokemon enemigo es Sandshrew");
                            }
                            if (enemigoRandom==8){
                                System.out.println("El pokemon enemigo es Meganium");
                            }

                            break;
                        case 2:
                            System.out.println("Tu pokemon elegido es Squirtle");
                            enemigoRandom = random.nextInt(8) + 1;

                            if (enemigoRandom==1){
                                System.out.println("El pokemon enemigo es Charmander");
                            }
                            if (enemigoRandom==2){
                                System.out.println("El pokemon enemigo es Squirtle");
                            }
                            if (enemigoRandom==3){
                                System.out.println("El pokemon enemigo es Phanpy");
                            }
                            if (enemigoRandom==4){
                                System.out.println("El pokemon enemigo es Vulpix");
                            }
                            if (enemigoRandom==5){
                                System.out.println("El pokemon enemigo es Spearow");
                            }
                            if (enemigoRandom==6){
                                System.out.println("El pokemon enemigo es Pikachu");
                            }
                            if (enemigoRandom==7){
                                System.out.println("El pokemon enemigo es Sandshrew");
                            }
                            if (enemigoRandom==8){
                                System.out.println("El pokemon enemigo es Meganium");
                            }

                            break;
                        case 3:
                            System.out.println("Tu pokemon elegido es Phanpy");
                            enemigoRandom = random.nextInt(8) + 1;

                            if (enemigoRandom==1){
                                System.out.println("El pokemon enemigo es Charmander");
                            }
                            if (enemigoRandom==2){
                                System.out.println("El pokemon enemigo es Squirtle");
                            }
                            if (enemigoRandom==3){
                                System.out.println("El pokemon enemigo es Phanpy");
                            }
                            if (enemigoRandom==4){
                                System.out.println("El pokemon enemigo es Vulpix");
                            }
                            if (enemigoRandom==5){
                                System.out.println("El pokemon enemigo es Spearow");
                            }
                            if (enemigoRandom==6){
                                System.out.println("El pokemon enemigo es Pikachu");
                            }
                            if (enemigoRandom==7){
                                System.out.println("El pokemon enemigo es Sandshrew");
                            }
                            if (enemigoRandom==8){
                                System.out.println("El pokemon enemigo es Meganium");
                            }

                            break;
                        case 4:
                            System.out.println("Tu pokemon elegido es Vulpix");
                            enemigoRandom = random.nextInt(8) + 1;

                            if (enemigoRandom==1){
                                System.out.println("El pokemon enemigo es Charmander");
                            }
                            if (enemigoRandom==2){
                                System.out.println("El pokemon enemigo es Squirtle");
                            }
                            if (enemigoRandom==3){
                                System.out.println("El pokemon enemigo es Phanpy");
                            }
                            if (enemigoRandom==4){
                                System.out.println("El pokemon enemigo es Vulpix");
                            }
                            if (enemigoRandom==5){
                                System.out.println("El pokemon enemigo es Spearow");
                            }
                            if (enemigoRandom==6){
                                System.out.println("El pokemon enemigo es Pikachu");
                            }
                            if (enemigoRandom==7){
                                System.out.println("El pokemon enemigo es Sandshrew");
                            }
                            if (enemigoRandom==8){
                                System.out.println("El pokemon enemigo es Meganium");
                            }

                            break;
                        case 5:
                            System.out.println("Tu pokemon elegido es Spearow");
                            enemigoRandom = random.nextInt(8) + 1;

                            if (enemigoRandom==1){
                                System.out.println("El pokemon enemigo es Charmander");
                            }
                            if (enemigoRandom==2){
                                System.out.println("El pokemon enemigo es Squirtle");
                            }
                            if (enemigoRandom==3){
                                System.out.println("El pokemon enemigo es Phanpy");
                            }
                            if (enemigoRandom==4){
                                System.out.println("El pokemon enemigo es Vulpix");
                            }
                            if (enemigoRandom==5){
                                System.out.println("El pokemon enemigo es Spearow");
                            }
                            if (enemigoRandom==6){
                                System.out.println("El pokemon enemigo es Pikachu");
                            }
                            if (enemigoRandom==7){
                                System.out.println("El pokemon enemigo es Sandshrew");
                            }
                            if (enemigoRandom==8){
                                System.out.println("El pokemon enemigo es Meganium");
                            }

                            break;
                        case 6:
                            System.out.println("Tu pokemon elegido es Pikachu");
                            enemigoRandom = random.nextInt(8) + 1;

                            if (enemigoRandom==1){
                                System.out.println("El pokemon enemigo es Charmander");
                            }
                            if (enemigoRandom==2){
                                System.out.println("El pokemon enemigo es Squirtle");
                            }
                            if (enemigoRandom==3){
                                System.out.println("El pokemon enemigo es Phanpy");
                            }
                            if (enemigoRandom==4){
                                System.out.println("El pokemon enemigo es Vulpix");
                            }
                            if (enemigoRandom==5){
                                System.out.println("El pokemon enemigo es Spearow");
                            }
                            if (enemigoRandom==6){
                                System.out.println("El pokemon enemigo es Pikachu");
                            }
                            if (enemigoRandom==7){
                                System.out.println("El pokemon enemigo es Sandshrew");
                            }
                            if (enemigoRandom==8){
                                System.out.println("El pokemon enemigo es Meganium");
                            }

                            break;
                        case 7:
                            System.out.println("Tu pokemon elegido es Sandshrew");
                            enemigoRandom = random.nextInt(8) + 1;

                            if (enemigoRandom==1){
                                System.out.println("El pokemon enemigo es Charmander");
                            }
                            if (enemigoRandom==2){
                                System.out.println("El pokemon enemigo es Squirtle");
                            }
                            if (enemigoRandom==3){
                                System.out.println("El pokemon enemigo es Phanpy");
                            }
                            if (enemigoRandom==4){
                                System.out.println("El pokemon enemigo es Vulpix");
                            }
                            if (enemigoRandom==5){
                                System.out.println("El pokemon enemigo es Spearow");
                            }
                            if (enemigoRandom==6){
                                System.out.println("El pokemon enemigo es Pikachu");
                            }
                            if (enemigoRandom==7){
                                System.out.println("El pokemon enemigo es Sandshrew");
                            }
                            if (enemigoRandom==8){
                                System.out.println("El pokemon enemigo es Meganium");
                            }

                            break;    
                        case 8:
                            System.out.println("Tu pokemon elegido es Meganium");
                            enemigoRandom = random.nextInt(8) + 1;

                            if (enemigoRandom==1){
                                System.out.println("El pokemon enemigo es Charmander");
                            }
                            if (enemigoRandom==2){
                                System.out.println("El pokemon enemigo es Squirtle");
                            }
                            if (enemigoRandom==3){
                                System.out.println("El pokemon enemigo es Phanpy");
                            }
                            if (enemigoRandom==4){
                                System.out.println("El pokemon enemigo es Vulpix");
                            }
                            if (enemigoRandom==5){
                                System.out.println("El pokemon enemigo es Spearow");
                            }
                            if (enemigoRandom==6){
                                System.out.println("El pokemon enemigo es Pikachu");
                            }
                            if (enemigoRandom==7){
                                System.out.println("El pokemon enemigo es Sandshrew");
                            }
                            if (enemigoRandom==8){
                                System.out.println("El pokemon enemigo es Meganium");
                            }

                            break;
                    }
                    
                    break;
                case 3: 
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion <= 1 && opcion <= 2);
        teclado.close();
    }
}
