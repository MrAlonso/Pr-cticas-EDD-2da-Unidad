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
        System.out.println("El resultado es: " + pRecu(3, 3));
    }

    public static int pRecu(int base, int n) {
        if (n == 0) {
            return 1;
        } else {
            return base * pRecu(base, n - 1);
        }
    }
}
