package com.mycompany.techstore;

public class Supervisor extends Empleado {

    public Supervisor(String name, String position, String rol, String user, String password) {
        super(name, position, rol, user, password);
    }

    @Override
    public String trabajo(String name, String position, String rol) {
        System.out.println("Nombre: " + name);
        System.out.println("Cargo: " + position);
        System.out.println("Funcion: " + rol);

        return "El empleado " + name
                + ", con el cargo de " + position
                + ", " + rol;
    }

    public void autorizarDescuento(double porcentaje) {

        System.out.println("Special authorized discount of " + porcentaje);

    }

    public void aprobarVentaMayor(double monto) {

        System.out.println("The supervisor approved the larger sale for $" + monto);

    }

}
