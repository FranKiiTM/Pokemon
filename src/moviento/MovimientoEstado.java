package moviento;

import pokemon.EnumEstado;
import pokemon.EnumTipo;
import java.util.Random;

public class MovimientoEstado extends Movimiento{
    Random random = new Random();

    private EnumEstado estadoMovimiento;
    private int turnosEstado;

    public MovimientoEstado(EnumTipo tipoMovimiento, String nombreMov, int costeEstamina, EnumEstado estadoMovimiento) {
        super(tipoMovimiento, nombreMov, costeEstamina);
        this.estadoMovimiento = estadoMovimiento;
        this.turnosEstado = random.nextInt(3)+1;
    }

    @Override
    public int gastoEstamina() {
        return costeEstamina = turnosEstado * 10;
    }

    public void ataqueEstado(){
        System.out.println(estadoMovimiento+" durante "+turnosEstado+" turnos");
    }
    
}
