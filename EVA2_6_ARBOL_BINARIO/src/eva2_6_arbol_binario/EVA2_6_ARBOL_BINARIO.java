/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_6_arbol_binario;

/**
 *
 * @author moviles
 */
public class EVA2_6_ARBOL_BINARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArbolBinario tree = new ArbolBinario();
        tree.agregar(13);
        tree.agregar(10);
        tree.agregar(18);
        tree.agregar(2);
        tree.agregar(11);
        tree.agregar(17);
        tree.agregar(20);
        tree.agregar(16);
        tree.agregar(16);
        tree.inOrder();
        tree.preOrder();
        tree.posOrder();
        
    }

}
