/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class MyFileLibrary {
 
    public static void write(String data,File file) throws IOException{
        
        FileWriter writer;
    
        writer=new FileWriter(file,true);
        writer.write(data + "\n");
        writer.close();
    }
  
    public static void read(File file){
        String line;
        try {
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            while ((line = br.readLine()) != null){
                    System.out.println(line);
                }
                System.out.println("");
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MyFileLibrary.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MyFileLibrary.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
