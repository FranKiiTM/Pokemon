package modelo.moviento;

import modelo.pokemon.EnumTipo;

public abstract class Movimiento {

    private EnumTipo tipoMovimiento;
    private String nombreMov;
    protected int costeEstamina;

    public Movimiento(EnumTipo tipoMovimiento, String nombreMov, int costeEstamina){
        this.tipoMovimiento = tipoMovimiento;
        this.nombreMov = nombreMov;
        this.costeEstamina = costeEstamina;
    }

    public String getNombreMov() {
        return nombreMov;
    }
    public EnumTipo getTipoMovimiento() {
        return tipoMovimiento;
    }
    public int getCosteEstamina() {
        return costeEstamina;
    }
    
    public void setCosteEstamina(int costeEstamina) {
        this.costeEstamina = costeEstamina;
    }

    public void setNombreMov(String nombreMov) {
        this.nombreMov = nombreMov;
    }

    public void setTipoMovimiento(EnumTipo tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public abstract int gastoEstamina();

}

