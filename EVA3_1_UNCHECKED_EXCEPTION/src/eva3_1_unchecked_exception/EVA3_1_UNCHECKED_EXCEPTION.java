/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_1_unchecked_exception;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_1_UNCHECKED_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       int x = 5, y = 0;
        int resu = x / y;
        System.out.println("resultado: " + resu);
        
        Scanner input = new Scanner(System.in);
        System.out.println("numero");
        int nume = input.nextInt();
        System.out.println("el numero es " +nume);
        
        
        
        int[] arreglo = new int[5];
        arreglo [0] = 100;
        arreglo [1] = 200;
        arreglo [2] = 300;
        arreglo [3] = 400;
        arreglo [4] = 500;
        arreglo [5] = 600; // <-- ? 5 NO ES UN INDICE VALIDO,
                                    // EL ARREGLO VA DE 0 A 4
        
        Prueba objPrueba = null;
        System.out.println("valor de x = " + objPrueba.x);
    }
    
    
    
}
