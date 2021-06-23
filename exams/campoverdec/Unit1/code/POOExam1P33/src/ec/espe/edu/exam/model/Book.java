/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.exam.model;

/**
 *
 * @author Carlos Campoverde EMCL.java ESPE-DCCO
 */
public class Book {
    private String title;
    private String author;
    private String publisher;
    private int yearOfPublisher;

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", publisher=" + publisher + ", yearOfPublisher=" + yearOfPublisher + '}';
    }

    
    public Book(String title, String author, String publisher, int yearOfPublisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublisher = yearOfPublisher;
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
     * @return the yearOfPublisher
     */
    public int getYearOfPublisher() {
        return yearOfPublisher;
    }

    /**
     * @param yearOfPublisher the yearOfPublisher to set
     */
    public void setYearOfPublisher(int yearOfPublisher) {
        this.yearOfPublisher = yearOfPublisher;
    }
    
}
