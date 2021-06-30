/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestore.model;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class CoffeeMaker {
    private float size;
    private int ability;
    private String material;
    private float price;
    private String model;
    private int serialnumber;
    
    public CoffeeMaker(){
        this.serialnumber = 0;
        this.model = "";
        this.price = 0.0F;
        this.material = "";
        this.ability = 0;
        this.size = 0;
    }
     
     public CoffeeMaker(int serialnumber,String model,float price , String material, float size ){
        this.serialnumber = serialnumber;
        this.model = model;
        this.price = price;
        this.material = material;
        this.ability = ability;
        this.size = size;
        
    }
    
 
    public CoffeeMaker(int ability, String model, String material, float price, float size, int serialnumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     @Override
    public String toString() {
        return "CoffeeMaker(" + "serialnumber -> " + serialnumber + "brand->"+  model + " price ->" +
                price + " material -> " + material + " quality" + " ability->" + ability + " liters" + "size" + size;
                }
    public String [] getArray(){
        String[] date = {"serialnumber -> " + String.valueOf(serialnumber)+ "model ->" + String.valueOf(model)+ " price ->" +String.valueOf(price)+ " material -> "+String.valueOf(material)+" quality "+" ability-> "+String.valueOf(ability)+ " liters" + "size->"+String.valueOf(size)};
     return date;
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
     * @return the serialnumber
     */
    public int getSerialnumber() {
        return serialnumber;
    }

    /**
     * @param serialnumber the serialnumber to set
     */
    public void setSerialnumber(int serialnumber) {
        this.serialnumber = serialnumber;
    }
}
