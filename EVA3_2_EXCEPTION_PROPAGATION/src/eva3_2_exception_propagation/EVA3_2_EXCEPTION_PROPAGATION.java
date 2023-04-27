/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_2_exception_propagation;

/**
 *
 * @author invitado
 */
public class EVA3_2_EXCEPTION_PROPAGATION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("inicia Main");
        A();
        System.out.println("Termina Main");
    }
    
    public static void A(){
        System.out.println("inicia A");
        B();
        System.out.println("Termina A");
    }
    
    public static void B(){
        System.out.println("inicia B");
        C();
        System.out.println("Termina B");
    }
    
    
   public static void C(){
        System.out.println("inicia C");
        int x = 5, y = 0;
        int resu = x / y;
        System.out.println("Termina C");
    }
}
