/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pooexam.view;

import ec.edu.espe.pooexam.model.Book;
import java.util.Scanner;

/**
 *
 * @author 59399
 */
public class Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String titulo, autor;
        int ejemplares;

        //se crea el objeto libro1 utilizando el constructor con parámetros
        Book book1 = new Book("El quijote", "Cervantes", 1, 0);
        //se crea el objeto libro2 utilizando el constructor por defecto
        Book book2 = new Book(titulo, autor, editorial, añoDePublicacion);

        System.out.print("Introduce titulo: ");
        titulo = sc.nextLine();
        System.out.print("Introduce autor: ");
        autor = sc.nextLine();
        System.out.print("Numero de ejemplares: ");
        ejemplares = sc.nextInt();

        //se asigna a libro2 los datos pedidos por teclado.
        //para ello se utilizan los métodos setters
        book2.setTitulo(titulo);
        book2.setAutor(autor);
        book2.setEjemplares(ejemplares);

        //se muestran por pantalla los datos del objeto libro1
        //se utilizan los métodos getters para acceder al valor de los atributos
        System.out.println("Libro 1:");
        System.out.println("Titulo: " + book1.getTitulo());
        System.out.println("Autor: " + book1.getAutor());
        System.out.println("Ejemplares: " + book1.getEjemplares());
        System.out.println("Prestados: " + book1.getPrestados());
        System.out.println();

        //se realiza un préstamo de libro1. El método devuelve true si se ha podido
        //realizar el préstamo y false en caso contrario
        if (book1.prestamo()) {
            System.out.println("Se ha prestado el libro " + book1.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro " + book1.getTitulo() + " para prestar");         
        }

        //se realiza una devolución de libro1. El método devuelve true si se ha podido
        //realizar la devolución y false en caso contrario
        if (book1.devolucion()) {
            System.out.println("Se ha devuelto el libro " + book1.getTitulo());
        } else {
            System.out.println("No hay ejemplares del libro " + book1.getTitulo() + " prestados");
        }

        //se realiza otro préstamo de libro1
        if (book1.prestamo()) {
            System.out.println("Se ha prestado el libro " + book1.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro " + book1.getTitulo() + " para prestar");
        }

        //se realiza otro préstamo de libro1. En este caso no se podrá realizar ya que
        //solo hay un ejemplar de este libro y ya está prestado. Se mostrará por
        //pantalla el mensaje No quedan ejemplares del libro…
        if (book1.prestamo()) {
            System.out.println("Se ha prestado el libro " + book1.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro " + book1.getTitulo() + " para prestar");         
        }
        //mostrar los datos del objeto libro1
        System.out.println("Libro 1:");
        System.out.println("Titulo: " + book1.getTitulo());
        System.out.println("Autor: " + book1.getAutor());
        System.out.println("Ejemplares: " + book1.getEjemplares());
        System.out.println("Prestados: " + book1.getPrestados());
        System.out.println();

        //mostrar los datos del objeto libro2
        System.out.println("Libro 2:");
        System.out.println("Titulo: " + book2.getTitulo());
        System.out.println("Autor: " + book2.getAutor());
        System.out.println("Ejemplares: " + book2.getEjemplares());
        System.out.println("Prestados: " + book2.getPrestados());
        System.out.println();
}
        
        
    }
