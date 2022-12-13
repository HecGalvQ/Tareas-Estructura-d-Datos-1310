/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinal;
import java.util.*;

/**
 *
 * @author HecGalv <your.name at your.org>
 */
public class TreeMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Creamos TreeMap
        java.util.TreeMap<Integer,String> map=new java.util.TreeMap<Integer,String>();    
        
        //Agregamos elementos
        map.put(1,"Héctor");    
        map.put(2,"Jonathan");    
        map.put(3,"Fili");    
        map.put(4,"Vanessa");    
        map.put(5,"Miguel");   
        map.put(6,"Daniela");    
        map.put(7,"Poncho");    
        map.put(8,"Ana");    
        map.put(9,"Amanda");    
        map.put(10,"Sujey");    
        
        //Se imprime el TreeMap
        System.out.println(map); 
        //Se regresa los elementos con llave menor o igual a 1
        System.out.println("El que se muere de amor es: "+map.headMap(2,true)); 
        //Se regresa los elementos con llave menor o igual a 3
        System.out.println("El corazon de pollo es: "+map.headMap(1,true)); 
        //Se regresa los elementos con llave mayor o igual a 7
        System.out.println("Quienes no son queridos por nadie: "+map.tailMap(7,true));  
        //Elminamos elemento 
        map.remove(10);
        //Se vuelve a imprimir el TreeMap
        System.out.println(map);
        
    }
    
}
