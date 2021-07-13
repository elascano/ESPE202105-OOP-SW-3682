/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.books.model;

/**
 *
 * @author Salazar Matthew NullPointers ESPE-DCC
 */
public class Book1 {
    private String title;
    private String author;
    private String editorial;
    private int yearPublication;
    
   public Book1(){
        this.title = "";
        this.author = "";
        this.editorial = "";
        this.yearPublication = 0; 
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
     * @return the yearPublication
     */
    public int getYearPublication() {
        return yearPublication;
    }

    /**
     * @param yearPublication the yearPublication to set
     */
    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
   
   
}
