package Clases_EjAbstraccion;

import Clases_Abstractas.GestorInventario;

public class InventarioDigital extends GestorInventario {

    @Override
    public void añadirProducto(String producto, int cantidad) {
        System.out.println("Añadiendo " + cantidad + " unidades de " + producto + " al inventario digital.");
    }

    @Override
    public void eliminarProducto(String producto) {
        System.out.println("Eliminando " + producto + " del inventario digital.");
    }

    @Override
    public void actualizarStock(String producto, int nuevaCantidad) {
        System.out.println("Actualizando stock de " + producto + " a " + nuevaCantidad + " unidades en el inventario digital.");
    }
}