/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tcolas;
import tcolas.QArrList;

/**
 *
 * @author HecGalv <your.name at your.org>
 */
public class TColas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //implementamos la clase cola junto con sus metodos +
        System.out.println("\n -Estrructura de datos Colas-");
        QArrList<String> EQFut = new QArrList<>();
        //Cuando no tenga elementos size y empty  
        System.out.println("Vacia.." + EQFut.isEmpty());
        System.out.println("Size: " + EQFut.lenght());
        //agregamos los elementos
        System.out.println("Aregando elementos...");
        EQFut.enqueue("Barcelona");
        EQFut.enqueue("Real Madrid");
        EQFut.enqueue("Bayern");
        EQFut.enqueue("Liverpool");
        EQFut.enqueue("Manchester City");
        // cuando ya tiene elementos
        System.out.println("Vacia" + EQFut.isEmpty());
        System.out.println("Su tamaño es: " + EQFut.lenght());
        //mostramos la edd y quitamos un elemento para volver a mostrarla ya actualizada
        System.out.println("\n Equipos de Futbol: \n" + EQFut);
        System.out.println("\n Quitamos el primer elemento en entrar: " + EQFut.dequeue());
        System.out.println("\n Actualizacion equipos de Futbol: \n" + EQFut);
        
        
    }
    
}
