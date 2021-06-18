/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sanamed.model;

/**
 *
 * @author Carlos Campoverde EMCL.java ESPE-DCCO
 */
public class Product {
    private String tipe;
    private String brand;

    public Product(String tipe, String brand) {
        this.tipe = tipe;
        this.brand = brand;
    }

    
    
    
    /**
     * @return the tipe
     */
    public String getTipe() {
        return tipe;
    }

    /**
     * @param tipe the tipe to set
     */
    public void setTipe(String tipe) {
        this.tipe = tipe;
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
}

