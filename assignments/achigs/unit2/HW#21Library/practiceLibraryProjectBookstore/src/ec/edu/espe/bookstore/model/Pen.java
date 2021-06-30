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
public class Pen {
    private String color;
    private String tipType;
    private float price;

    public Pen(){
    }

    public Pen(String color, String tipType, float price) {
        this.color = color;
        this.tipType = tipType;
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n\nPen{" + "\ncolor= " + color + "\ntipType= " + tipType + "\nprice= " + price + '}';
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
     * @return the tipType
     */
    public String getTipType() {
        return tipType;
    }

    /**
     * @param tipType the tipType to set
     */
    public void setTipType(String tipType) {
        this.tipType = tipType;
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
