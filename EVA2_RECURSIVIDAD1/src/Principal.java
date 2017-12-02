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
        System.out.println("La suma de 1+2+3+4+5 es: " + mRecu(12345));
    }

    public static int mRecu(int iVal) {
        if (iVal % 10 == 0) {
            return 0;
        } else {
            return ((iVal % 10 + mRecu(iVal / 10)));
        }
    }
}
