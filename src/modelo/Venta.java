package modelo;

public class Venta {
    private Producto producto;
    private int cantidadVendida;
    private double totalVenta;

    public Venta(Producto producto, int cantidadVendida) {
        this.producto = producto;
        this.cantidadVendida = cantidadVendida;
        this.totalVenta = producto.getPrecio() * cantidadVendida;
    }

    // Métodos getter
    public Producto getProducto() {
        return producto;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    // Mostrar detalles de la venta
    public void mostrarVenta() {
        System.out.println("Producto vendido: " + producto.getNombre());
        System.out.println("Cantidad: " + cantidadVendida);
        System.out.println("Total de la venta: $" + totalVenta);
    }
}
