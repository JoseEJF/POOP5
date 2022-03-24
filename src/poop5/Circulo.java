/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author alumno
 */
public class Circulo {
    double PI = 3.1416;
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    public void perimetro() {
        double perimetro = 2 * PI * radio;
        System.out.println("Perimetro: "+perimetro);
    }
    
    public void area(){
        double area = PI * radio * radio;
        System.out.println("Area: "+area);
    }
    
    public double getRadio(){
        return radio;
    }
    
    public void setRadio(double radio){
        if (radio<0){
            radio = 1;
        }
        this.radio = radio;
    }

    @Override  //Sobreescritura del metodo
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    

    
    
}
