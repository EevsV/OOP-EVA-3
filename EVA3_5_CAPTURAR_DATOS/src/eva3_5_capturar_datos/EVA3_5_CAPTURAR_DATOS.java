/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_5_capturar_datos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_5_CAPTURAR_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor = 0;
        do{
            try{
                Scanner input = new Scanner(System.in);
                System.out.println("Introduce un valor (numero entero)");
                valor = input.nextInt();
                break;
            }
            catch(InputMismatchException e){
                System.out.println("El valor capturado es invalido, por favor ingrse un numero entero.");
            }
        }
        while(true);
        
        System.out.println("El valor capturado es: " + valor);
    }
    
}
