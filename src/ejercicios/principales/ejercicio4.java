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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.print("escriba la cantidad de grados centigrados 2");
        int gc = leer.nextInt();
        int gf;
        gf=32+(9*gc/5);
        System.out.println("la cantidad de grados Fuarenheit es "+gf );
        
    }
    
}
