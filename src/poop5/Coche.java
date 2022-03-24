/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this  license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author alumno
 */

/**
 * 
 * En esta clase Coche nos mostrara el tipo de 
 * modelo del coche al igual que su color,placas,
 * marca, al igual que la posicion de cada persona
 * dentro de el.
 */
public class Coche {
    String marca,color,placa;
    int modelo,numPuertas;
    private Persona chofer,copiloto,pasajero1,pasajero2;

    /**
     * Aqui va nuestro constructor vacio 
     * El cual no recibe ningun parametro
     */
    public Coche() {
    }
    /**
     * Aqui tenemos nuestro constructor que recibe 
     * los siguientes parámetros: 
     * @param marca es un tipo String que nos dara la marca del coche
     * @param color es un tipo String que nos dara el color del coche
     * @param placa es un tipo String que nos dara la placa del coche
     * @param modelo es un tipo entero que da el numero de modelo
     * @param numPuertas es un tipo entero que da el numero de puertas
     * @param chofer son un tipo persona que nos dara un chofer
     * @param copiloto son un tipo persona que nos dara un copiloto
     * @param pasajero1 son un tipo persona que nos dara un pasajero1
     * @param pasajero2 son un tipo persona que nos dara un pasajero2
     */
    public Coche(String marca, String color, String placa, int modelo, int numPuertas, Persona chofer, Persona copiloto, Persona pasajero1, Persona pasajero2) {
        this.marca = marca;
        this.color = color;
        this.placa = placa;
        this.modelo = modelo;
        this.numPuertas = numPuertas;
        this.chofer = chofer;
        this.copiloto = copiloto;
        this.pasajero1 = pasajero1;
        this.pasajero2 = pasajero2;
    }
    /**
     * Getters y setters de cada uno de nuestros parametros
     * @return nos devolvera por medio de un get lo que se pida
     */

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public Persona getChofer() {
        return chofer;
    }

    public void setChofer(Persona chofer) {
        this.chofer = chofer;
    }

    public Persona getCopiloto() {
        return copiloto;
    }

    public void setCopiloto(Persona copiloto) {
        this.copiloto = copiloto;
    }

    public Persona getPasajero1() {
        return pasajero1;
    }

    public void setPasajero1(Persona pasajero1) {
        this.pasajero1 = pasajero1;
    }

    public Persona getPasajero2() {
        return pasajero2;
    }

    public void setPasajero2(Persona pasajero2) {
        this.pasajero2 = pasajero2;
    }
    
    /**
     * Aqui van nuestros métodos de nuestro coche
     * y nos imprime en pantalla cada uno de ellos
     * segun sean llamados
     */
    
    /**
     * Metodo para encender el coche
     */
     public void prender(){
       System.out.println("Auto encendido");
        }
     /**
      * Metodo para apagar el coche
      */
      public void apagar(){
       System.out.println("Auto apagado");
        }
      /**
       * Metodo para frenar el coche
       */
       public void frenar(){
       System.out.println("Has frenado");
        }
       /**
       * Metodo para girar el coche
     * @param Derecha es la direccion en
     * la que el coche va a girar
       */
       public void girar(String Derecha){
       System.out.println("Estoy girando a la "+Derecha);
        }
       /**
       * Metodo para acelerar el coche
       */
       public void acelerar(){
       System.out.println("Estas acelerando");
        }

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", color=" + color + ", placa=" + placa + ", modelo=" + modelo + ", numPuertas=" + numPuertas + ", chofer=" + chofer + ", copiloto=" + copiloto + ", pasajero1=" + pasajero1 + ", pasajero2=" + pasajero2 + '}';
    }
    
    /**
     * Se le asigna un lugar dentro 
     * del coche a una persona 
     * 
     * @param persona nos muestra que lugar ocupa en el coche
     */
    public void lugar(Persona persona){
        System.out.println("Yo soy: " + persona);
    }
}
