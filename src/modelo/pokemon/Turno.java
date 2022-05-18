package modelo.pokemon;

public class Turno {

    private int numTurno;
    private String accionEntrenador;
    private String accionRival;

    public Turno(int numTurno, String accionEntrenador, String accionRival) {
        this.numTurno = numTurno;
        this.accionEntrenador = accionEntrenador;
        this.accionRival = accionRival;
    }

    public int getNumTurno() {
        return numTurno;
    }

    public String getAccionEntrenador() {
        return accionEntrenador;
    }

    public String getAccionRival() {
        return accionRival;
    }

    public void setNumTurno(int numTurno) {
        this.numTurno = numTurno;
    }

    public void setAccionEntrenador(String accionEntrenador) {
        this.accionEntrenador = accionEntrenador;
    }

    public void setAccionRival(String accionRival) {
        this.accionRival = accionRival;
    }
}