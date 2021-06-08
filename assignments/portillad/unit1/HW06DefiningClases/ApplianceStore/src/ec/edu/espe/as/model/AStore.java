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
public class AStore {
    private int SerialNumber;
    private String microwaves[];
    private String toaster[];
    
    public void AddMicrowave(String microwave[]){
        
    }
    public void AddToaster(String Toaster[]){
        
    }
    public void remove(int SerialNumber){
        
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

    /**
     * @return the microwaves
     */
    public String[] getMicrowaves() {
        return microwaves;
    }

    /**
     * @param microwaves the microwaves to set
     */
    public void setMicrowaves(String[] microwaves) {
        this.microwaves = microwaves;
    }

    /**
     * @return the toaster
     */
    public String[] getToaster() {
        return toaster;
    }

    /**
     * @param toaster the toaster to set
     */
    public void setToaster(String[] toaster) {
        this.toaster = toaster;
    }
}
