/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam.view;

import ec.edu.espe.exam.model.Book;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;

/**
 *
 * @author Myckel Chamorro EMCL.java ESPE-DCCO
 */
public class LibrarySim {

    public static void main(String[] args) throws IOException {
        int selectOption=0;
        int option = 0;
        String title;
        String author;
        String editorial;
        int year;
        File document;
        FileWriter write;
        PrintWriter line;
        String op = "";
        Scanner keyboardinput = new Scanner(System.in);
        System.out.println("\t\t\tLibrary online");
        System.out.println("1.- Insert book");
        System.out.println("2.- Read books");
        System.out.println("3._ Exit\n");
        System.out.println("Select an option : ");
        selectOption = keyboardinput.nextInt();

        switch (selectOption) {
            case 1:
                System.out.println("Text Files by Myckel Chamorro");
                System.out.println("Insert Title-->");
                title = keyboardinput.next();
                System.out.println("Insert author-->");
                author = keyboardinput.next();
                System.out.println("Insert editorial-->");
                editorial = keyboardinput.next();
                System.out.println("Insert year-->");
                year = keyboardinput.nextInt();

                Book book = new Book(title, author, editorial, year);

                document = new File("books.json");
                JSONObject jsonBook = new JSONObject();
                jsonBook.put("title", book.getTitle());
                jsonBook.put("author", book.getAuthor());
                jsonBook.put("editorial", book.getEditorial());
                jsonBook.put("year", book.getYear());
               

                JSONObject bookData = new JSONObject();
                bookData.put("book", jsonBook);

                if (!document.exists()) {
                   

                        document.createNewFile();
                        write = new FileWriter(document, true);
                        line = new PrintWriter(write);

                        write.write(bookData.toString());

                        line.close();
                        write.close();

                   
                        
                    }

                 else {

                   
                        write = new FileWriter(document, true);
                        line = new PrintWriter(write);
                        write.write(bookData.toString());
                        line.close();
                        write.close();
                    
                        
                    }

                
                break;
            case 2:

              
                break;

            case 3:
                selectOption = 5;

                break;

        }while (selectOption == 3 || selectOption == 1 || selectOption == 2);
    }
    }
    
