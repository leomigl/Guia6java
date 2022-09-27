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
public class ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int[] nument=new int[101];
        for (int i = 1; i <= 100; i++) {
            nument[i]=i;
          
        }
             for (int i =100; i >= 1; i--) {
            System.out.println( nument[i]);
        }
   
    }
    
}
