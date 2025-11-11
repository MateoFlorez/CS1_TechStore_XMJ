package com.mycompany.techstore;

public class ServicioDigital extends Productos {

    protected int duracion;
    protected String descripcion;

    public ServicioDigital(String nombre, double precio, int duracion, String descripcion) {
        super(nombre, precio);
        this.duracion = duracion;
        this.descripcion = descripcion;
    }

    @Override
    public double calcularPrecio() {
        double precioFinal = 0;
        if (this.precio > 0 && this.precio < 10000) {
            precioFinal = this.precio;
        } else {
            System.out.println("El precio debe ser mayor a 0 y menor a 10000.");
        }
        return precioFinal;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Duracion: " + this.duracion + " minutos");
        System.out.println("Descripcion: " + this.descripcion);
    }
    
    @Override
    public String toString(){
        return "Nombre del servicio: " + this.nombre + 
                "\nPrecio del servicio: " + this.precio + 
                "\nDuracion del servicio: " + this.duracion + " minutos." +
                "\nDescripcion: " + this.descripcion;
    }
}
