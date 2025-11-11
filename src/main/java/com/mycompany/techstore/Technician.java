package com.mycompany.techstore;

public class Technician extends Empleado {

    public Technician(String name, String position, String rol, String user, String password) {
        super(name, position, rol, user, password);
    }

    @Override
    public String trabajo(String nombre, String cargo, String funcion) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cargo: " + cargo);
        System.out.println("Funcion: " + funcion);

        return "The employee " + nombre
                + ", with the position of " + cargo
                + ", " + funcion;

    }

    public void realizarServicioDigital() {
        System.out.println("The technical " + this.name + " is providing a digital service.");
    }

    public void instalarProducto() {
        System.out.println("The technical " + this.name + " is installing a product.");
    }

}
