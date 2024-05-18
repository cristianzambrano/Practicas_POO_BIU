package Clases_EjAbstraccion;

import Clases_Abstractas.SistemaPago;

public class PagoTarjetaCredito extends SistemaPago {
    @Override
    public void iniciarPago() {
        System.out.println("Iniciando Pago con Tarjetas de Crédito");
    }

    @Override
    public void verificarPago() {
        System.out.println("Pago realizado Correctamete con Tarjetas de Crédito");
    }

    @Override
    public void confirmarPago() {
        System.out.println("Pago confirmado Correctamete con Tarjetas de Crédito");
    }
}
