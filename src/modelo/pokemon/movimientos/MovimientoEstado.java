package modelo.pokemon.movimientos;

import java.util.Random;

import modelo.pokemon.enumerados.EnumEstado;
import modelo.pokemon.enumerados.EnumTipo;

public class MovimientoEstado extends Movimiento {

    Random random = new Random();

    private EnumEstado estadoMovimiento;
    private int turnosEstado;

    public MovimientoEstado(EnumTipo tipoMovimiento, String nombreMov, int costeEstamina, EnumEstado estadoMovimiento) {
        super(tipoMovimiento, nombreMov, costeEstamina, movimientos, costeEstamina);
        this.estadoMovimiento = estadoMovimiento;
        this.turnosEstado = random.nextInt(3) + 1;
    }

    @Override
    public void gastoEstamina() {
        costeEstamina = turnosEstado * 10;
        // TODO: Pregunta a paco estamina
    }

    public void ataqueEstado() {
        System.out.println(estadoMovimiento + " durante " + turnosEstado + " turnos");
    }

}
