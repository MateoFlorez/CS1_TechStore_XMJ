
package com.mycompany.techstore;

import java.util.HashMap;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class SistemaCliente {
    // private Scanner sc = new Scanner(System.in);
    private HashMap<Integer,Cliente> listaClientes = new HashMap<>();
    
    int contador = 1;
    
    public void agregarCliente(String nombreUsuario, int cedulaUsuario, String telefonoUsuario, String direccionUsuario) throws Exception {
        
        /*System.out.println("Digite la cedula: ");
        int cedula = sc.nextInt();
        sc.nextLine();
        
        if (listaClientes.containsKey(cedula)){
            System.out.println("Ya existe usuario registrado con esa cedula.");
        } else {
            System.out.println("Ingrese el nombre del cliente: ");
            String nombreUsuario = sc.nextLine();
            System.out.println("Ingrese la cedula del cliente: ");
            int cedulaUsuario = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el telefono del cliente: ");
            String telefonoUsuario = sc.nextLine();
            System.out.println("Ingrese el direccion del cliente: ");
            String direccionUsuario = sc.nextLine();
            
            String id = String.format("CLI-%03d", contador++);
            Cliente clienteNuevo = new Cliente(id,nombreUsuario,cedulaUsuario,telefonoUsuario,direccionUsuario);
            
            listaClientes.put(cedulaUsuario,clienteNuevo);
        }*/
        if (listaClientes.containsKey(cedulaUsuario)) {

            throw new Exception("Ya existe un registro con la cedula: " + cedulaUsuario);
            
        } else {
            String id = String.format("CLI-%03d", contador++);
            Cliente clienteNuevo = new Cliente(id,nombreUsuario,cedulaUsuario,telefonoUsuario,direccionUsuario);
            
            listaClientes.put(cedulaUsuario,clienteNuevo);
        }
        
    }
    
    /*public void registrarCompra(int cedula, double totalCompra){
        /*System.out.println("Cedula cliente: ");
        int cedula = sc.nextInt();
        sc.nextLine();
        
        Cliente cliente = listaClientes.get(cedula);
        
        if (cliente == null){
            System.out.println("El cliente no existe");
        }
        
        /*System.out.println("Ingrese total de compra: ");
        double totalCompra = sc.nextDouble();
        
        cliente.registrarCompra(totalCompra);
        
    }*/
    
    public void listarClientes(){
        System.out.println("----- LISTA CLIENTES -----");
        for (Cliente c : listaClientes.values()) {
            System.out.println(c);
        }
    }
    /*public String listarClientesNuevo() {
        StringBuilder sb = new StringBuilder();
        sb.append("----- LISTA CLIENTES -----\n");
        for (Cliente c : listaClientes.values()) {
            sb.append(c.toString()).append("\n");
        }
        return sb.toString();
    }*/
    
    

    public HashMap<Integer, Cliente> getListaClientes() {
        return listaClientes;
    }
    
    
    
    
}
