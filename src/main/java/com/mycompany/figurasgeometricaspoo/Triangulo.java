package com.mycompany.figurasgeometricaspoo;

public class Triangulo extends FiguraGeometrica {
     private double base;
     private double altura;
    /**
     * Constructor de la clase circulo.
     *
     * @param nombre
     * @param color
     * @param radio
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    
    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }
    
    /**
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double getBase() {
        return this.base;
    }
    
    /**
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double getAltura() {
        return this.altura;
    }
    

    /**
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void setBase(double radio) {
        this.base = base;
    }
    

    /**
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public void setAltura(double radio) {
        this.altura = altura;
    }

    /**
     * Método para imprimir en consola los datos del rectangulo Redefine el método
     * mostrarInfo de la clase padre FiguraGeometrica.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double obtenerArea() {
        double areaTriangulo = (base*altura)/2;
        return areaTriangulo;

    }

    public double obtenerPerimetro() {
        double perimetroCirculo = (base+altura)+ Math.sqrt(Math.pow(base,2)+Math.pow(altura,2));
        return perimetroCirculo;
    }
}