/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saveintxt;

import ec.edu.espe.savetxt.model.Person;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Myckel Chamorro EMCL.java ESPE-DCCO
 */
public class SaveinTxt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        File document;
        FileWriter write;
        PrintWriter line;
        Person person;
        String name;
        int age;
        String email;

        Scanner keyboardinput = new Scanner(System.in);
        System.out.println("Text Files by Myckel Chamorro");
        System.out.println("Insert name-->");
        name = keyboardinput.next();
        System.out.println("Insert age-->");
        age = keyboardinput.nextInt();
        System.out.println("Insert email-->");
        email = keyboardinput.next();

        person = new Person(name, age, email);

        document = new File("Persons.txt");
        if (!document.exists()) {
            try {
                document.createNewFile();
                write = new FileWriter(document, true);
                line = new PrintWriter(write);

                line.println(person.getName());
                line.println(person.getAge());
                line.println(person.getEmail());

                line.close();
                write.close();

            } catch (IOException ex) {
                Logger.getLogger(SaveinTxt.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            write = new FileWriter(document, true);
            line = new PrintWriter(write);

            line.println(person.getName());
            line.println(person.getAge());
            line.println(person.getEmail());

            line.close();
            write.close();
        }
    }

}
