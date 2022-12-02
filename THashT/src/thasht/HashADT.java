/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thasht;

import java.util.ArrayList;



/**
 *
 * @author HecGalv
 */
public class HashADT<T> {

    private ArrayList<ArrayList<T>> hash;
    private int size;

    public HashADT(int tamanio) {
        if (tamanio % 2 != 0) {
            this.size = tamanio;
        } else {
            tamanio = tamanio + 1;
            this.size = tamanio;
        }

        hash = new ArrayList<>(this.size);
        for (int i = 0; i <= this.size - 1; i++) {
            ArrayList<T> Dt1 = new ArrayList<>();
            hash.add(i, Dt1);
        }

    }

    public void Add(int key, T value) {
        int dato = key % size;
        T llave = (T) ("" + key);

        this.hash.get(dato).add(llave);
        this.hash.get(dato).add(value);

    }

    public T valueOf(int key) {
        int dato = key % size;
        String llave = "" + key;
        T resultado = (T) "Este dato no existe...";

        for (int i = 0; i <= hash.get(dato).size() - 1; i++) {
            String comp = (String) hash.get(dato).get(i);
            if (comp.equals(llave)) {
                resultado = this.hash.get(dato).get(i + 1);
                break;
            }

        }

        return resultado;
    }

    public void Remove(int key) {
        int dato = key % size;
        String llave = "" + key;

        for (int i = 0; i <= hash.get(dato).size() - 1; i++) {
            String comp = (String) hash.get(dato).get(i);
            if (comp.equals(llave)) {
                hash.get(dato).remove(i + 1);
                hash.get(dato).remove(i);
            }
        }
    }
}