/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.books.model;

/**
 *
 * @author Sebastian Solano NullPunters ESPE-DCCO
 */
public class Books {
    public class Book {
    private String title;
    private String author;
    private int instances;
    private int rendered;

    // default constructor
    public Book () {
    }

    // constructor with parameters
    public Book (String title, String author, int items, int borrowed) {
        this.title = title;
        this.autor = author;
        this.examples = exemplars;
        this.borrowed = rendered;
    }

    // getters and setters
    public String getAutor () {
        return author;
    }

    public void setAutor (String author) {
        this.autor = author;
    }

    public int getExamples () {
        return instances;
    }

    public void setExamples (int instances) {
        this.examples = exemplars;
    }

    public int getPrestados () {
        return rendered;
    }

    public void setPrestados (int rendered) {
        this.borrowed = rendered;
    }

    public String getTitle () {
        return title;
    }

    public void setTitulo (String title) {
        this.title = title;
    }

    // method to borrow a book
    public boolean loan () {
        boolean borrowed = true;
        if (borrowed <items) {
            rendered ++;
        } else {
            borrowed = false;
        }
        return borrowed;
    }

    // method to return a book
    public boolean return () {
        boolean returned = true;
        if (rendered == 0) {
            returned = false;
        } else {
            borrowed--;
        }
        return returned;
    }

    // overridden toString method to display data from Book class
    @Override
    public String toString () {
        return "title:" + title + "\ nautor:" + author +
                  "\ neissues:" + copies + "\ nloaned:" + borrowed;
    }
}
