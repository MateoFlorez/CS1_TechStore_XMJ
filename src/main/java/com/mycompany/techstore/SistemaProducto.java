package com.mycompany.techstore;

import java.io.*;
import java.util.HashMap;

public class SistemaProducto {

    private HashMap<Integer, ProductoFisico> listaProductos = new HashMap<>();
    private HashMap<String, ServicioDigital> listaServicios = new HashMap<>();

    // PRODUCTOS FISICOS
    public void agregarProducto(int codigoProducto, String nombreProducto, double precioProducto, int stockProducto, int descuentoProducto, String ubicacionProducto) throws Exception {

        if (listaProductos.containsKey(codigoProducto)) {
            throw new Exception("Ya existe un producto con este código: " + codigoProducto);
        } else {
            ProductoFisico prodNuevo = new ProductoFisico(nombreProducto, precioProducto, stockProducto, codigoProducto, descuentoProducto, ubicacionProducto);

            listaProductos.put(codigoProducto, prodNuevo);
        }
    }

    public void listarProductos() {
        System.out.println("----- LISTA PRODUCTOS -----");
        for (Integer i : listaProductos.keySet()) {
            System.out.println("Codigo: " + i + "\n" + listaProductos.get(i));
            System.out.println("---------------------------");
        }
    }

    public void cargarProductosDesdeCSV() {
        String ruta = "productos.csv";

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(getClass().getClassLoader().getResourceAsStream(ruta)))) {

            if (br == null) {
                throw new FileNotFoundException("No se encontró el archivo: " + ruta);
            }

            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                if (datos.length != 6) {
                    System.out.println("Línea inválida: " + linea);
                    continue;
                }

                int codigoProducto = Integer.parseInt(datos[0].trim());
                String nombreProducto = datos[1].trim();
                double precioProducto = Double.parseDouble(datos[2].trim());
                int stockProducto = Integer.parseInt(datos[3].trim());
                int descuentoProducto = Integer.parseInt(datos[4].trim());
                String ubicacionProducto = datos[5].trim();

                try {
                    agregarProducto(codigoProducto, nombreProducto, precioProducto,
                            stockProducto, descuentoProducto, ubicacionProducto);
                } catch (Exception e) {
                    System.out.println("No se pudo agregar producto: " + e.getMessage());
                }
            }

            System.out.println("Productos cargados correctamente desde CSV.");

        } catch (Exception e) {
            System.out.println("Error al leer productos.csv: " + e.getMessage());
        }
    }

    public void cargarProductosDesdeCSV(File archivo) throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {

            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                if (datos.length != 6) {
                    System.out.println("Línea inválida: " + linea);
                    continue;
                }

                int codigoProducto = Integer.parseInt(datos[0].trim());
                String nombreProducto = datos[1].trim();
                double precioProducto = Double.parseDouble(datos[2].trim());
                int stockProducto = Integer.parseInt(datos[3].trim());
                int descuentoProducto = Integer.parseInt(datos[4].trim());
                String ubicacionProducto = datos[5].trim();

                try {
                    agregarProducto(codigoProducto, nombreProducto, precioProducto,
                            stockProducto, descuentoProducto, ubicacionProducto);
                } catch (Exception e) {
                    System.out.println("No se pudo agregar producto: " + e.getMessage());
                }
            }

        } catch (IOException e) {
            throw new Exception("Error leyendo archivo CSV: " + e.getMessage());
        }
    }

    // SERVICIOS DIGITALES
    public void agregarServicio(String nombreServicio, double precioServicio, int duracionServicio, String descripcionServicio) throws Exception {

        if (listaServicios.containsKey(nombreServicio)) {
            throw new Exception("Ya existe ese servicio: " + nombreServicio);
        } else {
            ServicioDigital servicioNuevo = new ServicioDigital(nombreServicio, precioServicio, duracionServicio, descripcionServicio);

            listaServicios.put(nombreServicio, servicioNuevo);
        }
    }

    public void listarServicios() {
        System.out.println("----- LISTA SERVICIOS -----");
        for (String i : listaServicios.keySet()) {
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
