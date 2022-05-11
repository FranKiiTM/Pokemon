package modelo.pokemon.movimientos;

import java.util.ArrayList;

import modelo.pokemon.enumerados.EnumTipo;

public abstract class Movimiento {
    protected static ArrayList<Movimiento> movimientos;
    protected static int potencia;
    private EnumTipo tipoMovimiento;
    private String nombreMov;
    protected int costeEstamina;

    public Movimiento(EnumTipo tipoMovimiento, String nombreMov, int costeEstamina, ArrayList<Movimiento> movimientos,
            int potencia) {
        this.tipoMovimiento = tipoMovimiento;
        this.nombreMov = nombreMov;
        this.costeEstamina = costeEstamina;
        Movimiento.movimientos = movimientos;
        Movimiento.potencia = potencia;
    }

    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }

    public int getCosteEstamina() {
        return costeEstamina;
    }

    public String getNombreMov() {
        return nombreMov;
    }

    public EnumTipo getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setMovimientos(ArrayList<Movimiento> movimientos) {
        Movimiento.movimientos = movimientos;
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

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        Movimiento.potencia = potencia;
    }

    public abstract void gastoEstamina();
}
