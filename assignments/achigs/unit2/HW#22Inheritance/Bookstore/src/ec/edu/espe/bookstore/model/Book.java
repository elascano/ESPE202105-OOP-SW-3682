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
    private float price;
    
    public Book(){
        title = "";
        author = "";
        price = 0;
    }
    
    public Book(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n\nBook{" + "\ntitle= " + title + "\nauthor= " + author + "\nprice= " + price + '}';
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
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public void buy(float price) {
        System.out.println("entering book.....");
        System.out.println("the book price is: " + price);
    }
    
}
