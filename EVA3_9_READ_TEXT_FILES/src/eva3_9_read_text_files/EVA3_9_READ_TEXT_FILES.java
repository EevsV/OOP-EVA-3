/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_9_read_text_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author invitado
 */
public class EVA3_9_READ_TEXT_FILES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ruta = "c:\\archivos\\prueba.txt";
        try {
            readUsingFiles(ruta);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
   public static void readUsingFiles(String ruta) throws IOException{
        Path path = Paths.get(ruta);
        List<String> fuck = Files.readAllLines(path);
        System.out.println(fuck.toString());
    }   
}

