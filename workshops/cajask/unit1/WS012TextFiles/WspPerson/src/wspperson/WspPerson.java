/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wspperson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lizbeth Cajas
 */
public class WspPerson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        File file;//para manipular el  archivo
        FileWriter write;//escribir en el archivo
        PrintWriter line;//para escribir en el archivo
        String name = "", dir = "", email = "";
        file = new File("usuario.txt");//preprando el archivo
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
                //escribe en el archivo
                line.println(name);
                line.println(dir);
                line.println(email);
                write.close();

            } catch (IOException ex) {
                Logger.getLogger(WspPerson.class.getName()).log(Level.SEVERE, null, ex);
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
                //escribe en el archivo
                line.println(name);
                line.println(dir);
                line.println(email);
                write.close();

            } catch (IOException ex) {
                Logger.getLogger(WspPerson.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
