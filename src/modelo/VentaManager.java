package modelo;

import java.util.ArrayList;
import java.util.List;

public class VentaManager {
    private List<Venta> ventas;

    public VentaManager() {
        ventas = new ArrayList<>();
    }

    // Registrar una venta
    public void registrarVenta(Inventario inventario, String idProducto, int cantidad) {
        Producto producto = inventario.buscarProducto(idProducto);
        if (producto != null && producto.getCantidad() >= cantidad) {
            producto.setCantidad(producto.getCantidad() - cantidad); // Actualizar cantidad en inventario
            Venta venta = new Venta(producto, cantidad);
            ventas.add(venta);
            System.out.println("Venta registrada exitosamente.");
        } else {
            System.out.println("No hay suficiente cantidad de este producto o el producto no existe.");
        }
    }

    // Mostrar todas las ventas registradas
    public void mostrarVentas() {
        if (ventas.isEmpty()) {
            System.out.println("No se han realizado ventas.");
        } else {
            for (Venta venta : ventas) {
                venta.mostrarVenta();
                System.out.println("----------------------");
            }
        }
    }

    // Calcular el total de todas las ventas
    public double calcularTotalVentas() {
        double total = 0;
        for (Venta venta : ventas) {
            total += venta.getTotalVenta();
        }
        return total;
    }
}
