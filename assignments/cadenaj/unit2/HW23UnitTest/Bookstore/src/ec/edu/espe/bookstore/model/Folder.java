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
public class Folder extends Product{
    private String material;
    private String color;

    public Folder(String material, String color, int id, float price, int amount) {
        super(id, price, amount);
        this.material = material;
        this.color = color;
    }

    @Override
    public String toString() {
        return "\nFolder\n" + "material = " + material + "\ncolor = " + color + super.toString();
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

}
