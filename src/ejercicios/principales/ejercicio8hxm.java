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
public class ejercicio8hxm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        
        System.out.println("ingrese una frase");
        String frase = leer.nextLine();
        if (frase.length()==8) {
            System.out.println("correcto");
        }
        else {
            System.out.println("falso");
        }
    }
    
}
