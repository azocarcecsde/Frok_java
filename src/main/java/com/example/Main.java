package com.example;

public class Main {
    public static void main(String[] args) {
    

    Libro Libro1 = new Libro();
        Libro Libro2 = new Libro("caballero de la armadura oxidada", "Fredo");
        Libro Libro3 = new Libro("clean code", "juan juan", 417);

        System.out.println(Libro1.mostrarDetalles());
        System.out.println(Libro2.mostrarDetalles());
        System.out.println(Libro3.mostrarDetalles());
        
    CuentaBancaria cuenta1 = new CuentaBancaria("juan juan", 500);
    cuenta1.depositar(200);
       System.out.println(cuenta1.getSaldo());
       cuenta1.retirar(1000);
         System.out.println(cuenta1.mostrarDetalles());

    Estudiante estudiante1 = new Estudiante("juan juan", 20, 3.5);
    System.out.println(estudiante1.mostrarDetalles());
    System.out.println(estudiante1.haAprobado());
    }
}


