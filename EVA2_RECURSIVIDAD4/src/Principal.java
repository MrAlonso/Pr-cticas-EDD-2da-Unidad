
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
        System.out.println("Escribe cadena ¨limpia¨");
        Scanner sLector = new Scanner(System.in);
        String Sig=sLector.nextLine();
        String res="";
        quitletrp(Sig,0,res);
        
    }
    public static void quitletrp (String txt, int Cont, String chec){
        if(Cont==0){
            quitletrp(txt, Cont+1, chec=chec+txt.charAt(Cont));
        }else{
            if(Cont==txt.length()-1){
            if(txt.charAt(Cont)!= txt.charAt(Cont-1)){
                chec= chec+ txt.charAt(Cont);
                System.out.println(chec);
            }else{
                System.out.println(chec);
            }
            }else{
            if(txt.charAt(Cont)!= txt.charAt(Cont-1)){
            quitletrp(txt, Cont+1, chec=chec +txt.charAt(Cont));
            }else{
                quitletrp(txt,Cont+1,chec);
            }
            }
        }
    }
}
