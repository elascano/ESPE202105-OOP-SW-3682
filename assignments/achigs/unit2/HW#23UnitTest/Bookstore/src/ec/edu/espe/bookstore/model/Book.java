/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bookstore.model;

/**
 *
 * @author jejoc
 */
public class Book extends Product{
    private String title;
    private String author;

    public Book(String title, String author, int id, float price) {
        super(id, price);
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "\nBook\n" + "title= " + title + "\nauthor= " + author + " " + super.toString();
    }
    
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }
}
