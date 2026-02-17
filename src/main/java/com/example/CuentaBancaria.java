package com.example;

public class CuentaBancaria {
    private String titualar;
    private double saldo;

    public CuentaBancaria(String titualar, double saldo) {
        if (saldo < 0) {
            saldo = 0;
        }
        this.titualar = titualar;
        this.saldo = saldo;

    }

    public String getTitualar() {
        return titualar;
    }

    public void setTitualar(String titualar) {
        this.titualar = titualar;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
        }
        else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }
    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (cantidad <= saldo) {
                this.saldo -= cantidad;
            } else {
                System.out.println("Fondos insuficientes para retirar.");
            }
        } else {
            System.out.println("La cantidad a retirar debe ser un numero positivo.");
        }
    }

    public String mostrarDetalles() {
        return "CuentaBancaria{" +
                "titualar='" + titualar + '\'' +
                ", saldo=" + saldo +
                '}';
    }


}
