/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theoretical.model;

/**
 *
 * @author jejoc
 */
public class Product {
    private int productId;
    private String name;
    private String type;
    private float price;
    private float amount;

    @Override
    public String toString() {
        return "Product{" + "productId=" + productId + ", name=" + name + ", type=" + type + ", price=" + price + ", amount=" + amount + '}';
    }

    public Product(int productId, String name, String type, float price, float amount) {
        this.productId = productId;
        this.name = name;
        this.type = type;
        this.price = price;
        this.amount = amount;
    }

    public Product() {
        this.productId = 0;
        this.name = "no name";
        this.type = "no type";
        this.price = 0;
        this.amount = 0;
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
     * @return the amount
     */
    public float getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(float amount) {
        this.amount = amount;
    }

    /**
     * @return the productId
     */
    public int getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(int productId) {
        this.productId = productId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
    
    
    
}
