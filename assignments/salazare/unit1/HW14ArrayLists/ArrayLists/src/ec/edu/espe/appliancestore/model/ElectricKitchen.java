/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestore.model;

/**
 *
 * @author Matthew Salazar
 */
public class ElectricKitchen {
    private float price;
    private float weight;
    private String size;
    private String material;
    private int identificationNumber;

    @Override
    public String toString() {
        return "ElectricKitchen{" + "price=" + price + ", weight=" + weight + ", size=" + size + ", material=" + material + ", identificationNumber=" + identificationNumber + '}';
    }
    
    public ElectricKitchen(float price,float weight,String size,String material,int identificationNumber){
        this.price = price;
        this.weight = weight;
        this.size = size;
        this.material = material;
        this.identificationNumber = identificationNumber;
    }
    
    public ElectricKitchen(){
       this.price = 350;
        this.weight = 50;
        this.size = "Big";
        this.material = "Ceramics";
        this.identificationNumber = 001; 
    }
    
    public void build(){
        
    }
    
    public void sell(){
        
    }
    
    public void tostock(){
        
    }
    
    public Gain generateProfit(){
        return new Gain();
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
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
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
     * @return the identificationNumber
     */
    public int getIdentificationNumber() {
        return identificationNumber;
    }

    /**
     * @param identificationNumber the identificationNumber to set
     */
    public void setIdentificationNumber(int identificationNumber) {
        this.identificationNumber = identificationNumber;
    }
}
