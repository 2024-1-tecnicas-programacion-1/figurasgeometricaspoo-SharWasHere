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

        System.out.println("Ingrese el tipo de figura");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el radio del criculo");
                double radioUsuario = scanner.nextDouble();

                Circulo circuloUs = new Circulo(nombre, color, radioUsuario);
                System.out.println(circuloUs.obtenerArea());
                System.out.println(circuloUs.obtenerPerimetro());

                break;

            case 2:
                System.out.println("Ingrese el lado 1 y el lado 2 del rectangulo");
                double ladoUs1 = scanner.nextDouble();
                double ladoUs2 = scanner.nextDouble();

                Rectangulo rectUs = new Rectangulo(nombre, color, ladoUs1, ladoUs2 );
                System.out.println(rectUs.obtenerArea());
                System.out.println(rectUs.obtenerPerimetro());

                break;
            case 3:
                System.out.println("escriba el libro, o el , o el  autor, o el genero a buscar");
                String palabraBuscada = scanner.nextLine();

                Biblioteca busLibro = new Biblioteca();
                busLibro.buscarLibro(palabraBuscada);

                break;
            case 4:
                System.out.println("Escriba el libro para marcarlo como leído");
                Libro libroLeido = new Libro();
                libroLeido.marcarLeido();

                break;
            case 5:
                System.out.println("Libros no leídos");

                Biblioteca libNoLeidos = new Biblioteca();
                libNoLeidos.mostrarLibrosNoLeidos();

                System.exit(0);

            default;
                System.out.println("Escriba el libro para marcarlo como leído");
        }
    }

}
}
