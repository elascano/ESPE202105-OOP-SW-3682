/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatextfiles;

import ec.edu.espe.Constructor.Persons.Person;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class JavaTextFiles {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        try{
            Person person;
            FileWriter textfile;
            String name;
            int age;
            int id;
       
            textfile = new FileWriter("C:\\Users\\P C\\Documents\\NetBeansProjects\\TextFile.txt", true);
            Scanner scanner = new Scanner(System.in);
     
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
            System.out.println("Enter your age: ");
            age = scanner.nextInt();            
            System.out.println("Enter your id: ");
            id = scanner.nextInt();
            
            
            person = new Person(name, age, id);

            textfile.write("Name => " + name + "\n");
            textfile.write("Age => " + age + "\n");
            textfile.write("ID => " + id + "\n");

            textfile.close();
            
        }catch (IOException ex){
            Logger.getLogger(JavaTextFiles.class.getName()).log(Level.SEVERE,null,ex);
        } 
    }
}
