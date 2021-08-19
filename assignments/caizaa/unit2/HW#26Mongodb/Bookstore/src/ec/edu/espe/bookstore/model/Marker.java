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
public class Marker extends Product{
    private String color;
    private String inkType;

    public Marker(String color, String inkType, int id, float price, int amount) {
        super(id, price, amount);
        this.color = color;
        this.inkType = inkType;
    }

    @Override
    public String toString() {
        return "\nMarker\n" + "color = " + color + "\ninkType = " + inkType + super.toString();
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
}