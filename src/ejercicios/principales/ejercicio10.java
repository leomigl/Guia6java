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
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor límete: ");
        int n1 = leer.nextInt(); 
        
        int suma = 0;
        do {
            System.out.println("Ingrese otro número:");
            int n2 = leer.nextInt(); 
            suma = suma + n2;
        } while(suma < n1);
        
        System.out.println("El valor de "+suma+" supero a "+n1);
        
    }

        // TODO code application logic here
    }
    
}
