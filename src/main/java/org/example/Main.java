package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creación del primer objeto empleado con datos "quemados"
        Empleado empleado1 = new Empleado("Carlos", 30, 2500.50);

        // Imprimir los datos del primer empleado
        System.out.println("Empleado 1 (Valores predefinidos):");
        System.out.println("Nombre: " + empleado1.getNombre());
        System.out.println("Edad: " + empleado1.getEdad());
        System.out.println("Salario: " + empleado1.getSalario());
        System.out.println();

        // Crear un objeto Scanner para pedir datos al usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario para el segundo empleado
        System.out.print("Ingresa el nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa la edad del empleado: ");
        int edad = scanner.nextInt();

        System.out.print("Ingresa el salario del empleado: ");
        double salario = scanner.nextDouble();

        // Creación del segundo objeto empleado con datos ingresados por el usuario
        Empleado empleado2 = new Empleado(nombre, edad, salario);

        // Imprimir los datos del segundo empleado
        System.out.println();
        System.out.println("Empleado 2 (Valores ingresados por el usuario):");
        System.out.println("Nombre: " + empleado2.getNombre());
        System.out.println("Edad: " + empleado2.getEdad());
        System.out.println("Salario: " + empleado2.getSalario());
    }
}
