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
public class Cola {
    //Se crea la clase interna nodo que va a contener el dato el apuntador al siguiente dato

    class Nodo {
        //Nodos tienen 2 propiedades 1 TIPO DE DATO  2 APUNTADOR AL DATO SIGUIENTE    
        //Campo de informacion 

        Elemento dato;
        //Apuntador siguiente 
        Nodo siguiente;

        public Nodo(Elemento valor) {//Recibe el valor
            dato = valor;
            siguiente = null;
        }

        //setters y getters del nodo 
        public Nodo getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo sig) {
            this.siguiente = sig;
        }
    }//Fin Clase interna nodo 

    //ENCAPSULAMIENTO DE DATOS
    
    private int tamano=0;
    private Nodo principio, ultimo;
    String contenido = "";

//COnstructor
    public Cola() {
        principio = null;
        ultimo = null;
    }

//Metodos 
//Status de la cola  vacio o lleno 
    public boolean statusCola() {
        if (principio == null) {
            return true;
        } else {
            return false;
        }
    }
//Inserta un elemento al final de la cola 

    public void enqueue(Elemento data) {
//Se crea un nuevo nodo
        Nodo nuevoNodo = new Nodo(data);
//Se prosigue a indicar donde apunta el nuevo nodo 
        nuevoNodo.siguiente = null;

        if (statusCola()) {
            principio = nuevoNodo;
            ultimo = nuevoNodo;

        } else {//si la pila no esta vacia el elemento se ingresa al final de la cola por eso 
            //el apuntador al siguiente dato se actualiza 
            // asi como el final de la cola 
            ultimo.siguiente = nuevoNodo;
            ultimo = nuevoNodo;

        }
        tamano++;
        data.setPos(tamano);
    }
//Saca el primer elemento de la cola 
    public Elemento dequeue() {
        if (!statusCola()) {//Si la cola no esta vacia 
            Elemento informacion = principio.dato; // Guarda el dato del nodo que esta al principio de la cola 
            if (informacion == ultimo.dato) {//si el elemento al principio de la cola es igual es porque ya es el utlimo elemnto 
                principio = null;
                ultimo = null;
            } else {
                principio = principio.siguiente; // el princio de la cola pasa a ser el siguiente
            }
            //CICLO CONTROLA POSICIONES 
        int posicion =1;
        Nodo recorrido = principio;
        while (recorrido!=null){
         Elemento e;
         
         e= recorrido.dato;
         e.setPos(posicion);
         posicion ++;
        recorrido = recorrido.siguiente;
        
        }
            
            tamano--;
            return informacion;
        }//Fin if 
        else{
            
            
            
            
        return null;
        }
        
    }
    //regresa el tamano de la cola 
    public int  len(){
    return tamano;
    }
    
    //Obtiene valor del elemento en la posicion que indique el ususarix 
    public int buscaElemento(int pos){
        Nodo recorrido = principio;
        
        while (recorrido!=null){
        if (recorrido.dato.posicion==pos){
        return recorrido.dato.dato;
        }
        recorrido = recorrido.siguiente;
        }
        return Integer.MAX_VALUE;   
    }
    
    //regresa la cola 
   

}
