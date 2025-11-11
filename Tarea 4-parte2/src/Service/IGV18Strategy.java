package Service;

public class IGV18Strategy implements ImpuestoStrategy {
    public double calcular(double subtotal) {
        return subtotal * 0.18;
    }
}