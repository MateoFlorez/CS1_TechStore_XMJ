
package com.mycompany.techstore;

public class Cajero implements EmpleadosCTS {

    @Override
    public String trabajo(String nombre, String cargo, String funcion) {
        System.out.println("Name: " + nombre);
        System.out.println("Post: " + cargo);
        System.out.println("Role: " + funcion);

        return "The employee " + nombre
                + ", with the position of " + cargo
                + ", " + funcion;
    }

    public void procesarVenta() {
        System.out.println(nombreRol() + " is processing a sale.");
    }

    public void emitirFactura() {
        System.out.println(nombreRol() + " has issued an invoice.");
    }

    private String nombreRol() {
        return "Cashier";
    }
}
