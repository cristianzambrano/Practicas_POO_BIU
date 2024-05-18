package Clases_EjHerencia;

import ClasesBases.SeleccionFutbol;

public class Entrenador extends SeleccionFutbol {

    protected  int idFederecion;

    public Entrenador(int id, String nombres, String apellidos, int edad,
                      int idFederecion) {
        super(id, nombres, apellidos, edad);
        this.idFederecion = idFederecion;
    }

    public int getIdFederecion(){
        return idFederecion;
    }
}
