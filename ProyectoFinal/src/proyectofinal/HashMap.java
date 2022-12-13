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
public class HashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos el HashMap
        java.util.HashMap<Integer,String> map=new java.util.HashMap<Integer,String>();
        
        //Agregamos elementos
        map.put(1,"Cenicienta"); 
        map.put(2,"Peter Pan");    
        map.put(3,"Cars");   
        map.put(4,"Dumbo");   
        map.put(5,"Blancanieves");   
        map.put(6,"Lilo y stich");   
        
        //Se imprime el HashMap
        System.out.println(map);
        //Se elimina el elemento numero 5
        map.remove(5);
        System.out.println(map);
        //Se re´plaza el elemento 6 Stray por The Last Of Us
        map.replace(1, "101Dalmatas");
        System.out.println(map);
        //Pregunta si hay un valor en el elemento 7
        System.out.println(map.containsKey(7));
        //Pregunta si existe el valor Bella Durmiente 
        System.out.println(map.containsValue("Bella Durmiente"));
        //Se reemplaza todos los elementos a un solo valor
        map.replaceAll((k,v) -> "La mejor pelicula de Disney");  
       //Se vuelve a imprimir el HashMap
        System.out.println(map);      
    }   
}
   
    

