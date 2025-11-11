package com.mycompany.techstore;

public abstract class Productos {

    protected String nombre;
    protected double precio;
    
    public Productos(String nombre, double precio) {
        if (nombre == null) {
            System.out.println("El nombre no puede estar vacio");
        } else {
            this.nombre = nombre;
        }
        this.precio = precio;
    }
    
    // Abstract methods
    public abstract double calcularPrecio();

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void showInfo() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: " + this.calcularPrecio());
    }
}
