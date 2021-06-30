/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.store.model;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class Blender {
    
    private int velocity;
    private int ability;
    private float price;
    private int serialnumber;

    @Override
    public String toString() {
        return "Blender(" + "serialnumber -> " + serialnumber + " price ->" + 
                price + " velocity -> " + velocity + " revolutions" + " ability->" + ability + " liters" ;
                }
    
    public Blender(int velocity, int ability, float price, int serialnumber) {
        this.velocity = velocity;
        this.ability = ability;
        this.price = price;
        this.serialnumber = serialnumber;
    }
    
    public Blender(){
        
        serialnumber = 0;
        price = 0F;
        ability = 0;
        velocity = 0;
        
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
