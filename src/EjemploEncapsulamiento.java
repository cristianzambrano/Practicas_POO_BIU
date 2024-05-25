import Clases.Producto_2;
import Clases_Encapsulamiento.CuentaBancaria;
import Clases_Encapsulamiento.Persona;

public class EjemploEncapsulamiento {

    public static void main(String[] args) {
        // Crear una instancia de Persona
       /* Persona persona = new Persona("Alice", 30);

        // Usar getter para obtener el valor de los atributos
        System.out.println("Nombre: " + persona.getNombre());  // Nombre: Alice
        System.out.println("Edad: " + persona.getEdad());      // Edad: 30

        // Usar setter para modificar el valor de los atributos
        persona.setNombre("Bob");
        persona.setEdad(-10);

        // Usar getter para obtener el valor modificado de los atributos
        System.out.println("Nombre: " + persona.getNombre());  // Nombre: Bob
        System.out.println("Edad: " + persona.getEdad());      // Edad: 35*/


        CuentaBancaria cuenta = new CuentaBancaria("1234567890", 1000.0);
        System.out.println("Saldo inicial: " + cuenta.getSaldo());

        cuenta.depositar(0);
        System.out.println("Saldo después de depositar: " + cuenta.getSaldo());
        cuenta.retirar(2000);

        System.out.println("Saldo después de retirar: " + cuenta.getSaldo());

        /*Producto_2 productoTVLG = new Producto_2(1, "TV","TV LG",
                                            1000,10,12);

        System.out.println("El nombre del producto es : " + productoTVLG.getNombre());
        System.out.println("La descripció del producto es : " + productoTVLG.getDescripcion());

        productoTVLG.setPrecio(-20);*/

    }
}
