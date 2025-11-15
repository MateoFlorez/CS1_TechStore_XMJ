
package com.mycompany.techstore;

public class Carrito {
    private Productos producto;
    private int cantidad;

    public Carrito(Productos producto, int cantidad) {
        
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return producto.calcularPrecio() * cantidad;
    }

    public Productos getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void mostrarItem() {
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total: " + getSubtotal());
    }
}
