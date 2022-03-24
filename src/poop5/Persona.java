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
 * Nuestra clase Persona nos dara el nombre
 * completo al igual que su fecha de nacimiento
 * y edad.
 */
public class Persona {
    private String nombre ,apellido;
    private Fecha fNacimiento;
    private int edad;
    private String lugar;
    
    /**
     * Aqui va nuestro constructor vacio 
     * El cual no recibe ningun parametro
     */
    public Persona() {
    }

    /**
     * Aqui va nuestro constructor que recibe
     * los siguientes parametros :
     * @param nombre recibe un nombre de tipo String
     * @param apellido recibe un apellido de tipo String
     * @param fNacimiento recibe una fNacimiento de tipo Fecha
     * @param lugar recibe un lugar de tipo String
     * @param edad recibe una edad de tipo entero
     */
    public Persona(String nombre, String apellido, Fecha fNacimiento,int edad, String lugar) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = fNacimiento;
        this.edad = edad;
        this.lugar = lugar;
    }

    Persona(String nombre, String apellido, int dia, int mes, int anio, int edad, String lugar) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fNacimiento = new Fecha (dia,mes,anio);
        this.lugar = lugar;
        
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Fecha getfNacimiento() {
        return fNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return lugar + " nombre=" + nombre + ", apellido=" + apellido + ", fNacimiento=" + fNacimiento + ", edad=" + edad;
    }

    

    
    
    
}
