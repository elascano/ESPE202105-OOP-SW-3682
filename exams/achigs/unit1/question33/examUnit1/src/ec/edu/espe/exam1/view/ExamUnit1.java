/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam1.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.exam1.model.Book;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Steven Achig Future Programmers ESPE-DCCO
 */
public class ExamUnit1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String editorial;
        String title;
        String autor;
        int yearOfPublication;
        int nElements;
        String jsonBook = null;
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        
        nElements = Integer.parseInt(JOptionPane.showInputDialog("Enter how many books do you want to enter?: "));
        Book books[] = new Book[nElements];
    
        for(int i = 0; i < nElements; i++){
            System.out.println("\nEnter the data of the Book "+ (i+1) + "\n");
            System.out.println("Enter the title of Book: ");
            title = read.nextLine();
            System.out.println("Enter the autor of Book: ");
            autor = read.nextLine();
            System.out.println("Enter the editorial of Book: ");
            editorial = read.nextLine();
            System.out.println("Enter the year of publication of Book: ");
            yearOfPublication = read.nextInt();
            read.nextLine();
            books[i] = new Book(title, autor, editorial, yearOfPublication);
        }
        
        for(int i = 0; i<nElements; i++){
            System.out.println("\n-All books-");
            System.out.println("\nTitle of Book " + (i+1) + ": "+books[i].getTitle()+"\nAutor of Book " + (i+1) + ": "+books[i].getAutor()+"\nEditorial of Book " + (i+1) + ": "+books[i].getEditorial()+"\nyear Of Publication " + (i+1) + ": "+books[i].getYearOfPublication());
        }
        
        for(int i = 0; i<nElements; i++){
            jsonBook = gson.toJson(books[i]);
            System.out.println("jsonBook" + (i+1) + "->" + jsonBook);
        }
        
        for(int i = 0; i<nElements; i++){
        books[i] = gson.fromJson(jsonBook, Book.class);        
        System.out.println("Json Autor Book -> " + books[i].getAutor());    
        }
    }
}
