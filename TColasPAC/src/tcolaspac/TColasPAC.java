/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tcolaspac;
import tcolaspac.Priority;

/**
 *
 * @author HecGalv <your.name at your.org>
 */
public class TColasPAC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Priority<String> Barco = new Priority(7);
        System.out.println("El Barco está vacio " + Barco.isEmpty());
        //Agregamos elementos 
        System.out.println("\n Suben Personas\n");
        Barco.enqueue(4, "Maestre");
        Barco.enqueue(2, "Niños");
        Barco.enqueue(4, "Mecánico");
        Barco.enqueue(3, "Mujeres");
        Barco.enqueue(2, "3a Edad");
        Barco.enqueue(1, "Niñas");
        Barco.enqueue(3, "Hombres");
        Barco.enqueue(4, "Vigia");
        Barco.enqueue(5, "Capitán");
        Barco.enqueue(4, "Timonel");
        //Empty cuando no está vacia 
        System.out.println("EL BARCO ESTA VACIO: " + Barco.isEmpty());
        //mostramos el priority
        System.out.println("\n Barco SaveLife:\n " + Barco);
        //Lenght para los elementos de la cola 
        System.out.println("Personas abordo: " + Barco.length());
        //Eliminar elementos 
        System.out.println("\n Dejamos a su suerte a: " + Barco.dequeue() + "Tambien a: " + Barco.dequeue());
        //mostramos 
        System.out.println("\n Barco SafeLive: \n" + Barco);
        System.out.println("Personas a Bordo" + Barco.length());
        
        
    }
    
}
