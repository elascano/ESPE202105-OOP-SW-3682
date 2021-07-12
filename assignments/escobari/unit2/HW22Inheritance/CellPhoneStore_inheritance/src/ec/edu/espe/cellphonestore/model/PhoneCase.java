/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cellphonestore.model;

/**
 *
 * @author InnovaCode ESPE-DCCO
 */
public class PhoneCase extends Warehouse {
    private float price;
    private String color;
    private String model;
    private String brand;
    private String material;
    private int id;

    public PhoneCase() {
    }

    @Override
    public String toString() {
        return "PhoneCase{" + "price=" + price + ", color=" + color + ", model=" + model + ", brand=" + brand + ", material=" + material + ", id=" + id + '}';
    }

    public PhoneCase(float price, String color, String model, String brand, String material, int id) {
        this.price = price;
        this.color = color;
        this.model = model;
        this.brand = brand;
        this.material = material;
        this.id = id;
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
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
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
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
}
