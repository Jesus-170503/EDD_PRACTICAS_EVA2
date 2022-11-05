/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_lista_simple;

/**
 *
 * @author moviles
 */
public class Nodo {
    private int valor;
    private Nodo siguiente;

    // POR DEFAUL , UN NUEVI NODO VA AL FINAL DE LA LISTA 
    // EL FINAL DE LA LISTA SE INDICA CON NULL
    // POR ESO SIGUIENTE = NULL
    public Nodo() {
        this.siguiente = null; 
    }

    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente=null;
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
