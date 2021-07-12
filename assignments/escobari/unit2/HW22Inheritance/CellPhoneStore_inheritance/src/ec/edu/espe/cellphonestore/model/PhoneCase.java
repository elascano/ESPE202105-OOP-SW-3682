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
public class PhoneCase extends Products {
    private String color;
    private String model;
    private String material;

    public PhoneCase(String color, String model, String material, int id, float price, String brand) {
        super(id, price, brand);
        this.color = color;
        this.model = model;
        this.material = material;
    }
     public PhoneCase(int id, float price, String brand) {
        super(id, price, brand);
    }
    
    

    @Override
    public String toString() {
        return "PhoneCase{" + "color=" + color + ", model=" + model + ", material=" + material + '}';
    }

    @Override
    public Profit generateProfit(float price) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getMaterial() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getColor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     
}
