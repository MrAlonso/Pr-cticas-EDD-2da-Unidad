
import java.util.Collections;
import java.util.Comparator;
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
        LinkedList <Persona> llPersonas = new LinkedList();
        llPersonas.add(new Persona("Alonso" ,"Hernandez", 35, true,1));
        llPersonas.add(new Persona("Juan" ,"Parra", 10, true,10000));
        llPersonas.add(new Persona("Manuel" ,"Soto", 7, true,1000000));
        llPersonas.add(new Persona("Guadalupe" ,"Simtu", 90, false,3523));
        llPersonas.add(new Persona("Lola" ,"PudduPudy", 13, false,1888));
        for (Persona llPersona : llPersonas) {
             System.out.println("Nombre: "+ llPersona.getsNom()+ "\n" +
                    "Apellido: "+llPersona.getApe()+ "\n" +
                    "Edad: " + llPersona.getiEd()+ "\n" +
                    "Sexo: " + llPersona.isbSex() + "\n"+
                    "Salario: "+ llPersona.getdSalario()+ "\n");
            
        }
        Comparator cmCriterioOrden = new Comparator(){ //clase anónima
            @Override
            public int compare(Object o1, Object o2) {
            Persona p1= (Persona) o1;
            Persona p2= (Persona) o2; 
            String sApe1, sApe2;
            sApe1= p1.getApe();
            sApe2= p2.getApe();
            char c1, c2;
            c1= sApe1.charAt(0); //ARREGLO
            c2= sApe2.charAt(0);
            return c1-c2;
            }   
        };
        System.out.println("");
        System.out.println("LISTA ORDENADA (Persona)");
        Collections.sort(llPersonas, cmCriterioOrden);
        for (Persona llPersona : llPersonas) {
             System.out.println("Nombre: "+ llPersona.getsNom()+ "\n" +
                    "Apellido: "+llPersona.getApe()+ "\n" +
                    "Edad: " + llPersona.getiEd()+ "\n" +
                    "Sexo: " + llPersona.isbSex() + "\n"+
                    "Salario: "+ llPersona.getdSalario()+ "\n");
     //ordenar por edad, salario, sexo, apellido, edad   
        }
        }
    
}
class Persona{
    private String sNom;
    private String Ape;
    private int iEd;
    private boolean bSex;
    private double dSalario;

    public Persona(String sNom, String Ape, int iEd, boolean bSex, double dSalario) {
        this.sNom = sNom;
        this.Ape = Ape;
        this.iEd = iEd;
        this.bSex = bSex;
        this.dSalario = dSalario;
    }

    public String getsNom() {
        return sNom;
    }

    public void setsNom(String sNom) {
        this.sNom = sNom;
    }

    public String getApe() {
        return Ape;
    }

    public void setApe(String Ape) {
        this.Ape = Ape;
    }

    public int getiEd() {
        return iEd;
    }

    public void setiEd(int iEd) {
        this.iEd = iEd;
    }

    public boolean isbSex() {
        return bSex;
    }

    public void setbSex(boolean bSex) {
        this.bSex = bSex;
    }

    public double getdSalario() {
        return dSalario;
    }

    public void setdSalario(double dSalario) {
        this.dSalario = dSalario;
    }
    
    
}
    
