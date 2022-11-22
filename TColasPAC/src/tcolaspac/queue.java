/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tcolaspac;

import java.util.ArrayList;

/**
 *
 * @author HecGalv <your.name at your.org>
 */
public class queue<T> {
    private ArrayList<T> dat;

    public queue() {
        dat = new ArrayList<>();
    }

    public boolean isEmpty() {
        return dat.isEmpty();
    }

    public int length() {
        return dat.size();
    }

    public void enqueue(T Valor) {
        dat.add(Valor);
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        return dat.remove(0);
    }

    @Override
    public String toString() {
        String queue = "";
        for (int i = 0; i < length(); i++) {
            queue += ("\n------" + dat.get(i) + "\n------ ");
        }
        return queue; 
    }

}

    

