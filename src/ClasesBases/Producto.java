package ClasesBases;

public class Producto {

    protected int id;
    protected String descripcion;
    protected String marca;
    protected String color;
    protected double valor;
    protected double stock;
    protected double porcentajeiva;


    public Producto(int id, String descripcion, String marca,
                    String color, double valor, double stock, double porcentajeiva) {
        this.id = id;
        this.descripcion = descripcion;
        this.marca = marca;
        this.color = color;
        this.valor = valor;
        this.stock = stock;
        this.porcentajeiva = porcentajeiva;
    }
}
