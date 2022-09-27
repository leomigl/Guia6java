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
public class ejercicio10hxm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
          System.out.println("Ingrese un valor limite positivo");
        int vl=leer.nextInt();
        int sum=0;
        do{
        System.out.println("Ingrese un numero");
        int num=leer.nextInt();
        sum=sum+num;           
            
        } while (sum<=vl);
    
               
            System.out.println("la sumas han superado el numero limite positivo");   
        }
    }        // TODO code application logic here


