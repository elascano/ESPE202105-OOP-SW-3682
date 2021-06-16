/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sanamed.model;

/**
 *
 * @author Carlos Campoverde EMCL.java ESPE-DCCO
 */
public class Product {
    private String tipe;
    private String brand;
    private int amount;
    private float price;
    private boolean inStock; 

    public Product(String vitamin_C, String mk, int i, int i0, float f, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Product{" + "tipe=" + tipe + ", brand=" + brand + ", amount=" + amount + ", price=" + price + ", inStock=" + inStock + '}';
    }

    public Product(String tipe, String brand, int amount, float price, boolean inStock) {
        this.tipe = tipe;
        this.brand = brand;
        this.amount = amount;
        this.price = price;
        this.inStock = inStock;
    }

    public Product() {
        tipe = "";
        brand = "";
        amount = 0;
        price = 0.0F;
        inStock = false;
    }

    
    /**
     * @return the tipe
     */
    public String getTipe() {
        return tipe;
    }

    /**
     * @param tipe the tipe to set
     */
    public void setTipe(String tipe) {
        this.tipe = tipe;
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
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
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
     * @return the inStock
     */
    public boolean isInStock() {
        return inStock;
    }

    /**
     * @param inStock the inStock to set
     */
    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
    
}
