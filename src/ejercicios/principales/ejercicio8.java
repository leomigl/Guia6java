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
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        
        Scanner sc = new Scanner(System.in);

	System.out.print("Ingrese una frase: ");
	String frase = sc.nextLine();
        
        if (frase.length() == 8){ //Longitud de cadena
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
        
    }
    
}

        // TODO code application logic here
     

