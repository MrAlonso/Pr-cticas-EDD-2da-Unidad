/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alonso Parra
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaDE ldeMiLista = new ListaDE();
        ldeMiLista.imprimirElementos();
        ldeMiLista.imprimirElementosInv();
        for (int i = 0; i < 10; i++) {
            ldeMiLista.agregarNodo(new Nodo(int)(Math.random()*100)+1));
        }
        System.out.println("");
        ldeMiLista.imprimirElementos();
        System.out.println("");
        ldeMiLista.imprimirElementosInv;
    }
    
}

class Nodo{
    private int iVal;
    private Nodo nPrev;
    private Nodo nSig;
    private Nodo(){
       iVal=0;
       nPrev=null;
       nSig=null;
    }
    public Nodo(int iNum){
        iVal=iNum;
        nPrev=null;
        nSig=null;
    }
class ListaDE{
    Nodo nIni;
    Nodo nFin;
    public ListaDE(){
        nIni=null;
        nFin=null;
    }
    public ListaDE(Nodo nNodo){
        nIni=nNodo;
        nFin=nNodo;
    }
    public void agregarNodo(Nodo nNodo){ // Agregar un nodo al final de la lista
        if(nIni==null){
            nIni=nNodo;
            nFin=nNodo;
        }else{
            nFin.setnSig(nNodo);
            nNodo.setnPrev(nFin);
            nFin= nNodo;
        }
    }
    public void imprimirElementos(){
        Nodo nTemp=nIni;
        while(nTemp != null){
            System.out.println(nTemp.getiVal()+ " - ");
            nTemp= nTemp.getnSig();
            
        }
        public void imprimirElementosInv(){
        Nodo nTemp=nFin;
        while(nTemp != null){
            System.out.println(nTemp.getiVal()+ " - ");
            nTemp= nTemp.getnPrev();
    }
}
}
}
