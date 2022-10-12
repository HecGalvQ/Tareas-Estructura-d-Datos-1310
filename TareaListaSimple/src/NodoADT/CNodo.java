/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NodoADT;

/**
 *
 * @author HecGalv <your.name at your.org>
 */
public class CNodo<T> {
    private T dato;
    private CNodo<T> siguiente;

    public CNodo() {
    }
    public CNodo(T valor){   
        this.dato = valor;
    }

    public CNodo(T dato, CNodo<T> siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public CNodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(CNodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "|"+dato+"| -->";
        
    }
    
    
    
    
    
}
