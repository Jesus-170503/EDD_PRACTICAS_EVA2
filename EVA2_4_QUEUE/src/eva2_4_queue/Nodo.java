/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_queue;

/**
 *
 * @author 3PY37LA_RS6
 */
public class Nodo {
     private int valor;
    private Nodo siguiente;
    private Nodo previo;

    // POR DEFAUL , UN NUEVI NODO VA AL FINAL DE LA LISTA 
    // EL FINAL DE LA LISTA SE INDICA CON NULL
    // POR ESO SIGUIENTE = NULL
    public Nodo() {
        this.siguiente = null; 
        this.previo=null;
    }

    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente=null;
        this.previo=null;
    }

    public Nodo getPrevio() {
        return previo;
    }

    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }
    

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
