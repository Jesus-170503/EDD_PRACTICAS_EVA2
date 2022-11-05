/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_lista_doble;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 3PY37LA_RS6
 */
public class EVA2_3_LISTA_DOBLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          ListaDoble listaDoble = new ListaDoble();
        
        listaDoble.agregar(10);
        listaDoble.agregar(20);
        listaDoble.agregar(30);
        listaDoble.agregar(40);
        listaDoble.agregar(50);
        listaDoble.imprimir();
        
        
        
        try {
            listaDoble.insertarEn(35, 0);
        } catch (Exception ex) {
            Logger.getLogger(EVA2_3_LISTA_DOBLE.class.getName()).log(Level.SEVERE, null, ex);
        }
        listaDoble.imprimir();
        
        try {
            listaDoble.borrarEn(3);
        } catch (Exception ex) {
            Logger.getLogger(EVA2_3_LISTA_DOBLE.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         listaDoble.imprimir();
        
    }
    
}
