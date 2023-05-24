/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_12_append_text;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author invitado
 */
public class EVA3_12_APPEND_TEXT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             String ruta = "C:\\archivos\\";
        try {
            writeUsingBufferedWriter(ruta, "append");
        } catch (IOException ex) {
            Logger.getLogger(EVA3_12_APPEND_TEXT.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public static void writeUsingBufferedWriter(String ruta, String datos) throws IOException{
         File file = new File(ruta + "archivoBufferedWriter.txt");
         FileWriter fw = new FileWriter(file, true);
         BufferedWriter buffWriter = new BufferedWriter(fw);
         for (int i = 0; i < 10; i++){
             buffWriter.write(i + " " + datos);
             buffWriter.write("\n");
         }
         buffWriter.close();
    }
    
}
