/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author alumno
 */


/**
 * 
 * En esta clase Circulo utilizamos PI
 * con valor de 3.13416 y un radio de tipo double
 */  
public class Circulo {
    double PI = 3.1416;
    private double radio;
    
    /**
    * Constructor vacio de Circulo
    */
    public Circulo() {
    }
    
    /**
    * Nuestra clase circulo recibe los siguientes parametros: 
    * @param radio el cual es de tipo double y ayudara a sacar el perimetro
    */
    
    public Circulo(double radio) {
        this.radio = radio;
    }
    /**
     * Esta clase nos ayudara a sacar el perimetro de
     * un circulo con cierto radio usando la formula
     * de 2 por PI por radio y lo imprimira en pantalla
     */
    public void perimetro() {
        double perimetro = 2 * PI * radio;
        System.out.println("Perimetro: "+perimetro);
    }
    /**
     * Esta clase nos ayudara a sacar el area de un 
     * circulo con cierto radio usando la formula de PI
     * por radio al cuadrado
     */
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
