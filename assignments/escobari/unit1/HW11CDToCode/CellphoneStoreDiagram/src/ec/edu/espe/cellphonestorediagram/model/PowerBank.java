/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cellphonestorediagram.model;

/**
 *
 * @author Isaac Escobar InnovaCode ESPE-DCCO
 */
class PowerBank {

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
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the price
     */
    public Float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * @return the capacity
     */
    public Float getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(Float capacity) {
        this.capacity = capacity;
    }
    private String id;
    private String type;
    private Float price;
    private Float capacity;
    
     public void paywithCash(){
    
    }
    
    public void paywithCard(){
        
    }
    
    public void toput(){
        
    }
    
    float f;
    
    public void m(){
        
    }
    
}
