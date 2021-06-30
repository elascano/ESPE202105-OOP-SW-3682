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
public class Marker {
    private String color;
    private String inkType;
    private float price;

    public Marker(){
    }
    
    public Marker(String color, String inkType, float price) {
        this.color = color;
        this.inkType = inkType;
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n\nMarker{" + "\ncolor= " + color + "\ninkType= " + inkType + "\nprice= " + price + '}';
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
     * @return the inkType
     */
    public String getInkType() {
        return inkType;
    }

    /**
     * @param inkType the inkType to set
     */
    public void setInkType(String inkType) {
        this.inkType = inkType;
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
    
   
    
}
