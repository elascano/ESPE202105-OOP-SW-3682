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
public class AS {
    private int SerialNumber;
    private String microwave[];
    private String toaster[];
    
   public void addmicrowave(String microwave[]){
       
   } 
   public void addmitoaster(String toaster[]){
       
   } 
   private void remove(int SerialNumber){
       
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
     * @return the microwave
     */
    public String[] getMicrowave() {
        return microwave;
    }

    /**
     * @param microwave the microwave to set
     */
    public void setMicrowave(String[] microwave) {
        this.microwave = microwave;
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
