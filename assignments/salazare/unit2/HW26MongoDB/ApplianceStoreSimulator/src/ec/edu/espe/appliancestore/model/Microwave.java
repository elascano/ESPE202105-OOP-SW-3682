/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestore.model;

import ec.edu.espe.appliancestore.controller.ApplianceStore;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class Microwave extends ApplianceStore {
   
    private float size;
    private float weight;
    private String material;
    private String model;

    public Microwave( int serialNumber, float price,float size, float weight, String material, String model) {
        super(serialNumber, price);
        this.size = size;
        this.weight = weight;
        this.material = material;
        this.model = model;
    }

   

    @Override
    public String toString() {
        return "Microwave{" + super.toString() + ", size=" + size + " Cm" + ", weight=" + weight + "Kg" + ", material=" + material + ", model=" + model + '}';
    }
        
             
    public void buy(){
        
    }
    public void sell(){
        
    }
    public void tostock(){
        
    }
    public Profit generateprofit(){
    return new Profit();
    
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

}
