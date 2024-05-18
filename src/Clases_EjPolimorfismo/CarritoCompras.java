package Clases_EjPolimorfismo;

import ClasesBases.Producto;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompras {
    protected List<Producto> listaProductos;

    public CarritoCompras() {
        this.listaProductos = new ArrayList<>();
    }

    public void agregarProducto(int ID, String Nombre, Double precio){
        Producto producto = new Producto(ID, Nombre, precio);
        this.listaProductos.add(producto);
    }
    public void agregarProducto(int ID){
        Producto producto = new Producto(ID);
        this.listaProductos.add(producto);
    }
    public void agregarProducto(int ID, String Nombre){
        Producto producto = new Producto(ID, Nombre);
        this.listaProductos.add(producto);
    }
    public void agregarProducto(Producto producto){
        Producto producto2 = new Producto(producto);
        this.listaProductos.add(producto2);
    }
}
