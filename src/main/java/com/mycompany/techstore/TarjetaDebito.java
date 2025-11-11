package com.mycompany.techstore;

import java.util.Scanner;

public class TarjetaDebito implements MetodoPago {

    public void ejecutarPago() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de su tarjeta, debe de tener 16 dígitos: ");
        String numTarjeta = sc.nextLine();

        TarjetaDebito tarjDeb = new TarjetaDebito(numTarjeta, 1);
        if (!tarjDeb.validarNumeroTarjeta(numTarjeta)) {
            System.out.println("Número de tarjeta inválido. Debe de tener 16 dígitos.");
            return;
        }

        System.out.print("Ingrese el número de cuotas: ");
        int cuotas = sc.nextInt();

        System.out.print("Ingrese el total de su compra: ");
        double totalCompra = sc.nextDouble();

        System.out.print("Ingrese el total de dinero disponible: ");
        double totalDinero = sc.nextDouble();

        TarjetaDebito debito = new TarjetaDebito(numTarjeta, cuotas);
        debito.procesarPago(totalCompra, totalDinero);
    }

    private String numTarjeta;
    private int cuotas;

    public TarjetaDebito(String numTarjeta, int cuotas) {
        this.numTarjeta = numTarjeta;
        this.cuotas = cuotas;
    }

    public boolean validarNumeroTarjeta(String numTarjeta) {
        return numTarjeta.matches("\\d{16}");
    }

    @Override
    public double procesarPago(double totalCompra, double totalDinero) {

        if (totalCompra < 1000) {
            System.out.println("No se aceptan pagos menores a 1000.");
            return 0;
        }

        if (cuotas != 1) {
            System.out.println("Tiene que ser con pago único.");
            return 0;
        }

        if (totalDinero >= totalCompra) {
            System.out.println("Pago exitoso.");
            return totalCompra;

        } else {
            System.out.println("No se puede realizar el pago.");
            return 0;
        }
    }

}
