package Clases_Abstractas;

public abstract class GestorInventario {

    public abstract void añadirProducto(String producto, int cantidad);

    public abstract void eliminarProducto(String producto);

    public abstract void actualizarStock(String producto, int nuevaCantidad);
}