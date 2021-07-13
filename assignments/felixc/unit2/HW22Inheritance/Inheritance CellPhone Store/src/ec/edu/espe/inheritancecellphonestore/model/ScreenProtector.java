/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.inheritancecellphonestore.model;

/**
 *
 * @author 59399
 */
public class ScreenProtector extends Warehouse{
    
    private String material;
    private String model;

    public ScreenProtector(String material, String model, int id, float priceRange) {
        super(id, priceRange);
        this.material = material;
        this.model = model;
    }

    @Override
    public String toString() {
        return "ScreenProtector{" + "material=" + getMaterial() + ", model=" + getModel() + '}';
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
    
    
    
}
