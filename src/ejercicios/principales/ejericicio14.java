/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.principales;

import java.util.Scanner;
/**
 *
 * @author PC
 */
public class ejericicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String moneda;
        do {            
            System.out.println("Introduzca una moneda a convertir(dolar,yen o libra)");
         String dolar,yen,libra;
        moneda=leer.nextLine();
            
            
        } while (! (moneda.equalsIgnoreCase("dolar")  ||  moneda.equalsIgnoreCase("yen") ||  moneda.equalsIgnoreCase("libra")));
        
        
        euros(moneda);
                 
    }
 public static void  euros (String moneda ) {
     Scanner leer=new Scanner(System.in);
     double euro,c;
     
             
     System.out.println("ingrese la cantidad de moneda");
     c= leer.nextInt(); 
     switch(moneda){
         case "dolar": 
               euro = c* 1.28611 ;
         System.out.println("la cantidad de euros es "+euro);
         break;
         case "yen": 
             euro= c* 129582 ;
             System.out.println("la cantidad de euros es "+euro);
             break;
         case "libra":
             euro= c* 0.86 ;
             System.out.println("la cantidad de euros es "+euro);
       break;
       }
             
 }   
}
