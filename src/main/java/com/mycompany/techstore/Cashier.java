package com.mycompany.techstore;

public class Cashier extends Empleado {
    
    public Cashier(String name, String position, String rol, String user, String password){
        super(name, position, rol, user, password);
    }
    
    @Override
    public String trabajo(String nombre, String cargo, String funcion) {
        System.out.println("Name: " + nombre);
        System.out.println("Post: " + cargo);
        System.out.println("Role: " + funcion);
        
        return "The employee " + nombre
                + ", with the position of " + cargo
                + ", " + funcion;
    }
}
