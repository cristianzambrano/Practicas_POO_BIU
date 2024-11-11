package Clases_EjPolimorfismo;

import ClasesBases.Producto;

public class ProductoVIP extends Producto {

    public ProductoVIP(int ID) {
        super(ID);
    }

    public ProductoVIP(int ID, String Nombre, double precio, String bonus) {
        super(ID, Nombre, precio);
    }

    @Override
    public double calcularPrecio() {
        return this.precio +  this.precio * 0.20;
    }

    @Override
    public void entrega() {
        System.out.println("Entrega por Servicio VIP");
    }
}
