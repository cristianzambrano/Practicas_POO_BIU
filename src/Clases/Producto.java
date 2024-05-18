package Clases;

public class Producto {
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private double tasaIVA;
    private int stock;

    public Producto(int id, String nombre, String descripcion, double precio, int stock, double tasaIVA) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.tasaIVA = tasaIVA;
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
