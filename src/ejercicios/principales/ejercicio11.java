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
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos número: ");
        int n1 = leer.nextInt();
        int n2 = leer.nextInt();
        String respuesta = "N";
        int opcion=0;
        do {
            System.out.println("MENU\n"
                    + "1. Sumar\n"
                    + "2. Restar\n"
                    + "3. Multiplicar\n"
                    + "4. Dividir\n"
                    + "5. Salir\n"
                    + "Elija opcion: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("SUMA = "+n1 + n2);
                    break;
                case 2:
                    System.out.println("RESTA = " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("MULTIPLICACION = "+n1 * n2);
                    break;
                case 4:
                    System.out.println("DIVISION

        // TODO code application logic here
    }
    
}
