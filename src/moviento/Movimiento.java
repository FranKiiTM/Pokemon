package moviento;

import pokemon.EnumTipo;

public abstract class Movimiento {

    private EnumTipo tipoMovimiento;
    private String nombreMov;
    protected int costeEstamina;

    public Movimiento(EnumTipo tipoMovimiento, String nombreMov, int costeEstamina){
        this.tipoMovimiento = tipoMovimiento;
        this.nombreMov = nombreMov;
        this.costeEstamina = costeEstamina;
    }

    public abstract int gastoEstamina();

    public int getCosteEstamina() {
        return costeEstamina;
    }
}

