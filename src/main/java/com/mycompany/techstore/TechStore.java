package com.mycompany.techstore;

import interfacesGraficas.FrameLogin;
import interfacesGraficas.MainFrame;

public class TechStore {

    public static void main(String[] args) {
        
        EmployeeSystem system = new EmployeeSystem();

        /*TarjetaCredito tarjeta = new TarjetaCredito("", 0);
        tarjeta.ejecutarPago();*/
        
        /*PagoEfectivo pagoEfec = new PagoEfectivo();
        pagoEfec.ejecutarPago();*/
        
        /*Cajero cajero1 = new Cajero();

        String datos = cajero1.trabajo("Juan", "Cajero", "Procesa ventas y emite facturas");

        System.out.println(datos);
        
        
        Tecnico tecnico1 = new Tecnico();
        
        String data = tecnico1.trabajo("Samuel", "Tecnico", "Realiza servicios digitales e instalaciones");
        
        System.out.println(data);
        
        Supervisor supervisor1 = new Supervisor();
        
        String dato = supervisor1.trabajo("Mateo", "Supervisor", "Autoriza descuentos especiales y ventas mayores");
        
        System.out.println(dato);*/
        
        system.addEmployee(new Supervisor("Ximena", "Supervisor", "Sales manager", "super", "1234"));
        system.addEmployee(new Technician("Mateo", "Technician", "Attend services", "tech", "1234"));
        system.addEmployee(new Cashier("Juan", "Cashier", "Attend cashier", "cashier", "1234"));
        
        FrameLogin frLogin = new FrameLogin(system);
        frLogin.setVisible(true);
        frLogin.setLocationRelativeTo(null);
        
        /*MainFrame mframe = new MainFrame();
        
        mframe.setVisible(true);
        
        mframe.setLocationRelativeTo(null);
        SistemaCliente sistema = new SistemaCliente();
        SistemaProducto sisProd = new SistemaProducto();*/
        
        // productos fisicos
        /*sisProd.agregarProducto();
        sisProd.agregarProducto();
        sisProd.listarProductos();
        
        // servicios digitales
        sisProd.agregarServicio();
        sisProd.agregarServicio();
        sisProd.listarServicios();
        
        // clientes
        sistema.agregarCliente();
        sistema.registrarCompra();
        sistema.registrarCompra();
        sistema.listarClientes();*/
    }
}
