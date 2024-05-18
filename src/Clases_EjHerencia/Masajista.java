package Clases_EjHerencia;

import ClasesBases.SeleccionFutbol;

public class Masajista  extends SeleccionFutbol {

    protected String Titulo;
    protected int AniosExperiencia;

    public Masajista(int id, String nombres, String apellidos, int edad,
                     String  Titulo, int AniosExperiencia) {
        super(id, nombres, apellidos, edad);

        this.AniosExperiencia= AniosExperiencia;
        this.Titulo = Titulo;
    }

    public String getTitulo(){
        return Titulo;
    }
}
