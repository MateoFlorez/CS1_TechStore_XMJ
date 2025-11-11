
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
        /*try {
            // Ingresar producto
            System.out.println("Ingrese el codigo del producto: ");
            int codigoProducto = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el nombre del producto: ");
            String nombreProducto = sc.nextLine();
            System.out.println("Ingrese el precio del producto: ");
            double precioProducto = sc.nextDouble();
            sc.nextLine();
            System.out.println("Ingrese el stock del producto: ");
            int stockProducto = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el descuento del producto: ");
            int descuentoProducto = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese la ubicacion del producto: ");
            String ubicacionProducto = sc.nextLine();

            ProductoFisico prodNuevo = new ProductoFisico(nombreProducto,precioProducto,stockProducto,codigoProducto,descuentoProducto,ubicacionProducto);

            listaProductos.put(codigoProducto, prodNuevo);
        } catch (Exception e) {
            System.out.println("Error agregando producto " + e.getMessage());
        }*/
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
        /*try {
            // Agregar servicio
            /*System.out.println("Ingrese el nombre del servicio: ");
            String nombreServicio = sc.nextLine();
            System.out.println("Ingrese el precio del servicio: ");
            double precioServicio = sc.nextDouble();
            sc.nextLine();
            System.out.println("Ingrese la duracion del servicio: ");
            int duracionServicio = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese la descripcion del servicio: ");
            String descripcionServicio = sc.nextLine();

            ServicioDigital servicioNuevo = new ServicioDigital(nombreServicio, precioServicio, duracionServicio, descripcionServicio);

            listaServicios.put(nombreServicio, servicioNuevo);
        } catch (Exception e) {
            System.out.println("Error agregando el servicio " + e.getMessage());
        }*/
        
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
