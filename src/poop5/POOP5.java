/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop5;

/**
 *
 * @author alumno
 */

/**
 * Esta es nuestra clase principal en la 
 * cual crearemos nuestros objetos
 */
public class POOP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circulo cir = new Circulo();
        cir.setRadio(5);
        cir.area();
        cir.perimetro();
    
        double radio = cir.getRadio();
        System.out.println("Radio: "+radio);
        System.out.println(cir);  
        
        Circulo cir2 = new Circulo();
        cir.setRadio(-15);
        System.out.println("cir2: "+cir2);
        System.out.println("################");
        Persona per1 = new Persona();
        System.out.println(per1);
        per1.setNombre("Jorge");
        per1.setApellido("Ramirez");
        System.out.println(per1);
        Fecha fecha = new Fecha(2,3,1998);
        System.out.println(fecha);
        per1.setfNacimiento(fecha);
        System.out.println(per1);  // se concatenan ambas cadenas
        per1.setEdad(24);
        System.out.println(per1);
        per1.setLugar("Copiloto");
        
        System.out.println("################"); //Forma 1
        Fecha fecha2 = new Fecha(2,2,2002);
        Persona per2 = new Persona("Jose","Jimenez",fecha2,20, "Chofer");
        System.out.println(per2);
        
        System.out.println("################");  // Forma 2
        Persona per3 = new Persona("Fernanda","Perez",new Fecha(3,3,2001),21, "Pasajero1");
        System.out.println(per3);
        
        System.out.println("################");
        Persona per4 = new Persona("Julieta","Anaya",4,9,2000,21, "Pasajero2");
        System.out.println(per4);
        System.out.println("################");
        Coche coche = new Coche();
        coche.setChofer(per2);
        coche.setCopiloto(per1);
        coche.setPasajero1(per3);
        coche.setPasajero2(per4);
        coche.lugar(per1);
        coche.lugar(per2);
        coche.lugar(per3);
        coche.lugar(per4);
    }
    
}
