/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bookstore.model;

/**
 *
 * @author Steven Achig Future Programmers ESPE-DCCO
 */
public class Book {
    private String material;
    private String editorial;
    private String title;
    private String autor;
    private String color;
    private int numberOfPages;
    

    @Override
    public String toString() {
        return "Book{" + "material=" + material + ", editorial=" + editorial + ", title=" + title + ", autor=" + autor + ", color=" + color + ", numberOfPages=" + numberOfPages + '}';
    }
    
    public Book() {
    material = "";
    editorial = "";
    title = "";
    autor = "";
    color = "";
    numberOfPages = 0;
    }
    
    public Book(String material, String editorial, String title, String autor, String color, int numberOfPages) {
        this.material = material;
        this.editorial = editorial;
        this.title = title;
        this.autor = autor;
        this.color = color;
        this.numberOfPages = numberOfPages;
    }
    
    
    
    private void beBought(){
    }
    public void beSold(){
    }

    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
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
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the numberOfPages
     */
    public int getNumberOfPages() {
        return numberOfPages;
    }

    /**
     * @param numberOfPages the numberOfPages to set
     */
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

}
