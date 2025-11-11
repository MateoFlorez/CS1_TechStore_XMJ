
package com.mycompany.techstore;

import java.util.List;
import java.util.ArrayList;


public class Cliente{
    private String id;
    private String nombre;
    private int cedula;
    private String telefono;
    private String direccion;
    private List<Compra> historialDeCompra;
    private int ptsFidelidad;
   
    
    public Cliente(String id, String nombre, int cedula, String telefono, String direccion){
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.historialDeCompra = new ArrayList<>();
        this.ptsFidelidad = 0;
    }
    
    @Override
    public String toString(){
        return "ID: " + this.id + 
                "\nNombre: " + this.nombre + 
                "\nCedula: " + this.cedula + 
                "\nTelefono: " + this.telefono +
                "\nDireccion: " + this.direccion +
                "\nPuntos de fidelidad: " + this.ptsFidelidad +
                "\nCompras realizadas: " + this.historialDeCompra.size();
    }
    
    public void registrarCompra(double monto){
        historialDeCompra.add(new Compra(monto));
        int pts = (int)(monto/10);
        ptsFidelidad = ptsFidelidad + pts;
        System.out.println("Nombre: " + this.nombre + 
                "\nPuntos por la compra: " + pts +
                "\nTotal puntos: " + this.ptsFidelidad);
    }
    
    public double calcularDescuentoAdicional(){
        
        if(historialDeCompra.size() < 3){
            return 0;
        } else if (historialDeCompra.size() < 6){
            return 0.05;
        } else {
            return 0.10;
        }
        
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public List<Compra> getHistorialDeCompra() {
        return historialDeCompra;
    }

    public int getPtsFidelidad() {
        return ptsFidelidad;
    }
    
    


}
