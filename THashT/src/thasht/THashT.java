/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thasht;
import thasht.HashADT;


/**
 *
 * @author HecGalv <your.name at your.org>
 */
public class THashT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashADT Hash= new HashADT(70);
       Hash.Add(3, "Perro");       
       Hash.Add(12, "Gato");
       Hash.Add(4, "Hurón");
       Hash.Add(6, "Conejo");
       Hash.Add(1, "Pez");
       Hash.Add(71, 5);
       System.out.println(Hash.valueOf(3));
       Hash.Remove(3);
       System.out.println(Hash.valueOf(6));
       System.out.println(Hash.valueOf(1));
       System.out.println(Hash.valueOf(71));
    }    
}
