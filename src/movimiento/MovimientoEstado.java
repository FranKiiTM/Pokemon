package movimiento;

import pokemon.EnumEstado;
import pokemon.EnumTipo;

public class MovimientoEstado extends Movimiento{

    private EnumEstado estadoMovimiento;
    private int turnosEstado;

    public MovimientoEstado(EnumTipo tipoMovimiento, String nombreMov, int costeEstamina, EnumEstado estadoMovimiento, int turnosEstado) {
        super(tipoMovimiento, nombreMov, costeEstamina);
        this.estadoMovimiento = estadoMovimiento;
        this.turnosEstado = turnosEstado;
    }

    @Override
    public void gastoEstamina() {
        costeEstamina = turnosEstado * 10;
        //TODO: Pregunta a paco estamina
    }
    
}
