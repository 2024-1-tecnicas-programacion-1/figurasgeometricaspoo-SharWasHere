package com.mycompany.figurasgeometricaspoo;

public class Circulo extends FiguraGeometrica {
    
    private double radio;
    
    /**
     * Constructor de la clase circulo.
     *
     * @param nombre
     * @param color
     * @param radio
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    
    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }

    /**
     * Método para imprimir en consola los datos del circulo.
     * Redefine el método mostrarInfo de la clase padre FiguraGeometrica.
     * 
     * Complejidad temporal: O(1) Tiempo constante.
     */

    public double obtenerArea() {
        return super.obtenerArea();

    }
    public double obtenerPerimetro() {
        return super.obtenerPerimetro();
    }
}
    

