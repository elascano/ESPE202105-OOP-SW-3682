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
public class Calculator extends Product{
    private String model;
    private String brand;
    private float price;

    public Calculator(){
    }
    
    public Calculator(String model, String brand, float price) {
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n\nCalculator{" + "\nmodel= " + model + "\nbrand= " + brand + "\nprice= " + price + '}';
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
        System.out.println("entering Calculator.....");
        System.out.println("the Calculator price is: " + price);
    }
    
    
}
