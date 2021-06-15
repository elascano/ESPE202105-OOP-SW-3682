/*
https://www.youtube.com/watch?v=zcV4lX1PoI4&ab_channel=MasterHeHeGarMasterHeHeGar. Utilizado con fines didacticos
 */
package ws12textfiles;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Steven Achig FutureProgrammers ESPE-DCCO
 */
public class WS12TextFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File archive;
        FileWriter write;
        PrintWriter line;
        String name = "", numberPhone = "", id = "";
        archive = new File("Persons.txt");
        if (!archive.exists()) {
            try {
                archive.createNewFile();
                name = JOptionPane.showInputDialog( "Enter your Name: "
                        + "Charge..." + 3);
                numberPhone = JOptionPane.showInputDialog( "Enter your number of phone: "
                        + "Charge..." + 3);
                id = JOptionPane.showInputDialog( "Enter your ID: "
                        + "Charge..." + 3);
                write = new FileWriter(archive, true);
                line = new PrintWriter(write);
                line.println(name);
                line.println(numberPhone);
                line.println(id);
                line.close();
                write.close();
            } catch (IOException ex) {
                Logger.getLogger(WS12TextFiles.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {

                name = JOptionPane.showInputDialog(null, "Enter your Name: ");
                numberPhone = JOptionPane.showInputDialog(null, "Enter your number of phone: ");
                id = JOptionPane.showInputDialog(null, "Enter your ID: ");
                write = new FileWriter(archive, true);
                line = new PrintWriter(write);
                line.println(name);
                line.println(numberPhone);
                line.println(id);
                line.close();
                write.close();
            } catch (IOException ex) {
                Logger.getLogger(WS12TextFiles.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}