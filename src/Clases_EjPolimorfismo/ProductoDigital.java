package Clases_EjPolimorfismo;

import ClasesBases.Producto;

public class ProductoDigital extends Producto {

    public ProductoDigital(int ID) {
        super(ID);
    }

    public ProductoDigital(int ID, String Nombre, double precio) {
        super(ID, Nombre, precio);
    }

    @Override
    public double calcularPrecio() {
        return this.precio + this.precio * 0.10;
    }

    @Override
    public void entrega() {
        System.out.println("Entrega Digital");
    }
}
