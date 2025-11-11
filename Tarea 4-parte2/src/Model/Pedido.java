package Model;

public class Pedido {
    public String cliente;
    public String producto;
    public int cantidad;
    public double subtotal;
    public double impuesto;
    public double total;

    public Pedido(String cliente, String producto, int cantidad, double subtotal, double impuesto, double total) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.impuesto = impuesto;
        this.total = total;
    }
}
