package com.mycompany.figurasgeometricaspoo;

public class Rectangulo extends FiguraGeometrica {
     private double lado1;
     private double lado2;
    /**
     * Constructor de la clase circulo.
     *
     * @param nombre
     * @param color
     * @param radio
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    
    public Rectangulo(String nombre, String color, double lado1, double lado2) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    /**
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double getLado1() {
        return this.lado1;
    }
    
    /**
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double getLado2() {
        return this.lado2;
    }
    

    /**
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void setLado1(double radio) {
        this.lado1 = lado1;
    }
    

    /**
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void setLado2(double radio) {
        this.lado2 = lado2;
    }

    /**
     * Método para imprimir en consola los datos del rectangulo Redefine el método
     * mostrarInfo de la clase padre FiguraGeometrica.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double obtenerArea() {
        double areaRectangulo = lado1*lado2;
        return areaRectangulo;

    }

    public double obtenerPerimetro() {
        double perimetroCirculo = 2*(lado1+lado2);
        return perimetroCirculo;
    }
}

    

