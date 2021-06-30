/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.lang.ProcessBuilder.Redirect.Type;
import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import static java.util.Spliterators.iterator;
import static java.util.Spliterators.iterator;
import static java.util.Spliterators.iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author pc
 */
public class Exam1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        String author;
        String title;
        String publisher;
         String publicationyear;
        ArrayList<Books>books=new ArrayList<>();
        Books booksArray[] = new Books[3];
        
        
        
         Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!exit) {
 
            System.out.println("PRESS 2:Read on Json");
            System.out.println("PRESS 1: Write on Json");
            System.out.println("PRESS 5: EXIT");
 
            try {
 
                System.out.println("Choose one option");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("");
                        writeJSON();
                        break;
                    case 2:
                        System.out.println("");
                        readJSON();
                        break; 
                    case 5:
                        System.out.println("THANK YOU FOR USING OUR STORE, HAVE A NICE DAY!!");
                        exit = true;
                        break;
                    default:
                        System.out.println("you haven´t choosed any option, please try again");
                }
            } catch (InputMismatchException e) {
                sn.next();
            }
        }
        // TODO code application logic here
    }
     public static void writeJSON() throws IOException{
        
        String title;
        String author;
        String publisher;
        String publicationyear;

        ArrayList<Books>books=new ArrayList<Books>();
        Books booksArray[] = new Books[3];
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter data to Json");
              
                            
        System.out.println("Enter title :");
        title = sc.next();
        System.out.println("Ingrese el precio :");
        author=sc.next();
        System.out.println("Ingrese las velocidades :");
        publisher=sc.next();
        System.out.println("Ingrese las capacidad :");
        publicationyear=sc.next();
        
        Books book = new Books();
        System.out.println("Book object -> " + book);
        
        book = new Books(title,author,publisher,publicationyear);
        System.out.println("Blender object -> " + book);
                   
        books.add(book);
               
        System.out.println("Blenders -> " + books + "\n");
        
        booksArray[0] = book;
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
             try (Writer writer = new FileWriter("Book.json")) {
                 writer.write(gson.toJson(book));
             }
    }
    public static void readJSON() throws Exception {
         ArrayList<Books>blenders=new ArrayList<Books>();
        JSONParser parser = new JSONParser();
        try {
           
        FileReader reader = new FileReader("Books.json");
        Object obj = parser.parse(reader);
        JSONObject JsonObj = (JSONObject)obj;
                       
            String title =(String) JsonObj.get("title");
            String author =(String) JsonObj.get("author");
            String publisher =(String) JsonObj.get("publisher");
            String publicationyear =(String) JsonObj.get("publicationyear");
           
            System.out.println( "title: " + title);
            System.out.println( "author: " + author);
            System.out.println( "publisher: " + publisher);
            System.out.println( " publication year: " +publicationyear ); 
            Iterator iterator = blenders.iterator();
            while (iterator.hasNext()) {
               System.out.println(iterator.next());
               }

		} catch (FileNotFoundException e) {
		e.printStackTrace();
		
			
		}
         
    }
}
