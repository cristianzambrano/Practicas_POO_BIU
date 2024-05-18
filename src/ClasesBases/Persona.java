package ClasesBases;

public class Persona {
    // Atributos privados de la clase Persona
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String direccion;

    // Constructor para inicializar los atributos de la clase
    public Persona(String nombre, String apellido, String email, String telefono, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }



    // Método para mostrar información básica de la persona
    public String toString() {
        return "Persona[nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
                + ", telefono=" + telefono + ", direccion=" + direccion + "]";
    }
}
