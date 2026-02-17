package com.example;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {
        if (saldo < 0) {
            saldo = 0;
        }
        this.titular = titular;
        this.saldo = saldo;

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
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
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }


}
