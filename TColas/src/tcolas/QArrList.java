/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tcolas;

import java.util.ArrayList;

/**
 *
 * @author HecGalv <your.name at your.org>
 */
public class QArrList<T> {
    private ArrayList<T> dat; 
    public QArrList(){
        dat=new ArrayList<>();
    }
    public boolean isEmpty(){
        return dat.isEmpty();
    }
    public int lenght(){
        return dat.size();
    }
    public void enqueue (T value){
        dat.add(value);
    }
    public T dequeue(){
        if (isEmpty()){
            return null;
        }
        return dat.remove(0);
    } 

    @Override
    public String toString() {
        String queue = "";
        for(int a = 0; a < lenght(); a++){
        queue += ("*" + dat.get(a) + "* ");
         }
        return queue;
        
    }
    
    
    
}
