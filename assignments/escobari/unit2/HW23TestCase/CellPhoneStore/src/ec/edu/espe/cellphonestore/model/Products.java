/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cellphonestore.model;

/**
 *
 * @author Isaac Escobar InnovaCode ESPE-DCCO
 */
public abstract class Products {
     private int id;
    private float price;
    private String brand;
    
    public abstract Profit generateProfit(float price);

    @Override
    public String toString() {
        return "Products{" + "id=" + getId() + ", price=" + getPrice() + ", brand=" + getBrand() + '}';
    }

    public Products(int id, float price, String brand) {
        this.id = id;
        this.price = price;
        this.brand = brand;
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
    
    

}
