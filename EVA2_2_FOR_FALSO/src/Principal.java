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
        //Imprimir los numeros del 5 al 1
        for (int i = 5; i < 1; i--) {
            System.out.println("i = "+ i);
            
        }
        falsoFor(5);
        falsoForUp(1,5);
    }
    public static void falsoFor(int iVal){
        System.out.print(iVal+  " - "); //Accion
        if(iVal > 1)   //Condicion para terminar la recursion
        falsoFor(iVal - 1); //Llamada recursiva
    }
    public static void falsoForUp(int iIni, int iFin){
        System.out.print(iIni + "-");
        if(iIni < iFin)
            falsoForUp(iIni + 1, iFin);
    }
}
