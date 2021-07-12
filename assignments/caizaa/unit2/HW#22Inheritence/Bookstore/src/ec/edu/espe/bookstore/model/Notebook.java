/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bookstore.model;

/**
 *
 * @author Alisson Caiza ASUS ESPE-DCCO
 */
public class Notebook extends Product{
    private String type;
    private int numberOfPages;
    private float price;

    public Notebook(){
    }
    
    public Notebook(String type, int numberOfPages, float price) {
        this.type = type;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n\nNotebook{" + "\ntype= " + type + "\nnumberOfPages= " + numberOfPages + "\nprice= " + price + '}';
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
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
        System.out.println("entering Notebook.....");
        System.out.println("the notebook price is: " + price);
    }
    
    
    
    
}
