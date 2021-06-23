/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.library.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.library.model.Book;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ariel Gonzalez InnovaCode ESPE-DCCO
 */
public class Library {
    public static void main(String[] args) throws IOException {
    String title;
    String author;
    String publisher;
    int yearOfPublication;
    int option = 0;
    GsonBuilder gsonBuilder = new GsonBuilder();
    Gson gson = gsonBuilder.create();
    String jsonCellphone;
    Scanner scan = new Scanner(System.in);
    ArrayList<Book> books = new ArrayList<>();
    
    //Reference taken from Cecilia Avila.
    do{
            System.out.println("Option menu");
            System.out.println("[1] Add a book.");
            System.out.println("[2] Show the books.");
            System.out.println("[3] Exit.");
            System.out.println("Select an option: ");
            option = scan.nextInt();
            scan.nextLine();
            
            switch (option){
                case 1:
                    System.out.println("    Creating a new cellphone.");
                    System.out.println("Add the title: ");
                    title = scan.nextLine();                   
                    System.out.println("Insert the author: ");
                    author = scan.nextLine();
                    System.out.println("Insert the publisher: ");
                    publisher = scan.nextLine();
                    System.out.println("Insert the year of publication: ");
                    yearOfPublication = scan.nextInt();
                    
                    Book book = new Book(title, author, publisher, yearOfPublication);
                    System.out.println("Added. \n");
                    books.add(book);
                case 2:
                    for(int i = 0; i < books.size(); i++){
                        System.out.println("Title: " + books.get(i).getTitle() + "\n");
                    }
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    break;
                default:
                        System.out.println("That option does not exist.");    
            }
        }while(option != 3);
    
    gson = new GsonBuilder().setPrettyPrinting().create();
        try (Writer writer = new FileWriter("Books.json")) {
             writer.write(gson.toJson(books));
        }
    }
}
