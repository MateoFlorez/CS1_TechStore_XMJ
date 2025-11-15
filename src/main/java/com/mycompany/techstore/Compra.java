package com.mycompany.techstore;

import java.text.DecimalFormat;
import java.time.LocalDateTime;

public class Compra {
    private double totalCompra;
    private LocalDateTime fechaCompra;
    
    public Compra(double totalCompra){
        this.totalCompra = totalCompra;
        this.fechaCompra = LocalDateTime.now();
    }

    public double getTotalCompra() {
        return totalCompra;
    }

    public LocalDateTime getFechaCompra() {
        return fechaCompra;
    }
    
    @Override
    public String toString(){
        return "Total: " + this.totalCompra + "\n" + "Fecha: " + this.fechaCompra;
    }
}
