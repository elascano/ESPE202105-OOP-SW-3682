/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestore.model;

/**
 *
 * @author Salazar Matthew NullPointers ESPE-DCC
 */
public class ApplianceStore {
    ElectricDryer electricDyer;
    ElectricKitchen electricKitchen;
    Fridge fridge;
    int identificationNumber;
    
    public ElectricKitchen add(ElectricKitchen electricKitchen){
        return new ElectricKitchen();
    }
    
    public ElectricDryer add(ElectricDryer electricDryer){
        return new ElectricDryer();
    }
    
     public Fridge add(Fridge fridge){
        return new Fridge();
    }
}
