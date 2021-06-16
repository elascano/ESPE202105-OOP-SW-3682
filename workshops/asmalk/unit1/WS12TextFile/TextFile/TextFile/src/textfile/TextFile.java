/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfile;
/**
 *
 * @author Asmal Kevin ESPE-DCCO
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class TextFile {
    public static void main (String[] args) {
        File file;
        FileWriter write;
        PrintWriter line;
        String name ="", dir="", email="";
        file = new File("usuario.txt");  //Preparar
        if (!file.exists()){
            try {
                file.createNewFile();
                name=JOptionPane.showInputDialog(null,"Write in name --->"+
                        "Request Data"+ 3);
                dir=JOptionPane.showInputDialog(null,"Write in Age --->"+
                        "Request Data"+ 3);
                email=JOptionPane.showInputDialog(null,"Write in Email --->"+
                        "Request Data"+ 3);
                write = new  FileWriter(file,true);
                line = new PrintWriter(write);
                //Escribir
                line.println(name);
                line.println(dir);
                line.println(email);
                line.close();
                write.close();
                
            } catch (IOException ex) {
                Logger.getLogger(TextFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
           try {
                name=JOptionPane.showInputDialog(null,"Write in name --->",
                        "Request Data", 3);
                dir=JOptionPane.showInputDialog(null,"Write in Age --->",
                        "Request Data", 3);
                email=JOptionPane.showInputDialog(null,"Write in Email --->",
                        "Request Data", 3);
                write = new  FileWriter(file,true);
                line = new PrintWriter(write);
                //Escribir
                line.println(name);
                line.println(dir);
                line.println(email);
                line.close();
                write.close();
                
            } catch (IOException ex) {
                Logger.getLogger(TextFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
