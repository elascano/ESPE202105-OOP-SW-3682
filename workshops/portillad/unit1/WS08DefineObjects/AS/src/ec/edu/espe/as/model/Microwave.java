/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.as.model;

/**
 *
 * @author Diego Portilla
 */
public class Microwave {
    private float size;
    private float weight;
    private String matrial ;
    private float price ;
    private String model ;
    private int SerialNumber;
    
   public void buy(){
    }
   public void sell(){
    }
   public void tostock(){
    }
   private void GenerateProfit(){
   }

    /**
     * @return the size
     */
    public float getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(float size) {
        this.size = size;
    }

    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * @return the matrial
     */
    public String getMatrial() {
        return matrial;
    }

    /**
     * @param matrial the matrial to set
     */
    public void setMatrial(String matrial) {
        this.matrial = matrial;
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
     * @return the SerialNumber
     */
    public int getSerialNumber() {
        return SerialNumber;
    }

    /**
     * @param SerialNumber the SerialNumber to set
     */
    public void setSerialNumber(int SerialNumber) {
        this.SerialNumber = SerialNumber;
    }
   
}

