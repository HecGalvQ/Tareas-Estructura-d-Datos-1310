/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarealistasimple;
import CLista.ListaL_ADT;
/**
 *
 * @author HecGalv <your.name at your.org>
 */
public class TareaListaSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaL_ADT<Integer> h = new ListaL_ADT<>();
        System.out.println("Metodo Vacia");
        h.Vacia();
        //Retorna en caso de que la lista este vacia 
        System.out.println("Get size");
        h.getsize();//tamaño de la lista 
        System.out.println("Agregar ELEM al Final");
        h.AgAFinal(4);
        h.transversal(); //Al final de la lista agrega unn elemnto  
        System.out.println("Agregar ELEM al inicio");
        h.AgInicio(3);
        h.transversal(); //Al inicio de la lista agrega un elemnto
        System.out.println("Agregar despues d");
        h.AgrDespD(4, 7);
        h.transversal();
        //Tomando como referencia un elemento agregamos otro despues de este 
        h.AgInicio(120);
        h.AgAFinal(8);
        h.AgAFinal(77);
        h.AgAFinal(12);
        h.AgAFinal(13);
        h.AgrDespD(10, 27);
        System.out.println("Agrega mas elemntos");
        h.transversal();
        
        System.out.println("Delete");
        h.eliminar(7);
        h.transversal();
        //eliminara un elemento en la posicion que se indique 
        System.out.println("Eliminar Final");
        h.eliminarF();
        h.transversal();
        System.out.println("Eliminar el primero");
        h.eliminaFrst();
        h.transversal();
        //ambos codigos elimina uno por su parte el ultimo elemento de la lista y el otro el primero
        System.out.println("Metodo Search- -BUSCAR");
        h.search(9);//Nusca el elemento en la posicion señalada 
        System.out.println("Metodo Refresco"); //actualiza 
        h.refresco(5, 0);
        h.transversal();
        System.out.println("Tamaño");
        h.getsize();
        System.out.println("Transversal");
        h.transversal(); //Imprime de forma transversal la lista 
        System.out.println("Vacia");
        h.Vacia();//Retorna si la lista está vacia 
    }
    
}
