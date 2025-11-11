package com.mycompany.techstore;

import java.time.LocalDate;

public class Venta {

    private String cajero;
    private double total;
    private LocalDate fecha;

    public Venta(String cajero, double total, LocalDate fecha) {
        this.cajero = cajero;
        this.total = total;
        this.fecha = fecha;
    }

    public String getCajero() {
        return cajero;
    }

    public double getTotal() {
        return total;
    }

    public LocalDate getFecha() {
        return fecha;
    }
}
