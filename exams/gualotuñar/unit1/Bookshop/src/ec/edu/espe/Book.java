/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe;

/**
 *
 * @author Gualotuña Richard INNOVA CODE
 */
public class Book {
    private String title;
    private String author;
    private String publisher;
    private int YearOfPublication;

    public Book(String title, String author, String publisher, int YearOfPublication) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.YearOfPublication = YearOfPublication;
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

    /**
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * @param publisher the publisher to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * @return the YearOfPublication
     */
    public int getYearOfPublication() {
        return YearOfPublication;
    }

    /**
     * @param YearOfPublication the YearOfPublication to set
     */
    public void setYearOfPublication(int YearOfPublication) {
        this.YearOfPublication = YearOfPublication;
    }
    
}
