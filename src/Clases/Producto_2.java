package Clases;

public class Producto_2 {
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private double tasaIVA;
    private int stock;

    public Producto_2(int id, String nombre, String descripcion, double precio, int stock, double tasaIVA) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.tasaIVA = tasaIVA;
    }


    public String getNombre(){
        return this.nombre;
    }
    public String getDescripcion(){
        return this.descripcion;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio){
        if (precio >= 0) {
            this.precio -= precio;
        } else {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
    }

    public double calcularIVAEnDolares() {
        return precio * tasaIVA / 100;
    }

    public boolean existeStock() {
        return this.stock>0;
    }

    public void agregarAlStock(int cantidad) {
        this.stock += cantidad;
    }

    public void restarDelStock(int cantidad) {
        if (this.stock >= cantidad) {
            this.stock -= cantidad;
        } else {
            throw new IllegalArgumentException("No hay suficiente stock para realizar esta operación.");
        }
    }


    public String toString() {
        return "Producto[id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion
                + ", precio=" + precio + ", stock=" + stock + "]";
    }
}
