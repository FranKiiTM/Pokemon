package pokemon;

import java.util.ArrayList;
import java.util.Random;

import pokemon.enumerados.EnumEstado;
import pokemon.enumerados.EnumTipo;
import pokemon.movimientos.Movimiento;

public class Pokemon implements IMecanicaCaptura {
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
    private ArrayList<Movimiento> listaMovimientos;
    private int experiencia;
    private int fertilidad;
    private EnumEstado estado;
    private EnumTipo tipo;
    private int vitalidadMax;
    private int estaminaMax;

    public Pokemon(String nombre, String mote, int vitalidad, int ataque, int ataqueEspecial, int defensa,int defensaEspecial,
            int velocidad, int estamina, int nivel, ArrayList<Movimiento> listaMovimientos, int experiencia,EnumEstado estado, 
            EnumTipo tipo, int vitalidadMax, int estaminaMax) {
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
        this.listaMovimientos = new ArrayList<Movimiento>(4);
        this.experiencia = experiencia;
        this.fertilidad = 5;
        this.estado = estado;
        this.tipo = tipo;
        this.vitalidadMax = vitalidadMax;
        this.estaminaMax = estaminaMax;

    }

    public Pokemon() {
    }

    public int getAtaque() {
        return ataque;
    }

    public int getEstaminaMax() {
        return estaminaMax;
    }

    public int getVitalidadMax() {
        return vitalidadMax;
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

    public ArrayList<Movimiento> getListaMovimientos() {
        return listaMovimientos;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public EnumTipo getEnumTipo() {
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

    public void setEstaminaMax(int estaminaMax) {
        this.estaminaMax = estaminaMax;
    }

    public void setVitalidadMax(int vitalidadMax) {
        this.vitalidadMax = vitalidadMax;
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

    public void setListaMovimientos(ArrayList<Movimiento> listaMovimientos) {
        this.listaMovimientos = listaMovimientos;
    }

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

    public float atacar(int ataque, Pokemon pokemonRival) {
        // HP= HP-((Potencia)*(Ventaja) + A-D)

        float ventaja = comprobarVentaja(pokemonRival);
        if ((vitalidad - (listaMovimientos.get(ataque).getPotencia() * ventaja + (ataqueEspecial - defensaEspecial))) > 0) {
            pokemonRival.setVitalidad((int) (vitalidad
                    - (listaMovimientos.get(ataque).getPotencia() * ventaja + (ataqueEspecial - defensaEspecial))));
        } else {
            System.out.println("El pokemon enemigo ha sido derrotado");
        }
        if (vitalidad > 0 && ventaja == 1.5f) {

        }
        return vitalidad;

    }

    public float comprobarVentaja(Pokemon pokemon) {
        float ventaja;
        if (this.getEnumTipo() == EnumTipo.AGUA && pokemon.getEnumTipo() == EnumTipo.FUEGO) {
            ventaja = 1.5f;
            System.out.println("Tienes ventaja!");
        }

        else if (this.getEnumTipo() == EnumTipo.AGUA && pokemon.getEnumTipo() == EnumTipo.TIERRA) {
            ventaja = 1.5f;
            System.out.println("Tienes ventaja!");
        }

        else if (this.getEnumTipo() == EnumTipo.FUEGO && pokemon.getEnumTipo() == EnumTipo.PLANTA) {
            ventaja = 1.5f;
            System.out.println("Tienes ventaja!");
        }

        else if (this.getEnumTipo() == EnumTipo.FUEGO && pokemon.getEnumTipo() == EnumTipo.BICHO) {
            ventaja = 1.5f;
            System.out.println("Tienes ventaja!");
        }

        else if (this.getEnumTipo() == EnumTipo.PLANTA && pokemon.getEnumTipo() == EnumTipo.AGUA) {
            ventaja = 1.5f;
            System.out.println("Tienes ventaja!");
        }

        else if (this.getEnumTipo() == EnumTipo.PLANTA && pokemon.getEnumTipo() == EnumTipo.TIERRA) {

            ventaja = 1.5f;
            System.out.println("Tienes ventaja!");
        }

        else if (this.getEnumTipo() == EnumTipo.BICHO && pokemon.getEnumTipo() == EnumTipo.PLANTA) {
            ventaja = 1.5f;
            System.out.println("Tienes ventaja!");
        }

        else if (this.getEnumTipo() == EnumTipo.VOLADOR && pokemon.getEnumTipo() == EnumTipo.PLANTA) {
            ventaja = 1.5f;
            System.out.println("Tienes ventaja!");
        }

        else if (this.getEnumTipo() == EnumTipo.VOLADOR && pokemon.getEnumTipo() == EnumTipo.BICHO) {
            ventaja = 1.5f;
            System.out.println("Tienes ventaja!");
        }

        else if (this.getEnumTipo() == EnumTipo.ELECTRICO && pokemon.getEnumTipo() == EnumTipo.AGUA) {
            ventaja = 1.5f;
            System.out.println("Tienes ventaja!");
        }

        else if (this.getEnumTipo() == EnumTipo.TIERRA && pokemon.getEnumTipo() == EnumTipo.ELECTRICO) {
            ventaja = 1.5f;
            System.out.println("Tienes ventaja!");
        }

        else if (this.getEnumTipo() == EnumTipo.TIERRA && pokemon.getEnumTipo() == EnumTipo.FUEGO) {
            ventaja = 1.5f;
            System.out.println("Tienes ventaja!");
        }

        else if (this.getEnumTipo() == EnumTipo.TIERRA && pokemon.getEnumTipo() == EnumTipo.FUEGO) {
            ventaja = 1.5f;
            System.out.println("Tienes ventaja!");
        }

        else if (this.getEnumTipo() == EnumTipo.AGUA && pokemon.getEnumTipo() == EnumTipo.VOLADOR
                || pokemon.getEnumTipo() == EnumTipo.BICHO) {
            ventaja = 1f;
            System.out.println("Neutro");
        }

        else if (this.getEnumTipo() == EnumTipo.FUEGO && pokemon.getEnumTipo() == EnumTipo.ELECTRICO
                || pokemon.getEnumTipo() == EnumTipo.TIERRA || pokemon.getEnumTipo() == EnumTipo.VOLADOR) {
            ventaja = 1f;
            System.out.println("Neutro");
        }

        else if (this.getEnumTipo() == EnumTipo.PLANTA && pokemon.getEnumTipo() == EnumTipo.ELECTRICO) {
            ventaja = 1f;
            System.out.println("Neutro");
        }

        else if (this.getEnumTipo() == EnumTipo.BICHO && pokemon.getEnumTipo() == EnumTipo.AGUA
                || pokemon.getEnumTipo() == EnumTipo.BICHO || pokemon.getEnumTipo() == EnumTipo.ELECTRICO
                || pokemon.getEnumTipo() == EnumTipo.TIERRA) {
            ventaja = 1f;
            System.out.println("Neutro");
        }

        else if (this.getEnumTipo() == EnumTipo.ELECTRICO && pokemon.getEnumTipo() == EnumTipo.BICHO
                || pokemon.getEnumTipo() == EnumTipo.ELECTRICO || pokemon.getEnumTipo() == EnumTipo.FUEGO) {
            ventaja = 1f;
            System.out.println("Neutro");
        }

        else if (this.getEnumTipo() == EnumTipo.VOLADOR && pokemon.getEnumTipo() == EnumTipo.AGUA
                || pokemon.getEnumTipo() == EnumTipo.FUEGO || pokemon.getEnumTipo() == EnumTipo.TIERRA
                || pokemon.getEnumTipo() == EnumTipo.VOLADOR) {
            ventaja = 1f;
            System.out.println("Neutro");
        }

        else if (this.getEnumTipo() == EnumTipo.TIERRA && pokemon.getEnumTipo() == EnumTipo.AGUA
                || pokemon.getEnumTipo() == EnumTipo.TIERRA) {
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
            this.setVitalidadMax(this.vitalidadMax + subirN);

            subirN = (int) (Math.random() * 3 + 1);
            System.out.println("Estamina + " + subirN);
            this.setEstaminaMax(this.estaminaMax + subirN);

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

    public void aprenderAtaque(ArrayList<Movimiento> lMovimientos) {
        if (nivel % 3 != 0) {
        } else {

        }
    }

    public int descansar() {
        int estaminatotal = 0;
        estaminatotal = estaminaMax;
        return estaminatotal;
    }

    @Override
    public void generarPokemon() {
        Random r = new Random();
        Pokemon p = new Pokemon();
        p.setVitalidad(r.nextInt(10) + 1);
        p.setAtaque(r.nextInt(5) + 1);
        p.setAtaqueEspecial(r.nextInt(5) + 1);
        p.setDefensa(r.nextInt(5) + 1);
        p.setDefensaEspecial(r.nextInt(5) + 1);
        p.setDefensaEspecial(r.nextInt(5) + 1);
        p.setVelocidad(r.nextInt(5) + 1);
        p.setEstamina(r.nextInt(10) + 1);
        p.setFertilidad(5);
        p.setNivel(1);
    }

    @Override
    public boolean capturarPokemon() {
        Random ra = new Random();
        int nAleatorio = ra.nextInt(4);
        if (nAleatorio == 3) {
            return false;
        } else {
            generarPokemon();
            return true;
        }
    }
}
