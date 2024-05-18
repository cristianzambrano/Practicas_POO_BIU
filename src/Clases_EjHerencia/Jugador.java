package Clases_EjHerencia;

import ClasesBases.SeleccionFutbol;

public class Jugador extends SeleccionFutbol {

    protected int dorsal;
    protected String demarcacion;
    public Jugador(int id, String nombres, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombres, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public String getDemarcacionyDorsal() {
        return demarcacion +  " " + Integer.toString(dorsal);
    }
}
