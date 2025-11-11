
package com.mycompany.techstore;

public class PagoCombinado implements MetodoPago{
    
    private MetodoPago metodo1;
    private MetodoPago metodo2;

    public PagoCombinado(MetodoPago metodo1, MetodoPago metodo2) {
        this.metodo1 = metodo1;
        this.metodo2 = metodo2;
    }

    @Override
    public double procesarPago(double totalCompra, double totalDinero) {

        double parte1 = totalCompra / 2;
        double parte2 = totalCompra / 2;

        System.out.println("Primera parte del pago con " + metodo1.getClass().getSimpleName());
        double pago1 = metodo1.procesarPago(parte1, totalDinero);

        System.out.println("\nSegunda parte del pago con " + metodo2.getClass().getSimpleName());
        double pago2 = metodo2.procesarPago(parte2, totalDinero);

        double totalPagado = pago1 + pago2;

        if (totalPagado >= totalCompra) {
            System.out.println("\nPago exitoso. Total: $" + totalPagado);
        } else {
            System.out.println("\nPago inválido. Faltan: $" + (totalCompra - totalPagado));
        }

        return totalPagado;
    }

    
}
