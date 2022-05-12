package modelo.moviento;

import modelo.pokemon.EnumTipo;

public class MovimientoAtaque extends Movimiento{

    private int potenciaAtaque;

    public MovimientoAtaque(EnumTipo tipoMovimiento, String nombreMov, int costeEstamina, int potenciaAtaque) {
        super(tipoMovimiento, nombreMov, costeEstamina);
        this.potenciaAtaque = potenciaAtaque;
    }

    @Override
    public int gastoEstamina() {       
    return costeEstamina = potenciaAtaque / 2;        
    }

    public void ataque(){
        //TODO: preguntar vitalidad a paco
    }
    
}