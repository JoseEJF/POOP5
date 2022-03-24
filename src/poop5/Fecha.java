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
 * En esta clase Fecha utilizamos tres 
 * enteros de tipo private en donde vamos
 * a tener dia/mes/anio
 */  
 public class Fecha {
     private int dia,mes,anio;
     
    /**
     * Constructor vacio de Fecha
     */ 
    public Fecha() {
    }
    /**
     * Nuestra clase Fecha recibe los siguientes parametros:
     * @param dia un entero con formato dd
     * @param mes un entero con formato mm
     * @param anio un entero con formato aaaa
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return dia+"/"+mes+"/"+anio;
    }
    
     
}
