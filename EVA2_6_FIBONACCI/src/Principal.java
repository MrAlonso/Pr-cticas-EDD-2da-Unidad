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
        System.out.println("Fibo de 9 = "+ generaFibo(9));
        for (int i = 0; i < 10; i++) {
            System.out.print(generaFibo(i)+ "-");
            
        }
    }
    public static int generaFibo(int iPos){
      //Método con if
        /* if(iPos==0)
            return 0;
        else if(iPos==1)
            return 1;
        else
            return generaFibo(iPos -1) + generaFibo(iPos-2);
*/
        //Método con switch
    switch(iPos){
        case 0:
        return 0;
        case 1:
            return 1;
        default:
            return generaFibo(iPos -1) + generaFibo(iPos-2);
    }
    
    }
}
