package modelo.moviento;

import java.util.Random;

import modelo.pokemon.EnumTipo;
import modelo.pokemon.Pokemon;

public class MovimientoMejora extends Movimiento {
    Random random = new Random();

    private int turnosMejora;
    private Pokemon mejora;

    public MovimientoMejora(EnumTipo tipoMovimiento, String nombreMov, int costeEstamina, Pokemon mejora) {
        super(tipoMovimiento, nombreMov, costeEstamina);
        this.turnosMejora = random.nextInt(3)+1;
        this.mejora = mejora;
    }

    @Override
    public int gastoEstamina() {
        return costeEstamina = turnosMejora * 10;
    }

    public void subirDefEsp() {
        int mejoraDefEsp = 0;
        mejoraDefEsp = mejora.getDefensaEspecial() + random.nextInt(10) + 1;
        System.out.println("Tu defensa especial aumentó durante " + turnosMejora + "turnos");
        System.out.println(mejora.getDefensaEspecial() + " + " + random + " = " + mejoraDefEsp);
    }

    public void subirDef() {
        int mejoraDefensa = 0;
        mejoraDefensa = mejora.getDefensa() + random.nextInt(10) + 1;
        System.out.println("Tu defensa aumentó durante " + turnosMejora + "turnos");
        System.out.println(mejora.getDefensa() + " + " + random + " = " + mejoraDefensa);
    }

    public void subirAtaqueEsp() {
        int mejoraAtaqueEsp = 0;
        mejoraAtaqueEsp = mejora.getAtaqueEspecial() + random.nextInt(10) + 1;
        System.out.println("Tu ataque especial aumentó durante " + turnosMejora + "turnos");
        System.out.println(mejora.getAtaqueEspecial() + " + " + random + " = " + mejoraAtaqueEsp);
    }

    public void subirAtaque() {
        int mejoraAtaque = 0;
        mejoraAtaque = mejora.getAtaque() + random.nextInt(10) + 1;
        System.out.println("Tu ataque aumentó durante " + turnosMejora + "turnos");
        System.out.println(mejora.getAtaque() + " + " + random + " = " + mejoraAtaque);
    }

    public void bajarDefEsp() {
        int disminuirDefEsp = 0;
        disminuirDefEsp = mejora.getDefensaEspecial() - random.nextInt(10) + 1;
        System.out.println("La defensa especial del rival disminuyó durante " + turnosMejora + "turnos");
        System.out.println(mejora.getDefensaEspecial() + " + " + random + " = " + disminuirDefEsp);
    }

    public void bajarDef() {
        int disminuirDefensa = 0;
        disminuirDefensa = mejora.getDefensa() - random.nextInt(10) + 1;
        System.out.println("La defensa del rival disminuyó durante " + turnosMejora + "turnos");
        System.out.println(mejora.getDefensa() + " + " + random + " = " + disminuirDefensa);
    }

    public void bajarAtaqueEsp() {
        int disminuirAtaqueEsp = 0;
        disminuirAtaqueEsp = mejora.getAtaqueEspecial() - random.nextInt(10) + 1;
        System.out.println("El ataque especial del rival disminuyó durante " + turnosMejora + "turnos");
        System.out.println(mejora.getAtaqueEspecial() + " + " + random + " = " + disminuirAtaqueEsp);
    }

    public void bajarAtaque() {
        int disminuirAtaque = 0;
        disminuirAtaque = mejora.getAtaque() - random.nextInt(10) + 1;
        System.out.println("El ataque del rival disminuyó durante " + turnosMejora + "turnos");
        System.out.println(mejora.getAtaque() + " + " + random + " = " + disminuirAtaque);
    }

}