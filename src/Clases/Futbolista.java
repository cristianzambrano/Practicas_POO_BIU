package Clases;

public class Futbolista extends SeleccionFutbol {
    protected int dorsal;
    protected String demarcacion;

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);

        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }


    public void jugarPartido() {

    }

    public void entrenar() {

    }
}