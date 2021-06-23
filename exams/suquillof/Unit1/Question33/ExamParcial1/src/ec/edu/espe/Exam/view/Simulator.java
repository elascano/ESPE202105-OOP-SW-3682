/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Exam.view;

import com.google.gson.*;
import ec.edu.espe.Exam.model.Book;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class Simulator {
    
    public static void main(String[] args) throws IOException {
        
    String bookTitle;
    String bookAuthor;
    String bookEditorial;
    int publicationYear; 
    int selectedOption;
    int booksnumber = 0;
    String jsonExam;
    File fileJson; 
    FileWriter writer;
    
    Scanner scanner = new Scanner(System.in);
    ArrayList<Book> bookslist = new ArrayList<>();
    GsonBuilder gsonBuilder = new GsonBuilder();
    Gson gson = gsonBuilder.create();
    fileJson = new File("BooksJson.json");
    writer = new FileWriter(fileJson,true);
    
        System.out.println("Json Files Nicolas Suquillo \n");    
    
    do{
        System.out.println("\t\t\t Exam 1 Parcial 1 BOOKS");
        System.out.println("1.- Insert Json");
        System.out.println("2.- Read Json");
        System.out.println("3._ Exit\n");
        System.out.println("Select an option : ");
        selectedOption = scanner.nextInt();
            while(selectedOption<1 || selectedOption>3){
                System.out.println("Error, Choose a correct option : ");
                selectedOption = scanner.nextInt();
            }
        switch(selectedOption){
            case 1:
                System.out.println("Enter the Title: ");
                bookTitle= scanner.next();
                System.out.println("Enter the Author: ");
                bookAuthor= scanner.next();
                System.out.println("Enter the Editorial: ");
                bookEditorial= scanner.next();
                System.out.println("Enter the publication year: ");
                publicationYear = scanner.nextInt();
                Book book = new Book();
                book.setTitle(bookTitle);
                book.setAuthor(bookAuthor);
                book.setEditorial(bookEditorial);
                book.setPublicationYear(publicationYear);
                bookslist.add(book);
                jsonExam = gson.toJson(book);
                writer.write("Book -> " + jsonExam + "\n");
                ++booksnumber;
            break;
            case 2:
                for (int i=0;i<bookslist.size();i++){
                    System.out.println("Book " + (i+1) + bookslist.get(i).toString());
                }
                System.out.println("Number of Books: " + booksnumber);
            break;
            case 3:
            writer.close();
            break;
        }    
    }while(selectedOption!=3);  
    
    }
}
