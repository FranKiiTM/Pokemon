package movimiento;

import pokemon.EnumTipo;

public class MovimientoAtaque extends Movimiento{

    private int potenciaAtaque;

    public MovimientoAtaque(EnumTipo tipoMovimiento, String nombreMov, int costeEstamina, int potenciaAtaque) {
        super(tipoMovimiento, nombreMov, costeEstamina);
        this.potenciaAtaque = potenciaAtaque;
    }

    @Override
    public void gastoEstamina() {       
    costeEstamina = potenciaAtaque / 2;
    //TODO: Preguntar estamina a paco        
    }
    
}
