
package com.mycompany.techstore;

public class ReportesBasicos {

    private ProductoFisico[] productos;
    private Venta[] ventas;

    public ReportesBasicos(ProductoFisico[] productos, Venta[] ventas) {
        this.productos = productos;
        this.ventas = ventas;
    }

    public void ventasDelDia(String fecha) {
        System.out.println("\nVentas del día " + fecha + ":");
        for (Venta v : ventas) {
            System.out.println("Cajero: " + v.getCajero() + "\nTotal: " + v.getTotal());
        }
    }

    public void productosMasVendidos() {
        System.out.println("\nProductos más vendidos:");
        for (ProductoFisico p : productos) {
            int vendidos = Math.max(0, 10 - p.stock); 
            System.out.println("Name: " + p.getNombre() + "\nVendidos: " + vendidos);
        }
    }

    public void stockBajo(int limite) {
        System.out.println("\nProductos con stock menor a " + limite + ":");
        for (ProductoFisico p : productos) {
            if (p.stock < limite) {
                System.out.println("Name: " + p.getNombre() + "\nStock: " + p.stock);
            }
        }
}
}
