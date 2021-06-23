/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.q33.model;

/**
 *
 * @author jejoc
 */
public class Books {
    private String title;
    private String author;
    private String publisher;
    private int yearOfPublication;

    public Books(String title, String author, String publisher, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Books{" + "title=" + title + ", author=" + author + ", publisher=" + publisher + ", yearOfPublication=" + yearOfPublication + '}';
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
     * @return the yearOfPublication
     */
    public int getYearOfPublication() {
        return yearOfPublication;
    }

    /**
     * @param yearOfPublication the yearOfPublication to set
     */
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
    
    
    
}
