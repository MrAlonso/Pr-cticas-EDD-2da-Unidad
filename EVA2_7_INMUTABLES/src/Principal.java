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
        int[] aiDatos = new int[3];
        aiDatos[0]=100;
        aiDatos[1]=300;
        aiDatos[2]=400;
        
        int[] aiBackUp = new int[3];
        int i=0;
        for(int aiDato : aiDatos){ //for(int i=0 i< i <aiDatos.length; i++)
            System.out.println(aiDato);
            aiBackUp[i]= aiDato;
            i++;
        }
        aiDatos = new int[4];
        //
        for(int j=0; j< aiBackUp.length; j++){
            aiDatos[i]= aiBackUp[j];
        }
        for (int aiDato : aiDatos){
             System.out.println(aiDato);
        }    
    }
}
