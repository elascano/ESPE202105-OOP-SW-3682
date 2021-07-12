/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cellphonestore.model;

/**
 *
 * @author InnovaCode
 */
public class HeadPhone extends Products{
    private String color;
    private String model;

    public HeadPhone(String color, String model, int id, float price, String brand) {
        super(id, price, brand);
        this.color = color;
        this.model = model;
    }
    
    

    @Override
    public String toString() {
        return "HeadPhone{" + "color=" + color + ", model=" + model + '}';
    }
    
    

    public HeadPhone(int id, float price, String brand) {
        super(id, price, brand);
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

       
}
