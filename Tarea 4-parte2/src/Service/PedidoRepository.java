package Service;

import java.util.ArrayList;
import java.util.List;
import Model.Pedido;

public class PedidoRepository {
    private List<Pedido> pedidos = new ArrayList<>();

    public void guardar(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido guardado en repositorio.");
    }

    public List<Pedido> obtenerTodos() {
        return pedidos;
    }
}
