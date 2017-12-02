
import java.util.ArrayList;
import java.util.Iterator;

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
        ArrayList <Integer> alMiArrayList = new ArrayList();
        alMiArrayList.add(100);//0 Posiciones
        alMiArrayList.add(200);//1
        alMiArrayList.add(300);//2
        alMiArrayList.add(400);//3
        alMiArrayList.add(500);//4
        for (Integer alMiArrayList1 : alMiArrayList) {
            System.out.println(alMiArrayList +" - ");
        }
        System.out.println("");
        alMiArrayList.add(2, 959);
        System.out.println("\n Iterador");
        for (Integer alMiArrayList1 : alMiArrayList) {
            System.out.println(alMiArrayList +" - ");
        }
        //RECORRER UN COLECTION CON ITERADORES
        Iterator itRecorreArray = alMiArrayList.iterator();
        while(itRecorreArray.hasNext()){ //recorre a otro arreglo si hay
            System.out.print(itRecorreArray.next()+" - ");
        }
    }
        
}
