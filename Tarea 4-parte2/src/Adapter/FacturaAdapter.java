package Adapter;

import Legacy.LegacyBillingSystem;

public class FacturaAdapter implements FacturaService {
    private final LegacyBillingSystem legacy = new LegacyBillingSystem();

    public void generarFactura(String cliente, String producto, double total) {
        legacy.emitirFactura(cliente, "Producto: " + producto, total);
    }
}
