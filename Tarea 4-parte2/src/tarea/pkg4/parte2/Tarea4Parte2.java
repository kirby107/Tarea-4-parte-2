/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg4.parte2;

import Facade.PedidoFacade;
import Adapter.FacturaAdapter;
import Service.IGV18Strategy;

public class Tarea4Parte2 {
    public static void main(String[] args) {
        PedidoFacade facade = new PedidoFacade(new FacturaAdapter());

        // Elegir estrategia (puedes cambiarla)
        facade.setImpuestoStrategy(new IGV18Strategy());
        // facade.setImpuestoStrategy(new ExoneradoStrategy());

        facade.procesarPedido("Juan Perez", "Laptop", 1, 2500.0);
    }
}
