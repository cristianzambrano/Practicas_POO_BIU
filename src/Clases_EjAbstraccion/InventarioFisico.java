package Clases_EjAbstraccion;

import Clases_Abstractas.GestorInventario;

public class InventarioFisico extends GestorInventario {

    public InventarioFisico(int cantidad) {
        super(cantidad);
    }

    @Override
    public void añadirProducto(String producto, int cantidad) {
        System.out.println("Añadiendo " + cantidad + " unidades de " + producto + " al inventario físico.");
    }

    @Override
    public void eliminarProducto(String producto) {
        System.out.println("Eliminando " + producto + " del inventario físico.");
    }

    @Override
    public void actualizarStock(String producto, int nuevaCantidad) {
        System.out.println("Actualizando stock de " + producto + " a " + nuevaCantidad + " unidades en el inventario físico.");
    }
}
