
import java.util.Collections;
import java.util.LinkedList;

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
       LinkedList <String> llMiLista= new LinkedList();
        llMiLista.add("Hola");
        llMiLista.add(" ");
        llMiLista.add("Mundo");
        llMiLista.add(" ");
        llMiLista.add("Cruel");
        llMiLista.add(" ");
        llMiLista.add("Colections");
        for (String llMiLista1 : llMiLista) {
            System.out.println(llMiLista);
        }
        System.out.println("");
        Collections.sort(llMiLista);
        for (String llMiLista1 : llMiLista) {
            System.out.println(llMiLista1);
        }
    }
    
}
