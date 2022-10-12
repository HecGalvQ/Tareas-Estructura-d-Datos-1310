/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLista;
import NodoADT.CNodo;
/**
 *
 * @author HecGalv <your.name at your.org>
 */
public class ListaL_ADT <T>{
    CNodo<T> head;
    int size;

    public ListaL_ADT() {
    }
    public boolean Vacia(){
        System.out.println(this.head==null);
        return this.head==null;
        }    
    public int getsize() {
        System.out.println("El tamaño de la lista es el siguiente: "+ this.size);
        return this.size;
    } 
    public void AgAFinal(T valor){
        if(this.head==null){
            head = new CNodo<>(valor);
        }else{
            CNodo<T> nuevo = new CNodo(valor);
            CNodo<T> aux = this.head;
            while (aux.getSiguiente()!= null){
                aux = aux.getSiguiente();
            }
        aux.setSiguiente(nuevo);
        size++;
        } 
    } 
    public void AgInicio(T valor){
        if(this.head==null){
            head = new CNodo<>(valor);     
      }else{ 
            CNodo<T> nuevo = new CNodo(valor);
            nuevo.setSiguiente(head);
            head = nuevo;
            size++; 
        }
    } 
    public void AgrDespD(T referencia, T valor){ 
        if(this.head == null){
            System.out.println("Lista vacía, se agregará éste valor como el unico");
            head = new CNodo<>(valor);
        }else{
        CNodo<T> nuevo = new CNodo(valor);
        
        CNodo<T> aux = this.head;
        CNodo<T> aux2 = this.head.getSiguiente();
        
        while(aux.getDato() != referencia){
            aux = aux.getSiguiente();
            aux2 = aux2.getSiguiente();
        }
        
        aux.setSiguiente(nuevo);
        aux.getSiguiente().setSiguiente(aux2);
        
        size++;
        }
    }
    public void eliminar(int lugar){
        int lug = 0;
        
        if(head == null){
            System.out.println("Lista vacía, ingrese elementos a la lista por favor");
        }else{
            CNodo<T> aux_anterior = this.head;
            CNodo<T> aux = this.head.getSiguiente();

            while(lug != lugar){
                lug++;
                aux = aux.getSiguiente();
                aux_anterior = aux_anterior.getSiguiente();
            }
            aux_anterior.setDato(aux.getDato());
            aux_anterior.setSiguiente(aux.getSiguiente());

            size--;
        }  
        
    }
    public void eliminaFrst(){
        CNodo<T> aux = this.head;
            
        aux.setDato(head.getSiguiente().getDato());
            
        aux.setSiguiente(head.getSiguiente().getSiguiente());
        
        size--;
    }
    
    public void eliminarF(){
        CNodo<T> nuevo = this.head.getSiguiente();
        CNodo<T> aux = this.head;
            
        while(nuevo.getSiguiente() != null){
            aux = aux.getSiguiente();
            nuevo = nuevo.getSiguiente();
        }
        aux.setSiguiente(null);
            
        size--;
    }
     public void search(T valor){
        CNodo<T> aux = this.head;
        int indc = 0;
        
        try {
            while(aux.getDato() != valor && aux.getDato() != null){
            aux = aux.getSiguiente();
            indc++;
        }
        System.out.println("Este dato '" + aux.getDato() + "' se encuentra en esta posición: " + indc);
        } catch (Exception e) {
            System.out.println("Este dato '" + valor + "' no se encuentra en la lista, intente con otro.");
        }
    }
    
    public void refresco(T a_buscar, T valor){
        CNodo<T> aux = this.head;
        
        try {
            while(aux.getDato() != a_buscar){
            aux = aux.getSiguiente();
        }
        aux.setDato(valor);
        } catch (Exception e) {
            System.out.println("Este dato '" + a_buscar + "' no se encuentra en la lista, no es posible actualizar.");
        }
    }
    
    public void transversal(){
        CNodo<T> aux = this.head;
        
        while(aux != null){
            System.out.print(aux);
            aux = aux.getSiguiente();
        }
        System.out.print("\n");
    }


}
