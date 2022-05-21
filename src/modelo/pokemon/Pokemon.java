package modelo.pokemon;

import java.util.Random;

public class Pokemon {
    private String nombre;
    private String mote;
    private int vitalidad;
    private int ataque;
    private int ataqueEspecial;
    private int defensa;
    private int defensaEspecial;
    private int velocidad;
    private int estamina;
    private int nivel;
    //private ArrayList<Movimiento> listaMovimientos;
    private int experiencia;
    private int fertilidad;
    private EnumEstado estado;
    private EnumTipo tipo;

    public Pokemon(String nombre, String mote, int vitalidad, int ataque, int ataqueEspecial, int defensa, int defensaEspecial,
            int velocidad, int estamina, int nivel /*ArrayList<Movimiento> listaMovimientos*/, int experiencia, EnumEstado estado, EnumTipo tipo) {
        this.nombre = nombre;
        this.mote = mote;
        this.vitalidad = vitalidad;
        this.ataque = ataque;
        this.ataqueEspecial = ataqueEspecial;
        this.defensa = defensa;
        this.defensaEspecial = defensaEspecial;
        this.velocidad = velocidad;
        this.estamina = estamina;
        this.nivel = nivel;
        //this.listaMovimientos = new ArrayList<Movimiento>(4);
        this.experiencia = experiencia;
        this.fertilidad = 5;
        this.estado = estado;
        this.tipo = tipo;
    }
    public Pokemon(){

    }

    public int getAtaque() {
        return ataque;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getDefensaEspecial() {
        return defensaEspecial;
    }

    public EnumEstado getEstado() {
        return estado;
    }

    public int getEstamina() {
        return estamina;
    }

    public int getFertilidad() {
        return fertilidad;
    }

    public String getMote() {
        return mote;
    }

    public int getNivel() {
        return nivel;
    }

    // public ArrayList<Movimiento> getListaMovimientos() {
    //     return listaMovimientos;
    // }

    public int getExperiencia() {
        return experiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public EnumTipo getTipo() {
        return tipo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getVitalidad() {
        return vitalidad;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setAtaqueEspecial(int ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
    public void setDefensaEspecial(int defensaEspecial) {
        this.defensaEspecial = defensaEspecial;
    }

    public void setEstado(EnumEstado estado) {
        this.estado = estado;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    public void setFertilidad(int fertilidad) {
        this.fertilidad = fertilidad;
    }

    public void setMote(String mote) {
        this.mote = mote;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    // public void setListaMovimientos(ArrayList<Movimiento> listaMovimientos) {
    //     this.listaMovimientos = listaMovimientos;
    // }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(EnumTipo tipo) {
        this.tipo = tipo;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setVitalidad(int vitalidad) {
        this.vitalidad = vitalidad;
    }
    Random aleatorio = new Random();
    public boolean ganarExp(int xp) {
        experiencia += xp;
        if (experiencia >= nivel * 10) {
            nivel++;

            vitalidad += aleatorio.nextInt(5) + 1;
            ataque += aleatorio.nextInt(5) + 1;
            defensa += aleatorio.nextInt(5) + 1;
            ataqueEspecial += aleatorio.nextInt(5) + 1;
            defensaEspecial += aleatorio.nextInt(5) + 1;
            velocidad += aleatorio.nextInt(5) + 1;
        }
        return true;

    }

    public float atacar(Pokemon atacarAPokemon, MovimientoAtaque m) { //TODO: Atacar a otro Pokémon
        //HP= HP-((Potencia)*(Ventaja) + A-D)
        float ventajaEficaz = 1.5f;
        int ventajaNeutro = 1;
        float ventajaPocoEficaz = 0.5f;
        int vitalidadNueva = 0;
        if (vitalidad > 0 && ventajaEficaz == 1.5f) {
            vitalidadNueva =  (int) (vitalidad- (( m.getPotenciaAtaque() * 1.5)+ (ataqueEspecial - defensaEspecial)));
        }else if(vitalidad > 0 && ventajaNeutro == 1) {
            vitalidadNueva = (int) (vitalidad
                    - ((m.getPotenciaAtaque() * 1.5) + (ataqueEspecial - defensaEspecial)));
        }else if (vitalidad > 0 && ventajaPocoEficaz == 0.5f) {
            vitalidadNueva = (int) (vitalidad
                    - ((m.getPotenciaAtaque() * 1.5) + (ataqueEspecial - defensaEspecial)));
        }
        return vitalidadNueva;

    }

    public float comprobarVentaja(Pokemon pokemon) {
        float ventaja;
        if (this.getTipo() == EnumTipo.AGUA && pokemon.getTipo() == EnumTipo.FUEGO) {
            ventaja = 1.5f;
            System.out.println("Tienes ventaja!");
        }

        else if (this.getTipo() == EnumTipo.AGUA && pokemon.getTipo() == EnumTipo.TIERRA) {
            ventaja = 1.5f;
            System.out.println("Tienes ventaja!");
        }

        else if (this.getTipo() == EnumTipo.FUEGO && pokemon.getTipo() == EnumTipo.PLANTA) {
            ventaja = 1.5f;
            System.out.println("Tienes ventaja!");
        }

        else if (this.getTipo() == EnumTipo.FUEGO && pokemon.getTipo() == EnumTipo.BICHO) {
            ventaja = 1.5f;
            System.out.println("Tienes ventaja!");
        }

        else if (this.getTipo() == EnumTipo.PLANTA && pokemon.getTipo() == EnumTipo.AGUA) {
            ventaja = 1.5f;
            System.out.println("Tienes ventaja!");
        }

        else if (this.getTipo() == EnumTipo.PLANTA && pokemon.getTipo() == EnumTipo.TIERRA) {

            ventaja = 1.5f;
            System.out.println("Tienes ventaja!");
        }

        else if (this.getTipo() == EnumTipo.BICHO && pokemon.getTipo() == EnumTipo.PLANTA) {
            ventaja = 1.5f;
            System.out.println("Tienes ventaja!");
        }

        else if (this.getTipo() == EnumTipo.VOLADOR && pokemon.getTipo() == EnumTipo.PLANTA) {
            ventaja = 1.5f;
            System.out.println("Tienes ventaja!");
        }

        else if (this.getTipo() == EnumTipo.VOLADOR && pokemon.getTipo() == EnumTipo.BICHO) {
            ventaja = 1.5f;
            System.out.println("Tienes ventaja!");
        }

        else if (this.getTipo() == EnumTipo.ELECTRICO && pokemon.getTipo() == EnumTipo.AGUA) {
            ventaja = 1.5f;
            System.out.println("Tienes ventaja!");
        }

        else if (this.getTipo() == EnumTipo.TIERRA && pokemon.getTipo() == EnumTipo.ELECTRICO) {
            ventaja = 1.5f;
            System.out.println("Tienes ventaja!");
        }

        else if (this.getTipo() == EnumTipo.TIERRA && pokemon.getTipo() == EnumTipo.FUEGO) {
            ventaja = 1.5f;
            System.out.println("Tienes ventaja!");
        }

        else if (this.getTipo() == EnumTipo.TIERRA && pokemon.getTipo() == EnumTipo.FUEGO) {
            ventaja = 1.5f;
            System.out.println("Tienes ventaja!");
        }

        else if (this.getTipo() == EnumTipo.AGUA && pokemon.getTipo() == EnumTipo.VOLADOR
                || pokemon.getTipo() == EnumTipo.BICHO) {
            ventaja = 1f;
            System.out.println("Neutro");
        }

        else if (this.getTipo() == EnumTipo.FUEGO && pokemon.getTipo() == EnumTipo.ELECTRICO
                || pokemon.getTipo() == EnumTipo.TIERRA || pokemon.getTipo() == EnumTipo.VOLADOR) {
            ventaja = 1f;
            System.out.println("Neutro");
        }

        else if (this.getTipo() == EnumTipo.PLANTA && pokemon.getTipo() == EnumTipo.ELECTRICO) {
            ventaja = 1f;
            System.out.println("Neutro");
        }

        else if (this.getTipo() == EnumTipo.BICHO && pokemon.getTipo() == EnumTipo.AGUA
                || pokemon.getTipo() == EnumTipo.BICHO || pokemon.getTipo() == EnumTipo.ELECTRICO
                || pokemon.getTipo() == EnumTipo.TIERRA) {
            ventaja = 1f;
            System.out.println("Neutro");
        }

        else if (this.getTipo() == EnumTipo.ELECTRICO && pokemon.getTipo() == EnumTipo.BICHO
                || pokemon.getTipo() == EnumTipo.ELECTRICO || pokemon.getTipo() == EnumTipo.FUEGO) {
            ventaja = 1f;
            System.out.println("Neutro");
        }

        else if (this.getTipo() == EnumTipo.VOLADOR && pokemon.getTipo() == EnumTipo.AGUA
                || pokemon.getTipo() == EnumTipo.FUEGO || pokemon.getTipo() == EnumTipo.TIERRA
                || pokemon.getTipo() == EnumTipo.VOLADOR) {
            ventaja = 1f;
            System.out.println("Neutro");
        }

        else if (this.getTipo() == EnumTipo.TIERRA && pokemon.getTipo() == EnumTipo.AGUA
                || pokemon.getTipo() == EnumTipo.TIERRA) {
            ventaja = 1f;
            System.out.println("Neutro");
        }

        else {
            ventaja = 0.5f;
            System.out.println("Tu rival tiene ventaja.");
        }
        return ventaja;

    }

    public boolean subirNivel() {
        if (this.experiencia < (this.nivel * 10)) {
            return false;
        } else {
            System.out.println("!Tu Pokemon ha subido de nivel!");
            this.nivel++;

            int subirN;
            subirN = (int) (Math.random() * 3 + 1);
            System.out.println("Vitalidad + " + subirN);
            this.setVitalidad(this.vitalidad + subirN);

            subirN = (int) (Math.random() * 3 + 1);
            System.out.println("Estamina + " + subirN);
            this.setEstamina(this.estamina + subirN);

            subirN = (int) (Math.random() * 4 + 1);
            System.out.println("Ataque + " + subirN);
            this.setAtaque(this.ataque + subirN);

            subirN = (int) (Math.random() * 4 + 1);
            System.out.println("Defensa + " + subirN);
            this.setDefensa(this.defensa + subirN);

            subirN = (int) (Math.random() * 4 + 1);
            System.out.println("Ataque especial + " + subirN);
            this.setAtaqueEspecial(this.ataqueEspecial + subirN);

            subirN = (int) (Math.random() * 4 + 1);
            System.out.println("Defensa especial + " + subirN);
            this.setDefensaEspecial(this.defensaEspecial + subirN);

            subirN = (int) (Math.random() * 4 + 1);
            System.out.println("Velocidad + " + subirN);
            this.setVelocidad(this.velocidad + subirN);

        }
        return true;

    }

    public String aprenderAtaque(String ataqueNuevo) {

        return ataqueNuevo;

    }

    public int descansar() {
        return ataque;

    }
}