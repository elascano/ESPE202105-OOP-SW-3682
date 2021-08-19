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
public class DVD extends ApplianceStore {
    
    private float size;
    private String model;

    public DVD(int serialNumber, float price,float size, String model) {
        super(serialNumber, price);
        this.size = size;
        this.model = model;
    }

   
   

    @Override
    public String toString() {
        return "DVD{" +super.toString() + ", size=" + size + "Cm" + ", model=" + model + '}';
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
