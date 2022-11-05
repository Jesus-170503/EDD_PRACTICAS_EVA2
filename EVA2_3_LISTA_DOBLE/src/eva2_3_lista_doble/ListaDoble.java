/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_lista_doble;

/**
 *
 * @author 3PY37LA_RS6
 */
public class ListaDoble {
    private Nodo inicio;
    private Nodo fin;
    private int cont;
    
    
    public ListaDoble(){
         this.inicio = null;// no hay nodos en la lista 
        this.fin = null;
        this.cont=0;
}
     public boolean estaVacia(){ //Copiada directamente
        if(inicio == null)
            return true;
        else 
        return false;
    }
    
    
    
   public void imprimir(){ //Copiada directamente
       if(estaVacia())
           System.out.println("LISTA VACIA");
       else{
       Nodo temp = inicio;
       while(temp != null){
          System.out.print(temp.getValor() + " - ");
                temp = temp.getSiguiente();
 
            }
       }
       System.out.println("");
   }
   
    public int tamaLista(){ //Copiada directamente
        
        return this.cont; 
    }
    
    
     public void vaciarLista(){ //Copiada directamente
        inicio=null;
        fin=null;
        cont=0;
    }
     
     public void agregar(int valor){ //Modificado 
        Nodo nuevoNodo = new Nodo(valor);
        
        
       // verificar si hay nodos en la lista
        if(inicio == null){//no hay nodos en la lista
            inicio = nuevoNodo;
            fin = nuevoNodo;
        }else{//hay nodos en la lista
            // hay que movernos por la loista
            // usando un nodo temporal hasta
            // el ultimo nodo de la lista
            fin.setSiguiente(nuevoNodo);
            nuevoNodo.setPrevio(fin);
            fin = nuevoNodo;
            
        }
        cont++;
        
    }
     
     public void insertarEn(int valor, int pos) throws Exception{  //Modificado
        
        int cantNodos = tamaLista();
        //que debemos valorar
        //insertar una posicion no valida
        //posiciones negativas 
        //posiciones mayores a la cantidad de elementos
        
        if ( pos < 0)// posiciones negativas
            throw new Exception("No puede insertarse un nodo en una posicion negativa");
        else if (pos >= cantNodos )//posiciones mayores a la cantidad  de elementos
        throw new Exception(pos + " no es una possicion valida en la lista");
        else{
            Nodo nuevoNodo = new Nodo(valor);
            if(pos == 0){//insertar al inicio de la lista
                nuevoNodo.setSiguiente(inicio);
                inicio.setPrevio(nuevoNodo);
                inicio = nuevoNodo;
            }else{// insertar un nodo en una posicion
                Nodo temp = inicio;
                int cont = 0;
                while(cont < (pos)){
                
                temp = temp.getSiguiente();
                 cont++;
                
            }
                // y ahora??
                nuevoNodo.setSiguiente(temp);
                nuevoNodo.setPrevio(temp.getPrevio());
                temp.getPrevio().setSiguiente(nuevoNodo);
                temp.setPrevio(nuevoNodo);
                
                
            }
            this.cont++;
        }
        
    }
     
        public void borrarEn(int pos ) throws Exception{
        int cantNodos = tamaLista();
     if ( pos < 0)// posiciones negativas
        throw new Exception("No puede insertarse un nodo en una posicion negativa");
        else if (pos >= cantNodos )//posiciones mayores a la cantidad  de elementos
        throw new Exception(pos + " no es una possicion valida en la lista");
        else{   
        
       if (cantNodos == 1 )     {
           vaciarLista();
       }else{
           //Borrar el primer nodi
           //borrar nodo intermedio
           //borrar el ultimo nodo
           if (pos == 0) {
               inicio=inicio.getSiguiente();
           }else{
             Nodo temp = inicio;
                int cont = 0;
                while(cont < (pos)){
                temp = temp.getSiguiente();
                 cont++;
                
            }  
                /*Nodo objSig = temp.getSiguiente();
                temp.setSiguiente(objSig.getSiguiente());
                Nodo objPrev = temp.getPrevio();
                temp.setSiguiente(objPrev.getPrevio());*/
                Nodo objPrev = temp.getPrevio();
                Nodo objSig = temp.getSiguiente();
                objPrev.setSiguiente(objSig);
                
                
                if (pos==(cantNodos -1)){
                    fin = objPrev;
                }else{
                    objSig.setPrevio(objPrev);
                }
           }
           this.cont--;
       }
            
            
            
        }
        
}
     
        public int obtenValorEn(int pos) throws Exception{  //Copiada directamente
                int cantNodos = tamaLista();
                int Valor = 0;
         if ( pos < 0)// posiciones negativas
            throw new Exception("No puede insertarse un nodo en una posicion negativa");
        else if (pos >= cantNodos )//posiciones mayores a la cantidad  de elementos
        throw new Exception(pos + " no es una possicion valida en la lista");
        else{
             Nodo temp = inicio;
                int cont = 0;
                while(cont < (pos)){
                temp = temp.getSiguiente();
                 cont++;
                
            } 
                Valor = temp.getValor();
                
        }
         return Valor;
    }
    
}
