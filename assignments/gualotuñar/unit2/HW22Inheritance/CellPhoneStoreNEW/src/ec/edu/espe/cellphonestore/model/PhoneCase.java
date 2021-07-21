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
public class PhoneCase extends Product {
    private String color;
    private String model;
    private String material;

    @Override
    public String toString() {
        return "PhoneCase{" + super.toString() + "color=" + color + ", model=" + model + ", material=" + material + '}';
    }

    public PhoneCase(int id, float price, String brand) {
        super(id, price, brand);
    }

    public PhoneCase(String color, String model, String material, int id, float price, String brand) {
        super(id, price, brand);
        this.color = color;
        this.model = model;
        this.material = material;
    }

    @Override
    public Profit generateProfit(float price) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
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

}
