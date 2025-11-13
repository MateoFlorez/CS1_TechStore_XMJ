
package com.mycompany.techstore;

import java.util.HashMap;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class SistemaProducto {
    // private Scanner sc = new Scanner(System.in);
    private HashMap<Integer, ProductoFisico> listaProductos = new HashMap<>();
    private HashMap<String, ServicioDigital> listaServicios = new HashMap<>();
    
    // PRODUCTOS FISICOS
    public void agregarProducto(int codigoProducto, String nombreProducto, double precioProducto, int stockProducto, int descuentoProducto, String ubicacionProducto) throws Exception {
        
        if (listaProductos.containsKey(codigoProducto)){
            //JOptionPane.showMessageDialog(null, "Ya existe un producto registrado con este codigo: " + codigoProducto);
            throw new Exception("Ya existe un producto con este código: " + codigoProducto);
        } else {
            ProductoFisico prodNuevo = new ProductoFisico(nombreProducto, precioProducto, stockProducto, codigoProducto, descuentoProducto, ubicacionProducto);
            
            listaProductos.put(codigoProducto, prodNuevo);
        }
    }
    
    public void listarProductos(){
        System.out.println("----- LISTA PRODUCTOS -----");
        for (Integer i : listaProductos.keySet()){
            System.out.println("Codigo: " + i + "\n" + listaProductos.get(i));
            System.out.println("---------------------------");
        }
    }
    
    // SERVICIOS DIGITALES
    public void agregarServicio(String nombreServicio, double precioServicio, int duracionServicio, String descripcionServicio) throws Exception {
        
        if (listaServicios.containsKey(nombreServicio)){
            throw new Exception("Ya existe ese servicio: " + nombreServicio);
        } else {
            ServicioDigital servicioNuevo = new ServicioDigital(nombreServicio, precioServicio, duracionServicio, descripcionServicio);
            
            listaServicios.put(nombreServicio, servicioNuevo);
        }
    }
    
    public void listarServicios(){
        System.out.println("----- LISTA SERVICIOS -----");
        for (String i : listaServicios.keySet()){
            System.out.println("Nombre: " + i + "\n" + listaServicios.get(i));
            System.out.println("---------------------------");
        }
    }

    public HashMap<Integer, ProductoFisico> getListaProductos() {
        return listaProductos;
    }

    public HashMap<String, ServicioDigital> getListaServicios() {
        return listaServicios;
    }
    
    
}
