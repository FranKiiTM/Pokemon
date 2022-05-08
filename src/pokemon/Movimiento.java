package pokemon;

import java.util.ArrayList;

public class Movimiento {
    private ArrayList<Movimiento> movimientos;
    protected int potencia;

    public Movimiento(ArrayList<Movimiento> movimientos, int potencia) {
        this.movimientos = movimientos;
        this.potencia = potencia;
    }

    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(ArrayList<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
