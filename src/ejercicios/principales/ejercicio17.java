/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.principales;
import java.util.Scanner;
import javafx.beans.binding.Bindings;
/**
 *
 * @author PC
 */
public class ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        int cont1=0;
        int cont2=0;
        int cont3=0;
        int cont4=0;
        int cont5=0;
        System.out.println("ingrese un tamaño de vector ");
        int n=leer.nextInt();
        int vector[]=new int[n];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese valores del vector"+vector[i]+": ");
            vector[i]=leer.nextInt();
           // System.out.println(vector[i]);
        }
       for (int i = 0; i <n; i++) {
            
        
        if (vector[i]<10) {cont1++ ;
            
        } else if (vector[i]<100) {cont2++;
        } else if (vector[i]<1000) {cont3++;
         } else if (vector[i]<10000) {cont4++;
        } else if (vector[i]<100000) {cont5++;
        }
   }
        
       // TODO code application logic here
        System.out.println("la cantidad de numeros de 1 digito es: "+cont1) ;
        System.out.println("la cantidad de numeros de 2 digito es: "+cont2);
        System.out.println("la cantidad de numeros de 3 digito es: "+cont3);
        System.out.println("la cantidad de numeros de 4 digito es: "+cont4);
        System.out.println("la cantidad de numeros de 5 digito es: "+cont5);
  
    }   
}

   

