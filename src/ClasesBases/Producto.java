package ClasesBases;

public class Producto {
    public int ID;
    public String Nombre;
    public double precio;

    public Producto(Producto producto) {
        this.ID = producto.ID;
        Nombre = producto.Nombre;
        this.precio = producto.precio;
    }

    public Producto(int ID, String nombre, double precio) {
        this.ID = ID;
        Nombre = nombre;
        this.precio = precio;
    }

    public Producto(int ID) {
        this.ID = ID;
        Nombre = "Producto Sin Nombre";
        this.precio = 0.00;
    }

    public Producto(int ID, String nombre) {
        this.ID = ID;
        Nombre = nombre;
        this.precio = 0.00;
    }

    public void entrega(){
        System.out.println("Entrega  de Producto Genèrico");
    }

    public double calcularPrecio(){
        return precio;
    }
}
