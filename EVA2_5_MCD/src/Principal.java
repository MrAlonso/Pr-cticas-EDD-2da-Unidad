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
     int iDendo = 180;   
        int iDsor = 48;
        System.out.println("El mcd de " + iDendo + ", " + iDsor+ " es "
                + calcularMCD(iDendo, iDsor));
    } 
    public static int calcularMCD(int iDend,int iDsor){
     if(iDsor==0){
         return iDend;
     }else{
         int iResi;
         iResi= iDend % iDsor;
         return calcularMCD(iDsor, iResi);
     }   
    }
}
 

