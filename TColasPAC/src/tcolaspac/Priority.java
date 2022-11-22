/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tcolaspac;

/**
 *
 * @author HecGalv <your.name at your.org>
 */
public class Priority<T> {
     private queue<T>[] DTa;
    private int size = 0;

    public Priority(int levels) {
        DTa =  new queue[levels];
        for (int i = 0; i < DTa.length; i++) {
            DTa[i] = new queue<>();
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int length() {
        return size;
    }

    public void enqueue(int priority, T element) {
        if (priority >= DTa.length) {
            return;
        }
        DTa[priority].enqueue(element);
        size++;
    }
    
    public T dequeue(){
        for (queue<T> data : DTa) {
            if (!data.isEmpty()) {
                size--;
                return data.dequeue();
            }
        }
        return null;
    }
    
     @Override
    public String toString() {
        String boundedPriorityQueue = "";
        for (int i = 0; i < DTa.length; i++) {
            boundedPriorityQueue += "Nivel " + i +": "+  DTa[i] + "\n";
        }
        return  boundedPriorityQueue;
    }

}