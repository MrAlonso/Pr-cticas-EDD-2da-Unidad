/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alons
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    class Nodo{    
   private int iVal;
   private Nodo nIzq;
   private Nodo nDer;

        public int getiVal() {
            return iVal;
        }

        public void setiVal(int iVal) {
            this.iVal = iVal;
        }

        public Nodo getnIzq() {
            return nIzq;
        }

        public void setnIzq(Nodo nIzq) {
            this.nIzq = nIzq;
        }

        public Nodo getnDer() {
            return nDer;
        }

        public void setnDer(Nodo nDer) {
            this.nDer = nDer;
        }
   
    }
    class Arbol{
        private Nodo nRoot;
        public Arbol(){
        nRoot=null;
        }
        public Arbol(Nodo nNodo){
        nRoot=nNodo;
            }
    public void agregarNodo(Nodo nActual, Nodo nNodo) throws Exception{
        if(nRoot == null){
            nRoot = nNodo;
        }else{
        if(nNodo.getiVal() < nActual.getiVal()){//MENOR
            if(nActual.getnIzq() == null){
                nActual.setnIzq(nNodo);
            }else{
                
            }            
        }else{ //Valores Iguales (no aceptamos valores repetidos)
        throw new Exception("No se aceptan valores repetidos");
                
        }
        }
    }
    }
    
}

    
    

