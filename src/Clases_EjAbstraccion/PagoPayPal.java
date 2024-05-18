package Clases_EjAbstraccion;

import Clases_Abstractas.SistemaPago;

public class PagoPayPal extends SistemaPago {
    @Override
    public void iniciarPago() {
        System.out.println("Iniciando Pago con PayPal");
    }

    @Override
    public void verificarPago() {
        System.out.println("Pago realizado Correctamete con PayPal");
    }

    @Override
    public void confirmarPago() {
        System.out.println("Pago confirmado Correctamete con PayPal");
    }
}
