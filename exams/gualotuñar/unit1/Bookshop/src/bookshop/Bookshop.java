/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookshop;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gualotuña Richard INNOVA CODE
 */
public class Bookshop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         File file;
        FileWriter write;
        PrintWriter line;
        String title = "",author = "", publisher = "";
        file = new File("Book.txt");
        
        if (!file.exists()){
            try {
                file.createNewFile();
                title = JOptionPane.showInputDialog(null, "Write in title:    "
                       + "Requesting Date" + 3);
                author = JOptionPane.showInputDialog(null, "Write in author:    "
                       + "Requesting Date" + 3);
                publisher = JOptionPane.showInputDialog(null, "Write in publisher:"
                        + "Requesting Date" + 3);
                String YearOfPublication;
                YearOfPublication = JOptionPane.showInputDialog(null, "Write in YearOfPublication;"
                        + "Requesting Date" + 3);
                
                write = new FileWriter(file, true);
                line = new PrintWriter(write);
                
                
                
                line.println(title);
                line.println(author);
                line.println(publisher);
                line.println(YearOfPublication);
                write.close();

            }catch (IOException ex) {
                Logger.getLogger(Bookshop.class.getName()).log(Level.SEVERE, null, ex);
            
            }        
        }
     
    }
    
}


