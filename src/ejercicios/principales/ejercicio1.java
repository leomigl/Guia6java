/*
  Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
  dos. El programa deberá después mostrar el resultado de la suma
package ejercicios.principales;

*/
 import java.util.Scanner;
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int num1,num2, suma;
        System.out.println("ingrese dos numeros");
        num1=leer.nextInt();
        num2=leer.nextInt();
        suma=num1+num2;
        System.out.println("la suma es "+ suma);
        
        // TODO code application logic here
    }
    
}
