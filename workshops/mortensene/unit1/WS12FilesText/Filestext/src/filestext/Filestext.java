/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filestext;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 * @author pc
 */
public class Filestext {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        try {
            String root = "C:\\Users\\pc\\OneDrive\\Escritorio\\semestremayo21septiembre21\\ESPE202105-OOP-SW-3682\\workshops\\mortensene\\unit1\\WS12FilesText\\helloworld.txt";
            String content = "Contenido de ejemplo";
            File file = new File(root);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        
        }
        try {
            PrintWriter writer = new PrintWriter("C:\\Users\\pc\\OneDrive\\Escritorio\\semestremayo21septiembre21\\ESPE202105-OOP-SW-3682\\workshops\\mortensene\\unit1\\WS12FilesText\\helloworld.txt");
            writer.println("save person one");
            writer.println("save person two or more");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }

    
    

