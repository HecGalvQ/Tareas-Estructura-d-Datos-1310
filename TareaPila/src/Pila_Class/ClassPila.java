/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pila_Class;

import java.util.ArrayList;

/**
 *
 * @author HecGalv <your.name at your.org>
 */
public class ClassPila<T> {

    int size;
    ArrayList<T> ZPila = new ArrayList();
    int top = 0;

    public ClassPila() {
    }
    public boolean isEmpty(){
        return this.ZPila==null;
    }
    public int legnth(){
        return this.size;
    } 
    public T pop(){
        T delete = null;
        if(isEmpty()){
            System.out.println("El metodo no es valido, porque la Pila está vacía.");
        }else{
            delete = ZPila.remove(top-1);
            this.top--;
            this.size--;
                    
        } 
        return delete;
    }
    public T peek(){
        T consultar = null;
        if(isEmpty()== true){
            
            System.out.println("El metodo no es valido, la Pila está vacía.");
        }else{
            consultar = ZPila.get(top-1);
            
        }
        return consultar;
    } 
    public void push(T dat){
        ZPila.add(top, dat);
        this.top++;
        this.size++;
    }

    @Override
    public String toString() {
        return "ClassPila{" +ZPila+ "}";
    }

}
