/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestore.model;

/**
 *
 * @author Darwin Valdiviezo NullPointers ESPE-DCCO
 */
public class CoffeeMaker extends ApplianceStore {
    private float size;
    private int ability;
    private String material;
    private String model;

    public CoffeeMaker(int serialNumber, float price,float size, int ability, String material, String model) {
        super(serialNumber, price);
        this.size = size;
        this.ability = ability;
        this.material = material;
        this.model = model;
    }
    
    
     

    @Override
    public String toString() {
        return "CoffeeMaker{" +super.toString() + ", size=" + size + "Cm" + ", ability=" + ability + " liters "+ ", material=" + material + ", model=" + model + '}';
    }
     
     
      
    public void buy(){
        
    }
    public void sell(){
        
    }
    public void tostock(){
        
    }
    public Gain generateprofit(){
    return new Gain();
    }
    
    /**
     * @return the model
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the velocity to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }
    
    /**
     * @return the size
     */
    public float getSize() {
        return size;
    }

    /**
     * @param size the velocity to set
     */
    public void setModel(float size) {
        this.size = size;
    }
    
  /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the velocity to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the ability
     */
    public int getAbility() {
        return ability;
    }

    /**
     * @param ability the ability to set
     */
    public void setAbility(int ability) {
        this.ability = ability;
    }

}
