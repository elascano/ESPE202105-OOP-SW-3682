/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle.manufacturer;

import ec.edu.espe.vehicule.controller.DBManager;

/**
 *
 * @author Isaac Escobar InnovaCode ESPE-DCCO
 */
public class VehicleManufacturer {
    private String id;
    private String brand;
    private String model;
    

    public VehicleManufacturer(String id, String model, String brand) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
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
