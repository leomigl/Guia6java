///Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
//3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
//dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
//se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
//que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
//la matriz M en la cual empieza el primer elemento de la submatriz P.
//Ejemplo:
//
//Como podemos observar nuestra submatriz P se encuentra en la matriz M en los índices:
//4,4 - 4,5 - 4,6 - 5,4 - 5,5 - 5,6 - 6,4 - 6,5 - 6,6.
package ejercicios.principales;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matrizm[][], matrizp[][];
        matrizm = new int[10][10];
        matrizp = new int[3][3];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizm[i][j] = (int) (Math.random() * 10);

            }

        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("" + matrizm[i][j] + " ");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizp[i][j] = leer.nextInt();

            }
        }
     
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("" + matrizp[i][j] + " "); 
            }
          System.out.println(" ");  
        }
        for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){
                if (matrizp[0][0]==matrizm[i][j] && matrizp[0][1]==matrizm[i][j+1] && matrizp[0][2]==matrizm[i][j+2]){
                    if (matrizp[1][0]==matrizm[i+1][j] && matrizp[1][1]==matrizm[i+1][j+1] && matrizp[1][2]==matrizm[i+1][j+2]){
                        if (matrizp[2][0]==matrizm[i+2][j] && matrizp[2][1]==matrizm[i+2][j+1] && matrizp[2][2]==matrizm[i+2][j+2]){
                            System.out.println("La matriz P está contenida dentro de la matriz M.");
                            System.out.println("El primer elemento empieza dentro de la fila " + i + ", columna " + j + "." );
                           
                        }else {System.out.println("La matriz P no se encuentra dentro de la matriz M");
                    }
                }
            }
        }

        }

}
     // TODO code application logic here
}   
    

