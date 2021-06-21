/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.CellPhoneStore.model;

/**
 *
 * @author 59399
 */
public class CellPhone {
    
    private String color;
    private String brand;
    private float price;
    private int id;
    private String model;

    public CellPhone(){
        this.id = 0;
        this.price = 0.0F;
        String brand1 = this.brand;
        String color1 = this.color;
        String model1 = this.model;
        }
    
    public CellPhone(int id,float price,String brand , String model, String color ){
        this.id = id;
        this.price = price;
        this.brand= brand;
        this.model = model;
        this.color = color; 
        
    }

    public CellPhone(String id, String price, String color, String brand, String model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        return "Blender(" + "ProductId -> " + id + " price ->" + 
                price + " brand -> " + brand  + " model->" + model + "color" + color ;
                }
    public String [] getArray(){
        String[] date = {"id -> " + String.valueOf(id)+ " price ->" +String.valueOf(price)+ "  -> "+String.valueOf(velocity)+" revolutions "+" ability-> "+String.valueOf(ability)+ " liters"};
     return date;
    }
    
        
    public void buy(){
        
    }
    public void sell(){
        
    }
    public void tostock(){
        
    }
    public Profit profit(){
    return new Profit();
    
    }

    
    /**
     * @return the velocity
     */
    public int getVelocity() {
        return velocity;
    }

    /**
     * @param velocity the velocity to set
     */
    public void setVelocity(int velocity) {
        this.velocity = velocity;
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
