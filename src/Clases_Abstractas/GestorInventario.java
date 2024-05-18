package Clases_Abstractas;

public abstract class GestorInventario {

    public int cantidad;

    public GestorInventario(int cantidad) {
        this.cantidad = cantidad;
    }
    public int getCantidad(){
        return this.cantidad;
    }

    public abstract void añadirProducto(String producto, int cantidad);

    public abstract void eliminarProducto(String producto);

    public abstract void actualizarStock(String producto, int nuevaCantidad);
}