package com.mycompany.techstore;

import java.util.Scanner;

public class PagoEfectivo implements MetodoPago {
    
    public void ejecutarPago() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el total de la compra: ");
        double totalCompra = sc.nextDouble();

        System.out.print("Ingrese el dinero: ");
        double totalDinero = sc.nextDouble();

        procesarPago(totalCompra, totalDinero);
    }

    @Override
    public double procesarPago(double totalCompra, double totalDinero) {
        
        if (totalCompra < 1000) {
            System.out.println("No se aceptan pagos menores a 1000.");
            return 0;
            
        } else if (totalDinero >= totalCompra) {
            double devuelta = totalDinero - totalCompra;
            System.out.println("Pago exitoso.");
            System.out.println("Su devuelta es de: " + devuelta);
            return devuelta;
            
        } else {
            System.out.println("No se puede realizar el pago, le faltan: " + (totalCompra - totalDinero));
            return 0;
        }
    }
}
