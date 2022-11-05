/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_queue;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 3PY37LA_RS6
 */
public class EVA2_4_QUEUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue();

        myQueue.agregar(10);
        myQueue.agregar(20);
        myQueue.agregar(30);
        myQueue.agregar(40);

        myQueue.imprimir();
        System.out.println("Primer valor en llegar: " + myQueue.peek());

        try {
            System.out.println("El primer nodo eliminado es " + myQueue.poll());
        } catch (Exception ex) {
            Logger.getLogger(EVA2_4_QUEUE.class.getName()).log(Level.SEVERE, null, ex);
        }
        myQueue.imprimir();
    }

}
