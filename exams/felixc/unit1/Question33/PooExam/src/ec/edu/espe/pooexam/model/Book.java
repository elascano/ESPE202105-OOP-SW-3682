/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pooexam.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author 59399
 */
public class Book {
    
    private String titulo;
    private String autor;
    private String editorial;
    private String añoDePublicacion;

    

    //constructor con parámetros
    public Book(String titulo, String autor, String editorial, String añoDePublicacion) {                                    
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.añoDePublicacion = añoDePublicacion;
    }

    //getters y setters
    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the editorial
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * @param editorial the editorial to set
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     * @return the añoDePublicacion
     */
    public String getAñoDePublicacion() {
        return añoDePublicacion;
    }

    /**
     * @param añoDePublicacion the añoDePublicacion to set
     */
    public void setAñoDePublicacion(String añoDePublicacion) {
        this.añoDePublicacion = añoDePublicacion;
    }

    //método para realizar el prestamo de un libro
    

    //método toString sobrescrito para mostrar los datos de la clase Libro
    @Override
    public String toString() {
        return "titulo: " + getTitulo() + "\nautor: " + getAutor() +
                  "\neditorial: " + editorial + "\nAñodePublicacion: " + añoDePublicacion;                                    
    }
    
    
    public static void writeInJsonFile() throws IOException {

        String titulo;
        String autor;
        String editorial;
        String añoDePublicacion;
        ArrayList<Book> books = new ArrayList<>();
        Book booksArray[] = new Book[3];
        Scanner select = new Scanner(System.in);
        System.out.println("Please, enter the new data to the json file");

        System.out.println("Enter the title of the book: ");
        titulo = select.nextLine();
        System.out.println("Enter the author of the book: ");
        autor = select.nextLine();
        System.out.println("Enter the editorial of the book: ");
        editorial = select.nextLine();
        System.out.println("Enter the year of publication: ");
        añoDePublicacion = select.nextLine();
        

        Book book = new Book(titulo, autor, editorial, añoDePublicacion);

        book = new Book(titulo, autor, editorial, añoDePublicacion);
        System.out.println("Book object -> " + book);

        books.add(book);

        System.out.println("Books -> " + books + "\n");

        booksArray[0] = book;
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter file = new FileWriter("Book.json")) {
            file.write(gson.toJson(books));
            file.close();
        }
    }
    
    public static void readFromJsonFile() throws FileNotFoundException, IOException, ParseException {

        ArrayList<Book> books = new ArrayList<>();
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("Book.json"));

            JSONObject jsonObject = (JSONObject) obj;

            String titulo = (String) jsonObject.get("titulo");
            String author = (String) jsonObject.get("author");
            String editorial = (String) jsonObject.get("editorial");
            String añoDePublicacion = (String) jsonObject.get("yearofpublication");
            

            System.out.println("titulo: " + titulo);
            System.out.println("Price: " + author);
            System.out.println("Brand: " + editorial);
            System.out.println("Model: " + añoDePublicacion);
            

            Iterator iterator = books.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

        } catch (FileNotFoundException e) {
        }
    }

    
    
}
