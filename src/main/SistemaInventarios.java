package main;

import modelo.*;

public class SistemaInventarios {
    public static void main(String[] args) {
        // Crear inventario
        Inventario inventario = new Inventario();

        // Crear algunos productos
        Producto p1 = new Producto("001", "Laptop", 10, 1000.0, "Electrónica");
        Producto p2 = new Producto("002", "Camiseta", 20, 25.0, "Ropa");

        // Agregar productos al inventario
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);

        // Mostrar el inventario
        System.out.println("Inventario inicial:");
        inventario.mostrarInventario();

        // Crear manager de ventas
        VentaManager ventaManager = new VentaManager();

        // Registrar algunas ventas
        ventaManager.registrarVenta(inventario, "001", 2); // Vender 2 laptops
        ventaManager.registrarVenta(inventario, "002", 5); // Vender 5 camisetas

        // Mostrar ventas
        System.out.println("\nVentas realizadas:");
        ventaManager.mostrarVentas();

        // Mostrar total de ventas
        System.out.println("\nTotal de ventas: $" + ventaManager.calcularTotalVentas());

        // Mostrar inventario actualizado
        System.out.println("\nInventario actualizado:");
        inventario.mostrarInventario();
    }
}
