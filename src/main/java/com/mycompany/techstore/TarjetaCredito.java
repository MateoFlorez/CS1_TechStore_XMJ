package com.mycompany.techstore;

import java.util.Scanner;

public class TarjetaCredito implements MetodoPago {

    public void ejecutarPago() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero de su tarjeta, debe de tener 16 digitos: ");
        String numTarjeta = sc.nextLine();

        TarjetaCredito tarjCre = new TarjetaCredito(numTarjeta, 1);
        if (!tarjCre.validarNumeroTarjeta(numTarjeta)) {
            System.out.println("Este numero de tarjeta no es valido, no tiene 16 digitos.");
            return;
        }

        System.out.print("Ingrese el numero de cuotas: ");
        int cuotas = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingrese el total de su compra: ");
        double totalCompra = sc.nextDouble();
        sc.nextLine();

        System.out.print("Ingrese el total de dinero disponible: ");
        double totalDinero = sc.nextDouble();

        TarjetaCredito tarjeta = new TarjetaCredito(numTarjeta, cuotas);
        tarjeta.procesarPago(totalCompra, 0);
    }

    private String numTarjeta;
    private int cuotas;

    public TarjetaCredito(String numTarjeta, int cuotas) {
        this.numTarjeta = numTarjeta;
        this.cuotas = cuotas;
    }

    public boolean validarNumeroTarjeta(String numTarjeta) {
        return numTarjeta.matches("\\d{16}");
    }

    @Override
    public double procesarPago(double totalCompra, double totalDinero) {
        // double dineroCuotas = totalCompra / cuotas; /

        if (totalCompra < 1000) {
            System.out.println("No se aceptan pagos menores a 1000.");
            return 0;
        }

        double recargo = totalCompra + (totalCompra * 0.05 * cuotas);
        double dineroCuotas = recargo / cuotas;

        /*if (totalDinero >= totalCompra) {
            System.out.println("Pago realizado con éxito.");
            return totalCompra;
        }*/
        System.out.println("Su numero de cuotas es: " + cuotas);
        System.out.println("Sus cuotas con el recargo del 5% son de: " + recargo);
        System.out.println("Dinero a pagar: " + dineroCuotas);
        System.out.println("Pago exitoso.");

        return recargo;
    }
}
