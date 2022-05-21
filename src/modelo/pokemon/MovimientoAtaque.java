package modelo.pokemon;

public class MovimientoAtaque extends Movimiento{

    private static int potenciaAtaque;

    public MovimientoAtaque(EnumTipo tipoMovimiento, String nombreMov, int costeEstamina, int potenciaAtaque) {
        super(tipoMovimiento, nombreMov, costeEstamina);
        MovimientoAtaque.potenciaAtaque = potenciaAtaque;
    }

    @Override
    public int gastoEstamina() {       
    return costeEstamina = potenciaAtaque / 2;        
    }

    public static int getPotenciaAtaque() {
        return potenciaAtaque;
    }
    
    
}