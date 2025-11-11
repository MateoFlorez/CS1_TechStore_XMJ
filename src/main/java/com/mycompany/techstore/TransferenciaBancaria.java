package com.mycompany.techstore;

import java.util.Scanner;

public class TransferenciaBancaria implements MetodoPago {

    public void ejecutarPago() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de referencia: ");
        String numRef = sc.nextLine();

        System.out.print("¿Confirma la transferencia?");
        System.out.println("SI: true - NO: false");
        boolean confirmacion = sc.nextBoolean();
        sc.nextLine();

        System.out.print("Ingrese el total de su compra: ");
        double totalCompra = sc.nextDouble();
        sc.nextLine();

        System.out.print("Ingrese el total del dinero disponible: ");
        double totalDinero = sc.nextDouble();

        TransferenciaBancaria transferencia = new TransferenciaBancaria(numRef, confirmacion);

        transferencia.procesarPago(totalCompra, totalDinero);
    }

    private String numRef;
    private boolean confirmacion;

    public TransferenciaBancaria(String numRef, boolean confirmacion) {
        this.numRef = numRef;
        this.confirmacion = confirmacion;
    }

    @Override
    public double procesarPago(double totalCompra, double totalDinero) {

        if (totalCompra < 1000) {
            System.out.println("No se aceptan pagos menores a 1000.");
            return 0;
        }

        if (confirmacion == true) {
            System.out.println("Transferencia Bancaria confirnamda.");
        } else {
            System.out.println("Transferencia Bancaria no confirmada.");
            return 0;
        }

        if (totalDinero >= totalCompra) {
            System.out.println("Su número de referencia es: " + numRef);
            System.out.println("Pago exitoso.");
            return totalCompra;
        } else {
            System.out.println("No se puede realizar el pago");
            return 0;
        }
    }
}
