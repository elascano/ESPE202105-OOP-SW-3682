/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfiles;

import ec.edu.espe.TextFiles.model.Person;
import java.io.IOException;
import java.io.FileWriter;
import static java.nio.file.Files.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Ariel Gonzalez InnovaCode ESPE-DCCO
 */
public class TextFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileWriter file = new FileWriter("C:/Users/LENOVO/OneDrive/Documentos/Ariel/People.txt");
        List<Person> list = new ArrayList<Person>();
        System.out.println("People list");
        System.out.print("Enter the number of people you want to add: ");
        Scanner enter = new Scanner(System.in);
        int numberOfPeople = enter.nextInt();
        for (int i = 0; i < numberOfPeople; i++){
            System.out.print("Enter the name of the " + "person " + (i+1) + ": ");
            String name = enter.next();
            enter.nextLine();
            System.out.print("Enter the id of the " + "person " + (i+1) + ": ");
            String id = enter.next();
            list.add(new Person(name, id));
            file.write("Name: " + name + " ID: " + id + "\n");
        }
        file.close();
    }
}
