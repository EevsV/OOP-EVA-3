/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_7_throw_exception;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author invitado
 */
public class EVA3_7_THROW_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*try {
            Prueba p = new Prueba();
            p.setValor(-1);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    } */
    
        
}

class Prueba{
    private int valor;
    
    

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) throws Exception {
        if (valor < 0){
            throw new Exception("El valor " + valor + " es invalido, debe ser mayor o igual a cero");
        }
        this.valor = valor;
    }
    
    
}