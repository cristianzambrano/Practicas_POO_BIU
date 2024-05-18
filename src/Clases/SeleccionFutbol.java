package Clases;

public class SeleccionFutbol
{

    protected int id;
    protected String Nombre;
    protected String Apellidos;
    protected int Edad;

    public SeleccionFutbol(int id, String nombre, String apellidos, int edad)
    {
        this.id = id;
        this.Nombre = nombre;
        this.Apellidos = apellidos;
        this.Edad = edad;
    }

    public void Concentrarse()
    {
        System.out.println("Concentrase");

    }

    public void Viajar()
    {
        System.out.println("Viajar");
    }
}