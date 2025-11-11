package Legacy;

public class LegacyBillingSystem {
    public void emitirFactura(String cliente, String detalle, double monto) {
        System.out.println("Factura emitida (LEGACY): " + cliente + " - " + detalle + " - Total: " + monto);
    }
}
