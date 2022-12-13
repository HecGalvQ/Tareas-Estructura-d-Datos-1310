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
public class LkHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Creación la LinkedHashMap
        LinkedHashMap<Integer, String> Hashmap =  new  LinkedHashMap<Integer, String>();           
        Hashmap.put(319135372,"Galvan Quiroz Héctor");    
        Hashmap.put(318544721,"Rock Lee");    
        Hashmap.put(319133322,"Giron Cabrera Jonathan");    
        Hashmap.put(317723451,"Castillo Constantino Filiberto");    
        Hashmap.put(319125053,"Caballero Hernandez Nathaly"); 
        Hashmap.put(319177257,"Hatake Kakashi");    
        Hashmap.put(315828966,"Uzumaki Naruto"); 
        
       //Se imprime LkHashMap
        System.out.println(Hashmap);
       //Regresa las llaves de los elementos del HashMap
       System.out.println( "Llaves: " +Hashmap.keySet());  
       //Regresa el  valor  asignados a las llaves
       System.out.println("Values: "+Hashmap.values());  
       //Regresa la llave y el valor asignado
       System.out.println( "llave/valor: " +Hashmap.entrySet());  
       //Preguunta si existe la llave 666
        System.out.println(Hashmap.containsKey(319135372));
       //Existe el valor Galvan Quiroz??
        System.out.println(Hashmap.containsValue("Galvan Quiroz Héctor"));
       //Elimina elemento con llave 319135372
        Hashmap.remove(319135372);  
       //Volvemos a Imprimir el LinkedHashMap
        System.out.println(Hashmap);
    }
}

    

