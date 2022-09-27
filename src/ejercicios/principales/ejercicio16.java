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
public class ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        
        
        int cont=0;
        
        System.out.println("Ingrese un tamaño de vector");
        int n=leer.nextInt();
        int vector[]= new int[n];
        
        for (int i = 0; i < vector.length; i++) {
        vector[i] =(int)(Math.random()*10) ;
            
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
       
        System.out.println("ingrese un numero a buscar");
        int x=leer.nextInt();
        for (int i = 0; i < n; i++) {
           
           if (vector[i]==x){
            cont=cont+1;  }}
           // System.out.println(cont);
       
            
           if (cont >=1) {System.out.println("el numero esta repetido la cantidad de veces:" + cont );
                
           } else { System.out.println("el numero no esta contenido en el vector");
                
          
          
           
                   }

                
    }     
}       
           
 
           
       
        
    

    

