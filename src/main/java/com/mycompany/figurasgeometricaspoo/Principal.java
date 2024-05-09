package com.mycompany.figurasgeometricaspoo;

import java.util.Scanner;

public class Principal {

    /**
     * Complejidad temporal: O(1) Tiempo constante
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la figura");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el color de la figura");
        String color = scanner.nextLine();

        System.out.println("Ingrese el tipo de figura: 1. Circulo. 2. Rectangulo. 3.Triangulo ");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el radio del criculo");
                double radioUsuario = scanner.nextDouble();

                Circulo circuloUs = new Circulo(nombre, color, radioUsuario);
                System.out.println("El àrea es: "+circuloUs.obtenerArea());
                System.out.println("El perìmetro es: "+circuloUs.obtenerPerimetro());

                break;

            case 2:
                System.out.println("Ingrese el lado 1 y el lado 2 del rectangulo");
                double ladoUs1 = scanner.nextDouble();
                double ladoUs2 = scanner.nextDouble();

                Rectangulo rectUs = new Rectangulo(nombre, color, ladoUs1, ladoUs2);
                System.out.println("El àrea es: "+rectUs.obtenerArea());
                System.out.println("El perìmetro es: "+rectUs.obtenerPerimetro());

                break;
            case 3:
                System.out.println("Ingresa la base y altura del trangulo");
                double base = scanner.nextDouble();
                double altura = scanner.nextDouble();

                Triangulo trianguloUsu = new Triangulo(nombre, color, base, altura);
                System.out.println("El àrea es: "+trianguloUsu.obtenerArea());
                System.out.println("El perìmetro es: "+trianguloUsu.obtenerPerimetro());

                break;

            default:
                System.out.println("Opciòn no vàlida");
        }
    }

}
