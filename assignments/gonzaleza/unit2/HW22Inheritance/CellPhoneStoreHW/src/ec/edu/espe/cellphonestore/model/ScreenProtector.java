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
public class ScreenProtector extends Product {
    private String material;
    private String model;

    @Override
    public String toString() {
        return "ScreenProtector{" + super.toString() + "material=" + material + ", model=" + model + '}';
    }

    public ScreenProtector(int id, float price, String brand) {
        super(id, price, brand);
    }

    public ScreenProtector(String material, String model, int id, float price, String brand) {
        super(id, price, brand);
        this.material = material;
        this.model = model;
    }

    @Override
    public Profit generateProfit(float price) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
