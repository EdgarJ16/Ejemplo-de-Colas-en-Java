/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;

/**
 *
 * @author edgar
 */
public class Elemento {

    //Encapsulamiento de datos
    int dato;
    int posicion;

    //Constructor 
    public Elemento(int dat) {
        this.dato = dat;
     
    }
    //Getters y setters

    public void setElemnto(int elemento) {
        dato = elemento;
    }

    public int getElemento() {
        return dato;
    }

    public void setPos(int pos) {
        posicion = pos;
    }

    public int getPos() {
        return posicion;
    }
    
      //Obtiene valor del elemento en la posicion que indique el ususarix 
 

}
