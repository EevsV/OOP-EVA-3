/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_10_escritura_archivos_txt;

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
public class EVA3_10_ESCRITURA_ARCHIVOS_TXT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     String ruta = "C:\\archivos\\";
        try {
            writeUsingFiles(ruta, "Prueba de escritua de archivos usando Files");
            writeUsingFileWriter(ruta, "Prueba de escritura usando FileWriter");
            writeUsingBufferedWriter(ruta, "Prueba de escritura usando BufferedWriter");
        } catch (IOException ex) {
            Logger.getLogger(EVA3_10_ESCRITURA_ARCHIVOS_TXT.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    public static void writeUsingFiles(String ruta, String datos) throws IOException{
        Path path = Paths.get(ruta + "archivoFile.txt");
        Files.write(path, datos.getBytes());
    }
    
     public static void writeUsingFileWriter(String ruta, String datos) throws IOException{
        File file = new File(ruta + "archivoFileWriter.txt");
        FileWriter friter = new FileWriter(file);
        friter.write(datos);
        friter.close();
        
    }
     
     public static void writeUsingBufferedWriter(String ruta, String datos) throws IOException{
         Path path = Paths.get(ruta + "archivoBufferedWriter.txt");
         OutputStream out = Files.newOutputStream(path);
         OutputStreamWriter osWriter = new OutputStreamWriter(out);
         BufferedWriter buffWriter = new BufferedWriter(osWriter);
         for (int i = 0; i < 10; i++){
             buffWriter.write(datos);
         }
         buffWriter.close();
         osWriter.close();
    }
}
