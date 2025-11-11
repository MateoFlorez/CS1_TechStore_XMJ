package com.mycompany.techstore;

import java.time.LocalDate;

public class ProductoFisico extends Productos {
    protected int stock;
    protected int codigoBarra;
    protected int descuento;
    protected String ubicacionTienda;
    protected LocalDate fechaIngreso;
    
    public ProductoFisico(String nombre, double precio, int stock, int codigoBarra, int descuento, String ubicacionTienda){
        super(nombre,precio);
        this.stock = stock;
        this.codigoBarra = codigoBarra;
        this.descuento = descuento;
        this.ubicacionTienda = ubicacionTienda;
        this.fechaIngreso = LocalDate.now();
    }
    
    @Override
    public double calcularPrecio() {
        double precioFinal = 0;
        double precioDescuento = 0;
        if(this.precio > 0 && this.descuento != 0 && this.precio < 10000){
            precioDescuento = (this.precio * this.descuento) / 100;
            precioFinal = this.precio - precioDescuento;
        } else if (this.precio > 0 && this.descuento == 0 && this.precio < 10000){
            precioFinal = this.precio;
        } else {
            System.out.println("El precio debe ser mayor a 0 y menor a 10000.");
        }
        return precioFinal;
    }
    
    // Override del concrete method dejando la impresion de la clase padre
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Stock: " + this.stock);
        System.out.println("Codigo de Barras: " + this.codigoBarra);
        System.out.println("Descuento: " + this.descuento + "%");
        System.out.println("Ubicacion: " + this.ubicacionTienda);
        System.out.println("Fecha de Ingreso: " + this.fechaIngreso);
    }
    
    @Override
    public String toString(){
        return "Codigo de barras: " + this.codigoBarra +
                "\nProducto: " + this.nombre + 
                "\nStock: " + this.stock + " unidades" +
                "\nDescuento: " + this.descuento + "%" +
                "\nUbicacion: " + this.ubicacionTienda + 
                "\nPrecio: " + this.precio +
                "\nFecha de ingreso: " + this.fechaIngreso;
    }
}
