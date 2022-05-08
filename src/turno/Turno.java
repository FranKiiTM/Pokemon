package turno;

public class Turno {

    private int numTurno;

    public Turno(int numTurno){
        this.numTurno = 1;
    }

    public int getNumTurno() {
        return numTurno;
    }

    public void setNumTurno(int numTurno) {
        this.numTurno = numTurno;
    }

    public void accionEntrenador(){
        System.out.println("Turno "+numTurno);
        
    }

    public void accionRival(){
        System.out.println("Turno "+numTurno);
    }
    
}
