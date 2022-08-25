/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArregloP;

/**
 *
 * @author HecGalv <your.name at your.org>
 */
public class ArregloC {
    private int size;
    private int longitud;
    private int elemento;

    public ArregloC() {
    }

    public ArregloC(int size, int longitud, int elemento) {
        this.size = size;
        this.longitud = longitud;
        this.elemento = elemento;
    }
    public static void main(String[] args) {
        
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    @Override
    public String toString() {
        return "ArregloC{" + "size=" + size + ", longitud=" + longitud + ", elemento=" + elemento + '}';
    }
    
    
}
