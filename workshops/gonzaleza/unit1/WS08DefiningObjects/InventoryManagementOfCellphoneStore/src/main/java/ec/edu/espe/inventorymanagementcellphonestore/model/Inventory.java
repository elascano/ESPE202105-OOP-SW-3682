/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.inventorymanagementcellphonestore.model;

/**
 *
 * @author LENOVO
 */
public class Inventory {
    private String product[];
    private float pricePerUnit[];
    
    public void notice(boolean stock){
        
    }

    /**
     * @return the product
     */
    public String[] getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(String[] product) {
        this.product = product;
    }

    /**
     * @return the pricePerUnit
     */
    public float[] getPricePerUnit() {
        return pricePerUnit;
    }

    /**
     * @param pricePerUnit the pricePerUnit to set
     */
    public void setPricePerUnit(float[] pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
    
}
