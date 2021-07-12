/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bookstore.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alisson Caiza ASUS ESPE-DCCO
 */

        //String route = "C:\\Users\\steve\\Desktop\\BookstoreProyect\\06-Code\\Bookstore\\file\\jsonFile.txt";
        //String content = "i have write something";


public class Inventory {
   
    
    public static void writeArchive(String classProject){
        File archive;
        archive = new File("Products.txt");
            try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Products.txt",true))){
                bufferedWriter.write(classProject);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            } catch (Exception except) {
            System.out.println("The error is: " + except.getMessage());
            }
    }
    public static void readArchive(String nameFile){
        
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("Products.txt"))){
            String line;
            while((line=bufferedReader.readLine())!=null){
                line.concat(line + "\n");
                System.out.println(line);
            }
        } catch (Exception except) {
            System.out.println("Your mistake is: "+ except.getMessage());
        }
    }
}