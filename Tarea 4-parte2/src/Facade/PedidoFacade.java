package Facade;

import Service.*;
import Adapter.FacturaService;
import Model.Pedido;

public class PedidoFacade {

    private final StockService stock = new StockService();
    private final PedidoRepository repo = new PedidoRepository();
    private final FacturaService factura;
    private ImpuestoStrategy impuesto; // ← STRATEGY

    public PedidoFacade(FacturaService factura) {
        this.factura = factura;
    }

    public void setImpuestoStrategy(ImpuestoStrategy impuesto) {
        this.impuesto = impuesto;
    }

    public void procesarPedido(String cliente, String producto, int cantidad, double precio) {

        if (!stock.validarStock(producto, cantidad)) {
            System.out.println("Stock insuficiente");
            return;
        }

        double subtotal = cantidad * precio;
        double igv = impuesto.calcular(subtotal);
        double total = subtotal + igv;

        Pedido pedido = new Pedido(cliente, producto, cantidad, subtotal, igv, total);
        repo.guardar(pedido);

        factura.generarFactura(cliente, producto, total);

        System.out.println("Pedido procesado correctamente");
        System.out.println("Cliente: " + cliente + " | Producto: " + producto);
        System.out.println("Subtotal: " + subtotal + " | IGV: " + igv + " | Total: " + total);
    }
}
