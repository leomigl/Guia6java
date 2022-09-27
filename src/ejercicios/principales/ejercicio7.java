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
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese una frase");
        frase=leer.next();
        if (frase.equals("eureka") ){
            System.out.println("La frase es correcta");
            
        }else
            System.out.println("Frase incorrecta");

        // TODO code application logic here
    }
    
}
