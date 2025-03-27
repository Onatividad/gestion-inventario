package modelo;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    // Agregar un producto al inventario
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Eliminar un producto del inventario
    public void eliminarProducto(String id) {
        Producto productoAEliminar = null;
        for (Producto producto : productos) {
            if (producto.getId().equals(id)) {
                productoAEliminar = producto;
                break;
            }
        }
        if (productoAEliminar != null) {
            productos.remove(productoAEliminar);
            System.out.println("Producto eliminado.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    // Mostrar todos los productos en el inventario
    public void mostrarInventario() {
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            for (Producto producto : productos) {
                producto.mostrarInfo();
                System.out.println("----------------------");
            }
        }
    }

    // Buscar un producto por ID
    public Producto buscarProducto(String id) {
        for (Producto producto : productos) {
            if (producto.getId().equals(id)) {
                return producto;
            }
        }
        return null;
    }
}
