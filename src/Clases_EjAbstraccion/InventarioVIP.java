package Clases_EjAbstraccion;

import Clases_Abstractas.GestorInventario;

public class InventarioVIP extends GestorInventario {

    public InventarioVIP(int cantidad) {
        super(cantidad);
    }

    @Override
    public void añadirProducto(String producto, int cantidad) {
        System.out.println("Añadiendo " + cantidad + " unidades de " + producto + " al inventario VIP.");
    }

    @Override
    public void eliminarProducto(String producto) {
        System.out.println("Eliminando " + producto + " del inventario VIP.");
    }

    @Override
    public void actualizarStock(String producto, int nuevaCantidad) {
        System.out.println("Actualizando stock de " + producto + " a " + nuevaCantidad + " unidades en el inventario VIP.");
    }
}
