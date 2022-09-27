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
public class ejercio7hxm {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        String frase;
        
        {  System.out.println("ingrese una frase");
        frase=leer.nextLine();          
            
        } if (frase.equals("eurekea")){
         
            System.out.println("incorrecto!");
        }    
        else {
        System.out.println("Correcto!") ;
        }        
        }    
}


