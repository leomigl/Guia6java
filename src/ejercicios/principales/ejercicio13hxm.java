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
public class ejercicio13hxm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese un numero de elementos");
        int N=leer.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.print("* ");}
            System.out.println("");
        for (int i = 1; i < N-1; i++) {
            System.out.print("* ");
             for (int j = 1; j <= N; j++) { 
                 System.out.println("");     
             }
            System.out.println("* ");
        }
        
       for (int i = 1; i <= N; i++) {
         System.out.print("* ");}
        System.out.println("");
    }
        
       
   
    
        
        }    // TODO code application logic here
    
    

