/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bookstore.view;

import ec.edu.espe.bookstore.model.Book;
import java.util.ArrayList;

/**
 *
 * @author Asmal Kevin ESPE-DCCO
 */
public class ArrayListBookStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numberOfPage;
        String material;
        String color;
        String editorial;
        String autor;
        ArrayList<Book> books = new ArrayList<>();
        Book booksArray[] = new Book[5];
        
        //Input by Keyboard
        numberOfPage = 356;
        material = "paper and leather";
        color = "Brown";
        editorial = "JavaScript";
        autor = "Steven Achig";
        
        
        Book book = new Book();
        System.out.println("book object ->" + book);
        
        book = new Book(color, material, editorial, autor, numberOfPage);
        System.out.println("book object ->" + book);
        
        Book book2 = new Book("red", "paper and paperboard", "ANDARELE", "Juan Sanchez", 400);
                
        books.add(book);
        books.add(book2);
        
        System.out.println("books ->" + books);
        
        booksArray[0] = book;
        System.out.println("bookArray -> " + booksArray[0]);
    }
    
}
