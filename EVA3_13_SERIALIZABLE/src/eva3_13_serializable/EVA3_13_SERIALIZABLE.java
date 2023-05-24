/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_13_serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author invitado
 */
public class EVA3_13_SERIALIZABLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ruta = "C:\\archivos\\archivosObjetos.joe";
        Persona perso = new Persona("Juan", "Perez", 50);
        
        try {
            guardarObj(perso, ruta);
            // guardar objeto en archivo y leerlo
            Persona resu = leerObj(ruta);
            System.out.println("Nombre: " + resu.getNombre());
            System.out.println("Apellido: " + resu.getApellido());
            System.out.println("Edad: " + resu.getEdad());
        } catch (IOException ex) {
            Logger.getLogger(EVA3_13_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EVA3_13_SERIALIZABLE.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public static void guardarObj(Persona perso, String ruta) throws IOException{
        FileOutputStream fos = new FileOutputStream(ruta);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(perso);
        oos.close();
    }
    
    public static Persona leerObj(String ruta)throws IOException, ClassNotFoundException {
        Persona perso = null;
        FileInputStream fis = new FileInputStream(ruta);
        ObjectInputStream ois = new ObjectInputStream(fis);
        perso = (Persona)ois.readObject();
        return perso;
    }
    
}

class Persona implements Serializable{
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
        this.edad = 0;
        this.nombre = "";
        this.apellido = "";
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
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

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
}
