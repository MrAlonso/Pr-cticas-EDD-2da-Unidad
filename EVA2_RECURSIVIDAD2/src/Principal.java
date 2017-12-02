
import java.util.Scanner;

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
        System.out.println("Eliminador de x de texto");
        Scanner sLector = new Scanner(System.in);
        String texto = sLector.next();
        String valor = "";
        rFresa(texto, 0, valor);
    }

    public static void rFresa(String cad, int cant, String res) {
        if (cant == cad.length() - 1) {
            if (cad.charAt(cant) != 'x') {
                res = res + cad.charAt(cant);
                System.out.println(res);
            } else {
                System.out.println(res);
            }
        } else {
            if (cad.charAt(cant) != 'x') {
                rFresa(cad, cant + 1, res = res + cad.charAt(cant));
            } else {
                rFresa(cad, cant + 1, res);
            }
        }
    }
}
