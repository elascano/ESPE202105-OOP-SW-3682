/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bookstore.view;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.bookstore.model.Book;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author steve
 */
public class JsonFile {

    /**
     * @param args the command line arguments
     */
      
    public static void main(String[] args) {
        File file = new File("myArchive.txt");
        if(!file.exists()){
            try{
                file.createNewFile(); 
                System.out.println(file.getName()+"Ha sido creado");
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
        
        Scanner read = new Scanner(System.in);
        String material;
        String editorial;
        String title;
        String autor;
        String color;
        int numberOfPages;
        int nElements;
        String jsonBook;
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        
        nElements = Integer.parseInt(JOptionPane.showInputDialog("Enter how many books do you want to enter?: "));
        Book books[] = new Book[nElements];

        for(int i = 0; i < nElements; i++){
            System.out.println("\nEnter the data of the Book\n"+ i+1);
            System.out.println("Enter the material of Book: ");
            material = read.nextLine();
            System.out.println("Enter the editorial of Book: ");
            editorial = read.nextLine();
            System.out.println("Enter the title of Book: ");
            title = read.nextLine();
            System.out.println("Enter the autor of Book: ");
            autor = read.nextLine();
            System.out.println("Enter the color of Book: ");
            color = read.nextLine();
            System.out.println("Enter the number of pages of Book: ");
            numberOfPages = read.nextInt();
            read.nextLine();
            books[i] = new Book(material, editorial, title, autor, color, numberOfPages);
        }
        
        for(int i = 0; i<nElements; i++){
            System.out.println("\nThe data of Book " + i+1 + " are: ");
            System.out.println("\nMaterial of Book " + i+1 + ": " + books[i].getMaterial()+"\nEditorial of Book " + i+1 + ": "+books[i].getEditorial()+"\nTitle of Book " + i+1 + ": "+books[i].getTitle()+"\nAutor of Book " + i+1 + ": "+books[i].getAutor()+"\nColor of Book " + i+1 + ": "+books[i].getColor()+"\nNumber of Pages of Book " + i+1 + ": "+books[i].getNumberOfPages());
        }
        
            
        
        for(int i = 0; i<nElements; i++){
            jsonBook = gson.toJson(books[i]);
            System.out.println("jsonBook" + i + "->" + jsonBook);
        }
    }

}
