/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cellphonestore.model;

/**
 *
 * @author InnovaCode ESPE-DCCO
 */
public class ScreenProtector {
    private float price;
    private String material;
    private String model;
    private int id;

    public ScreenProtector(String model, float price, String material, int id) {
        this.price = price;
        this.material = material;
        this.model = model;
        this.id = id;
    }

    
    @Override
    public String toString() {
        return "ScreenProtector{" + "price=" + getPrice() + ", material=" + getMaterial() + ", model=" + getModel() + ", id=" + getId() + '}';
    }

   
    
    public ScreenProtector(){
        this.id = 0;
        this.price = 0.0F;
        this.material = "";
        this.model = "";
        }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
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
}
