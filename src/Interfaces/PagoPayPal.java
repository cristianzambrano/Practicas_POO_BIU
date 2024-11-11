package Interfaces;

public class PagoPayPal implements ProcesoPago {
    private double monto;

    @Override
    public void iniciarPago(double monto) {
        this.monto = monto;
        System.out.println("Iniciando pago con PayPal por el monto: $" + monto);
    }

    @Override
    public boolean verificarPago() {
        System.out.println("Verificando el pago con PayPal...");
        return true;
    }

    @Override
    public void confirmarPago() {
        System.out.println("Pago con PayPal confirmado por el monto: $" + monto);
    }
}
