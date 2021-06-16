/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text.files;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristian Felix InnovaCode ESPE-DCCO
 */
public class TextFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        File file;
        FileWriter write;
        PrintWriter line;
        String name = "", age = "", id = "";
        file = new File("Person.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
                name = JOptionPane.showInputDialog(null, "Enter Name:"
                        , "Requesting Data" , 3);
                age = JOptionPane.showInputDialog(null, "Enter Age:"
                        , "Requesting Data" , 3);
                id = JOptionPane.showInputDialog(null, "Enter ID:"
                        , "Requesting Data" , 3);
                write = new FileWriter(file, true);
                line = new PrintWriter(write);

                line.println("Name: " + name);
                line.println("Age: " + age);
                line.println("ID: " + id);
                line.println("");
                line.close();
                write.close();

            } catch (IOException ex) {
                Logger.getLogger(TextFiles.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                name = JOptionPane.showInputDialog(null, "Enter Name:"
                        , "Requesting Data" , 3);
                id = JOptionPane.showInputDialog(null, "Enter Age:"
                        , "Requesting Data" , 3);
                age = JOptionPane.showInputDialog(null, "Enter ID:"
                        , "Requesting Data" , 3);
                write = new FileWriter(file, true);
                line = new PrintWriter(write);

                line.println("Name: " + name);
                line.println("Age: " + age);
                line.println("ID: " + id);
                line.println("");
                line.close();
                write.close();

            } catch (IOException ex) {
                Logger.getLogger(TextFiles.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}

//COPYRIGHT: MasterHeHeGar.yt