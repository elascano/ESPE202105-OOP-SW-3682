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
   
    public Calculator(String model, String brand, int id, float price, int amount) {
        super(id, price, amount);
        this.model = model;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "\nCalculator\n" + "model = " + model + "\nbrand = " + brand + super.toString();
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
}
