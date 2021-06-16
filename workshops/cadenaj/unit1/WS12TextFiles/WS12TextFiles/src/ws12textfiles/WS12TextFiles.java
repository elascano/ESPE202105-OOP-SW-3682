/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws12textfiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
        
/**
 *
 * @author jejoc
 */
public class WS12TextFiles {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) {
        
        File file;
        FileWriter write;
        PrintWriter line;
        String name = "";
        String dir = ""; 
        String email = "";
        
        file = new File("Usuario.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
                name = JOptionPane.showInputDialog(null, "Write in name:      "
                        + "Requesting Date" + 3);
                dir = JOptionPane.showInputDialog(null, "Write in age:        "
                        + "Requesting Date" + 3);
                email = JOptionPane.showInputDialog(null, "Write in email:    "
                        + "Requesting Date" + 3);
                write = new FileWriter(file, true);
                line = new PrintWriter(write);
                //escritura del archivo
                line.println(name);
                line.println(dir);
                line.println(email);
                write.close();

            } catch (IOException ex) {
                Logger.getLogger(WS12TextFiles.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            try {

                name = JOptionPane.showInputDialog(null, "Write in name:      "
                        + "Requesting Date" , 3);
                dir = JOptionPane.showInputDialog(null, "Write in age:        "
                        + "Requesting Date" , 3);
                email = JOptionPane.showInputDialog(null, "Write in email:    "
                        + "Requesting Date" , 3);
                write = new FileWriter(file, true);
                line = new PrintWriter(write);
                //escritura del archivo
                line.println(name);
                line.println(dir);
                line.println(email);
                write.close();

            } catch (IOException ex) {
                Logger.getLogger(WS12TextFiles.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
    

