/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.store.model;

/**
 *
 * @author Darwin Valdiviezo NullPointers ESPE-DCCO
 */
public class Iron {
    private int id;
    private String description;
    private boolean brand;

    public Iron(int id, String description, boolean brand) {
        this.id = id;
        this.description = description;
        this.brand = brand;
    }

    
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the brand
     */
    public boolean isBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(boolean brand) {
        this.brand = brand;
    }
    
}
