
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num= leer.nextInt();
        int doble,triple;
        double r2=leer.nextDouble();
        double raiz;
        doble=num*2;
        triple=num*3;
        raiz= Math.sqrt(r2);
        System.out.println("el doble es "+ doble);
        System.out.println("el triple es "+ triple);
        System.out.println("la raiz cuadrada es "+ raiz);
        

    }
    
}
