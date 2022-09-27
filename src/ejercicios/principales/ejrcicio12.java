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
public class ejrcicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        String cadena;
       int longitud ;
       int correct=0; 
       int incorrect=0;
        do {
            System.out.println("Ingrese una frase");
            cadena=leer.nextLine();
            longitud=cadena.length();
         if (longitud<=5 && cadena.substring(0,1).equalsIgnoreCase("X") && cadena.substring(longitud-1).equalsIgnoreCase("o")) {
        correct=correct+1;        
            } else ;{
                incorrect=incorrect+1;
            }
            
            
        
            
        
      
    
            
        } while (! cadena.equalsIgnoreCase("&&&&&"));
 
        System.out.println("correcto"+correct);
        System.out.println("incorrecto"+incorrect);

   }
    }
    

