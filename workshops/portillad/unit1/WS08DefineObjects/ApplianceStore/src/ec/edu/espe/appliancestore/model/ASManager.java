/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestore.model;

/**
 *
 * @author Diego Portilla
 */
public class ASManager {
    private String name;
    private String ApplianceStore[];
    
   public void add(String ApplianceStore[]){
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
     * @return the ApplianceStore
     */
    public String[] getApplianceStore() {
        return ApplianceStore;
    }

    /**
     * @param ApplianceStore the ApplianceStore to set
     */
    public void setApplianceStore(String[] ApplianceStore) {
        this.ApplianceStore = ApplianceStore;
    }
}
