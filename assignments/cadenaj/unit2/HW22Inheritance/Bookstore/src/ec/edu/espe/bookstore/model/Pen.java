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
public class Pen extends Product{
    private String color;
    private String tipType;

    public Pen(String color, String tipType, int id, float price, int amount) {
        super(id, price, amount);
        this.color = color;
        this.tipType = tipType;
    }

    @Override
    public String toString() {
        return "\nPen\n" + "color = " + color + "\ntipType = " + tipType + super.toString();
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
}
