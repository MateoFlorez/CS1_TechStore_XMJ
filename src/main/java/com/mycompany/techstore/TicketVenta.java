/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.techstore;

import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class TicketVenta {

    private Cliente cliente;
    private ArrayList<Carrito> carrito;
    private double iva = 0.16;
    private int puntosCanjeados;

    public TicketVenta(Cliente cliente) {
        this.cliente = cliente;
        this.carrito = new ArrayList<>();
        this.puntosCanjeados = 0;
    }

    public void agregarProducto(Productos producto, int cantidad) {
        Carrito item = new Carrito(producto, cantidad);
        carrito.add(item);
    }

    public void canjearPuntos(int puntos) {
        if (puntos <= cliente.getPtsFidelidad()) {
            this.puntosCanjeados = puntos;
        } else {
            System.out.println("No tienes puntos suficientes.");
        }
    }

    public double calcularSubtotal() {
        double subtotal = 0;
        for (Carrito item : carrito) {
            subtotal += item.getSubtotal();
        }
        return subtotal;
    }

    public double calcularDescuentoFidelidad() {
        return calcularSubtotal() * cliente.calcularDescuentoAdicional();
    }

    public double calcularDescuentoPuntos() {
        return puntosCanjeados * 0.5;
    }

    public double calcularTotal() {
        double subtotal = calcularSubtotal();
        double descuentos = calcularDescuentoFidelidad() + calcularDescuentoPuntos();
        double fn = subtotal - descuentos;
        double total = fn + (fn * iva);
        return total;
    }

    // Imprime el ticket de forma clara
    public void imprimirTicket() {
        System.out.println("\n----- TICKET DE VENTA -----");
        System.out.println("Cliente: " + cliente.getNombre());

        for (Carrito item : carrito) {
            item.mostrarItem();
        }
        System.out.println("---------------------------");
        System.out.println("Subtotal: " + calcularSubtotal());
        System.out.println("Descuento de fidelidad: " + calcularDescuentoFidelidad());
        System.out.println("Descuento de puntos: " + calcularDescuentoPuntos());
        System.out.println("IVA: " + (calcularSubtotal() - calcularDescuentoFidelidad() - calcularDescuentoPuntos()) * iva);
        System.out.println("Total: $" + calcularTotal());
        System.out.println("---------------------------");

    }

    public void confirmarCompra() {
        double total = calcularTotal();
        cliente.registrarCompra(total);
        System.out.println("Compra con exito.");
    }
}
