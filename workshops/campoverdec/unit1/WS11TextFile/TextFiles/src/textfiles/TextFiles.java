/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfiles;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos Campoverde EMCL:java
 */
public class TextFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        try{
                      FileWriter fw = new FileWriter ("C:\\Users\\Carlos\\Desktop\\espe\\poo\\POO\\ESPE202105-OOP-SW-3682\\workshops\\campoverdec\\unit1\\WS11TextFile\\people.txt", true);  
        
        
        Scanner person = new Scanner(System.in);
        System.out.println("\nEnter your name:  ");
        String name = person.nextLine();
        System.out.println("\nEnter your id:   ");
        int id = person.nextInt();
        System.out.println("\nEnter your age: ");
        int age = person.nextInt();
        
        
        System.out.println("Name -> "+ name);
        System.out.println("Age -> "+ age);
        System.out.println("Id -> "+ id);
        
        fw.write("\nName -> "+ name);
        fw.write("\nAge -> "+ age);
        fw.write("\nSex -> "+ id);
        fw.close();
        }catch (IOException ex){
            Logger.getLogger(TextFiles.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    }
    
}
