/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Exam.model;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class Book {
    
    private String title;
    private String author;
    private String editorial;
    private int publicationYear;

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", editorial=" + editorial + ", publicationYear=" + publicationYear + '}';
    }

    
    public Book(String title, String author, String editorial, int publicationYear) {
        this.title = title;
        this.author = author;
        this.editorial = editorial;
        this.publicationYear = publicationYear;
    }
    
    public Book(){
        
        title = "";
        author = "";
        editorial = "";
        publicationYear = 0;   
        
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
     * @return the publicationYear
     */
    public int getPublicationYear() {
        return publicationYear;
    }

    /**
     * @param publicationYear the publicationYear to set
     */
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    
}
