/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Exam.view;

import ec.edu.espe.Exam.model.Book;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Esteban Chablay EMCL. Java ESPE-DCCO
 */
public class Exam1_Library {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        String title = "";
        String author = "";
        String publisher = "";
        int yearOfPublication = 0;
        int option = 0;
        
        Book book1 = new Book("Don Quijote", "Miguel de Cervantes", "n.a", 1605);
        Book book2 = new Book("Historia de dos ciudades", "Charles Dickens", "n.a", 1859);
        Book book3 = new Book("Harry Potter y la piedra filosofal", "J.K. Rowling", "n.a", 1997);
        Book book4 = new Book("El Señor de los Anillos", "J.R.R. Tolkien", "n.a", 1954);
        Book book5 = new Book("El principito", "Antoine de Saint-Exupery", "n.a", 1943);
        Book book6 = new Book("El hobbit", "J.R.R Tolkien", "na", 1937);
        Book book7 = new Book("Las aventuras de Alicia en el pais de las maravillas", "Agatha Christie", "n.a", 1865);
        Book book8 = new Book("El codigo Da Vinci", "Dan Brown", "n.a", 2003);
        //Book book9 = new Book(title, author, publisher, yearOfPublication);
        Book book10 = new Book(title, author, publisher, yearOfPublication);
        
        System.out.println("Desea ingresar un libre manualmente?");
        System.out.println("1. SI");
        System.out.println("2. NO");
        System.out.println("Seleccione: ");
        Scanner scan = new Scanner(System.in);
        option = scan.nextInt();
        if (option == 1){
            System.out.println("INGRESO DE LIBRO");
            System.out.println("Ingrese el titulo: ");
            title = scan.nextLine();
            
            System.out.println("Ingrese el autor: ");
            author = scan.nextLine();
            
            System.out.println("Ingrese la editorial: ");
            publisher = scan.nextLine();
            
            System.out.println("Ingrese el año de publicacion: ");
            yearOfPublication = scan.nextInt();
            
            Book book9 = new Book(title, author, publisher, yearOfPublication);
            books.add(book9);
        }
        
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        
        //System.out.println("Lista de libros: " +books);
        
        Iterator<Book> it = books.iterator();
        int contador = 0;
        while(it.hasNext()){
            System.out.println(it.next());
            contador = contador +1;
        }
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("Cantidad de libros: " +contador);
        
        
        
        
    }
    
}
