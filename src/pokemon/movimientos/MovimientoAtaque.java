package pokemon.movimientos;

import pokemon.enumerados.EnumTipo;

public class MovimientoAtaque extends Movimiento {

    private int potenciaAtaque;

    public MovimientoAtaque(EnumTipo tipoMovimiento, String nombreMov, int costeEstamina, int potenciaAtaque) {
        super(tipoMovimiento, nombreMov, costeEstamina, movimientos, potenciaAtaque);
        this.potenciaAtaque = potenciaAtaque;
    }

    @Override
    public void gastoEstamina() {
        costeEstamina = potenciaAtaque / 2;
    }

    public void ataque() {
    }

}
