package com.mycompany.techstore;

import java.io.*;
import java.util.HashMap;

public class SistemaCliente {

    private HashMap<Integer, Cliente> listaClientes = new HashMap<>();

    int contador = 1;

    public void agregarCliente(String nombreUsuario, int cedulaUsuario, String telefonoUsuario, String direccionUsuario) throws Exception {

        if (listaClientes.containsKey(cedulaUsuario)) {

            throw new Exception("Ya existe un registro con la cedula: " + cedulaUsuario);

        } else {
            String id = String.format("CLI-%03d", contador++);
            Cliente clienteNuevo = new Cliente(id, nombreUsuario, cedulaUsuario, telefonoUsuario, direccionUsuario);

            listaClientes.put(cedulaUsuario, clienteNuevo);
        }

    }

    public void cargarClientesDesdeCSV() {
        try (InputStream is = getClass().getResourceAsStream("/clientes.csv")) {

            if (is == null) {
                System.out.println("No se encontró el archivo CSV en resources.");
                return;
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                String nombre = datos[0];
                int cedula = Integer.parseInt(datos[1]);
                String telefono = datos[2];
                String direccion = datos[3];

                agregarCliente(nombre, cedula, telefono, direccion);
            }

            System.out.println("Clientes cargados correctamente desde CSV.");

        } catch (Exception e) {
            System.out.println("Error leyendo archivo CSV: " + e.getMessage());
        }
    }

    public void listarClientes() {
        System.out.println("----- LISTA CLIENTES -----");
        for (Cliente c : listaClientes.values()) {
            System.out.println(c);
        }
    }

    public HashMap<Integer, Cliente> getListaClientes() {
        return listaClientes;
    }

}
