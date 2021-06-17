/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bookstore.model;

/**
 *
 * @author Steven Achig FutureProgrammers ESPE-DCCO
 */
public class Book {
    private String color;
    private String material;
    private String editorial;
    private String autor;
    private int numberOfPage;

    @Override
    public String toString() {
        return "Book{" + "color=" + color + ", material=" + material + ", editorial=" + editorial + ", autor=" + autor + ", numberOfPage=" + numberOfPage + '}';
    }

    public Book(String color, String material, String editorial, String autor, int numberOfPage) {
        this.color = color;
        this.material = material;
        this.editorial = editorial;
        this.autor = autor;
        this.numberOfPage = numberOfPage;
    }

    public Book(){       
        color = "no color";
        material = "no material";
        editorial = "no editorial";
        autor = "no autor";
        numberOfPage = 0;
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
     * @return the numberOfPage
     */
    public int getNumberOfPage() {
        return numberOfPage;
    }

    /**
     * @param numberOfPage the numberOfPage to set
     */
    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }
    
    
}
