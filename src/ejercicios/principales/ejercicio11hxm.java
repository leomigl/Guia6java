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
public class ejercicio11hxm {
    

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int numopcion,num1,num2, suma, resta,mult,divis=0;
        
        System.out.println("Ingrese dos numeros entreos positivos");
        num1=leer.nextInt();
        num2=leer.nextInt();
        String respuesta;
        
        System.out.print("MENU"
                + " 1.Sumar"
                + " 2.Restar"
                + " 3.Multiplicar"
                + " 4.Dividir"
                + " 5.Salir");
        System.out.println("");
          System.out.print(" elija Opcion");   
          numopcion=leer.nextInt();
        switch (numopcion) {
                case 1: suma=num1+num2;{
                    System.out.println("la suma es "+suma);}
                    break;
                case 2: if (num1>=num2);{
                    resta=num1-num2;
                    System.out.println("la resta es "+resta);
                }       
                        if (num2>=num1); {
                    resta=num2-num1;
                    System.out.println("la resta es "+ resta);
                }
                        break;
                case 3: mult=num1*num2;{
                    System.out.println("la multiplicaciòn es "+mult);}
                    break;
                case 4: divis=num1/num2;
                {System.out.println("la division es "+divis);}
                    break;
                case 5: {System.out.println("¿esta seguro que desea salir?");
                
                do{
                respuesta=leer.nextLine();
                }
                
                 while (respuesta.equals("n"));}
                break;
                }
                }
        
                     
                    
              
 
                
                    
                
        // TODO code application logic here
    }
    
}
