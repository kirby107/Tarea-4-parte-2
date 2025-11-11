package Service;

public class StockService {
    public boolean validarStock(String producto, int cantidad) {
        return cantidad > 0; // Simple
    }
}
