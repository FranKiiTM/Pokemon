package movimiento;

import pokemon.EnumTipo;

public class MovimientoMejora extends Movimiento{

    private int turnosMejora;
    private int mejora;

    public MovimientoMejora(EnumTipo tipoMovimiento, String nombreMov, int costeEstamina, int turnosMejora, int mejora) {
        super(tipoMovimiento, nombreMov, costeEstamina);
        this.turnosMejora = turnosMejora;
        this.mejora = mejora;
    }

    @Override
    public void gastoEstamina() {
        costeEstamina = turnosMejora * 10;
        //TODO: Pregunta a paco estamina
    }

    public void subirDefEsp(){
        
    }

    public void subirDef(){
        
    }

    public void subirAtaqueEsp(){
        
    }

    public void subirAtaque(){
        
    }

    public void bajarDefEsp(){
        
    }

    public void bajarDef(){
        
    }

    public void bajarAtaqueEsp(){
        
    }

    public void bajarAtaque(){
        
    }
    
}
