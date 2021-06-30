/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import ec.edu.espe.books.model.Books.book;
import java.util.Scanner;


/**
 *
 * @author Sebastian Solano NullPunters ESPE-DCCO
 */
public class Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String title, author;
        int instances;

        
        Book book1 = new book ("Don Quixote", "Cervantes", 1, 0);
        Book book2 = new book ();

        System.out.print ("Enter title:");
        title = sc.nextLine ();
        System.out.print ("Enter author:");
        author = sc.nextLine ();
        System.out.print ("Number of copies:");
        instances = sc.nextInt ();

        book2.setTitulo (title);
        book2.setAutor (author);

        System.out.println ("Book 1:");
        System.out.println ("Title:" + book1.getTitle ());
        System.out.println ("Author:" + book1.getAutor ());
        System.out.println ("Items:" + book1.getExamples ());
        System.out.println ();

        if (book1.loan ()) {
            System.out.println ("The book has been checked out" + book1.getTitle ());
        } else {
            System.out.println ("There are no copies of the book" + book1.getTitle () + "to lend");
        }

        if (book1.devolution ()) {
            System.out.println ("The book has been returned" + book1.getTitle ());
        } else {
            System.out.println ("There are no copies of the book" + book1.getTitle () + "borrowed");
        }

        if (book1.loan ()) {
            System.out.println ("The book has been checked out" + book1.getTitle ());
        } else {
            System.out.println ("There are no copies of the book" + book1.getTitle () + "to lend");
        }

        if (book1.loan ()) {
            System.out.println ("The book has been checked out" + book1.getTitle ());
        } else {
            System.out.println ("There are no copies of the book" + book1.getTitle () + "to lend");
        }

        System.out.println ("Book 1:");
        System.out.println ("Title:" + book1.getTitle ());
        System.out.println ("Author:" + book1.getAutor ());
        System.out.println ("Items:" + book1.getExamples ());
        System.out.println ();

        System.out.println ("Book 2:");
        System.out.println ("Title:" + book2.getTitle ());
        System.out.println ("Author:" + book2.getAutor ());
        System.out.println ("Items:" + book2.getExamples ());
        System.out.println ();
    }
}  
