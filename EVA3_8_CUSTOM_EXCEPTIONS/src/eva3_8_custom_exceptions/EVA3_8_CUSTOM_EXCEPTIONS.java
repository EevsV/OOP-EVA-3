/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_8_custom_exceptions;

/**
 *
 * @author invitado
 */
public class EVA3_8_CUSTOM_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona perso = new Persona();
        perso.setNombre("Bean");
        perso.setApellido("Er");
        try{
            perso.setEdad(-5);
        }
        catch(DatoIncorrectoCheckedException e){
            System.out.println("Se produjo un error: " + e.getMessage());
        }
    }
    
}


class Persona{
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
        this.nombre = "--";
        this.edad = 0;
        this.apellido = "--";
    }

    public Persona(String nombre, String apellido, int edad) throws DatoIncorrectoCheckedException {
        this.nombre = nombre;
        this.apellido = apellido;
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws DatoIncorrectoCheckedException {
        if (edad < 0)
            // throw new DatoIncorrectoException(); UNCHECKED
            throw new DatoIncorrectoCheckedException();
        this.edad = edad;
    }
    
    
}


class DatoIncorrectoException extends RuntimeException{

    public DatoIncorrectoException() {
        super("Dato Incorrecto, El valor introducido no puede ser negativo");
    }
    
}

class DatoIncorrectoCheckedException extends Exception {

    public DatoIncorrectoCheckedException() {
        super("Dato Incorrecto, el valor introducido no puede se negativo");
    }
       
    
}