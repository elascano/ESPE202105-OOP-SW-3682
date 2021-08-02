package ec.edu.espe.appliancestore.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import ec.edu.espe.appliancestore.controller.ApplianceStore;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Blender extends ApplianceStore {
    
    private int velocity;
    private int ability;
    
    public Blender(int serialNumber,float price,int velocity , int ability ){
        super(serialNumber,price);
        this.velocity = velocity;
        this.ability = ability;   
    }
        
    @Override
    public String toString() {
        return "Blender(" + super.toString() + " velocity -> " + velocity + " revolutions" + " ability->" + ability + " liters" ;
                } 
       
        
    public void buy(){
    }
    
    public void sell(){    
    }
    
    public void tostock(){    
    }
    
    public Profit generateprofit(){
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

}
