package modelo;

public class Producto {
	private String id;
	private String nombre;
	private int cantidad;
	private double precio;
	private String categoria;

	public Producto(String id, String nombre, int cantidad, double precio, String categoria) {
		this.id = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
		this.categoria = categoria;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void mostrarInfo() {
		System.out.println("ID: " + id);
		System.out.println("Nombre: " + nombre);
		System.out.println("Cantidad: " + cantidad);
		System.out.println("Precio: $" + precio);
		System.out.println("Categoría: " + categoria);
	}
}
