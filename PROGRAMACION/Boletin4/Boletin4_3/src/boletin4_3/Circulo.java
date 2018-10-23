/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_3;

/**
 *
 * @author Juan Martínez
 */
public class Circulo {

    //Inicializar las variables de caracter privado
    private double radio;
    private final double PI;

    //Constructor por defecto
    public Circulo() {
        this.PI = 3.14;

    }

    //Parametros
    public Circulo(double radio) {
        this.PI = 3.14;
        this.radio = radio;
    }
    
    //Metodos de acceso
    

    Circulo(int i, int i0) {
        this.PI = 3.14;

    }

    public double calcularArea() {
        double area = PI * Math.pow(radio, 2);
        return area;
    }

    public double calculaPerimetro() {
        double perimetro = 2 * PI * radio;
        return perimetro;
    }

}
