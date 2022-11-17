/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareapila;
import Pila_Class.ClassPila;

/**
 *
 * @author HecGalv 
 */
public class TareaPila {

    
    public static void main(String[] args) {
      ClassPila pila = new ClassPila();
      //agregamos elementos
      pila.push(777);
      pila.push("Wenas");
      pila.push("Tardes");
      pila.push(121);
      pila.push(10);
      pila.push("Héctor");
      
        System.out.println(pila);
        //se mostrará la pila
        //Para el tamaño de la pila
        System.out.println("\nEl tamaño de la pila: " + pila.legnth());
        
        System.out.println("\nLa pila estará vacia?" + pila.isEmpty());
        
        //eliminamos el elemento tope 
        System.out.println("\nEl elemnto del top elliminado de la pila: " + pila.pop());
        //mostramos el dato
        System.out.println("\nEl Elemento del tope: " + pila.peek());
        
        System.out.println("\nLa pila despues de las pruebas. " + pila.toString());
    
        
    }
    
}
