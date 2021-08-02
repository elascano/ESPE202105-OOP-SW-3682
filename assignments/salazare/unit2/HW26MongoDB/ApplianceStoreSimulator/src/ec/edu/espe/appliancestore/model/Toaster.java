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
public class Toaster extends ApplianceStore {
    private int power;
    private float size;
    private float weight;
    private String material;
    private String model;

    public Toaster( int serialNumber, float price,int power, float size, float weight, String material, String model) {
        super(serialNumber, price);
        this.power = power;
        this.size = size;
        this.weight = weight;
        this.material = material;
        this.model = model;
    }

          
    @Override
    public String toString() {
        return "Toaster{" + super.toString() + ", power=" + power + " W " + ", size=" + size + "Cm" + ", weight=" + weight + "Kg" + ", material=" + material + ", model=" + model + '}';
    }

    
    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
}
