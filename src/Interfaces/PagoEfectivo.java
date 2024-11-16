package Interfaces;

public class PagoEfectivo implements ProcesoPago{
    private double monto;
    @Override
    public void iniciarPago(double monto) {
        this.monto = monto;
        System.out.println("Inicializado Pago Efectivo. Valor " + this.monto);
    }

    @Override
    public boolean verificarPago() {
        System.out.println("Verificando Pago Efectivo. Valor " + this.monto);
        return false;
    }

    @Override
    public void confirmarPago() {
        System.out.println("Confirmación Pago Efectivo. Valor " + this.monto);
    }
}
