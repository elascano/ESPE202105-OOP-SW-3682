/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam1.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Alisson Caiza ASUS ESPE-DCCO
 */
public class ExamUnit1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int color;
        int book;
        
        Scanner read = new Scanner(System.in);
        String editorial;
        String title;
        String autor;
        int yearOfPublication;
        String jsonBook = null;
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        Book books[] = new Book[25];
    
        for(int i = 0; i < 20; i++){
            System.out.println("\nEnter the Book "+ (i+1) + "\n");
            System.out.println("Enter the material of Book: ");
            material = read.nextLine();
            System.out.println("Enter the editorial : ");
            editorial = read.nextLine();
            System.out.println("Enter the title: ");
            title = read.nextLine();
            System.out.println("Enter the autor: ");
            autor = read.nextLine();
            System.out.println("Enter the color: ");
            color = read.nextLine();
            System.out.println("Enter the number of pages of Book: ");
            numberOfPages = read.nextInt();
            read.nextLine();
            books[i] = new Book(material, editorial, title, autor, color, numberOfPages);
        }
}
    }
        
