/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestrore.model;

/**
 *
 * @author Sebastian Solano NullPunters ESPE-DCCO
 */
    
public class Blender extends Products{
    
    private int velocity;
    private int ability;

    public Blender(int velocity, int ability, int id, float price, String model, float size, float weight, String material) {
        super(id, price, model, size, weight, material);
        this.velocity = velocity;
        this.ability = ability;
    }

    public Blender(){
        velocity = 0;
        ability = 0; 
    }

    public String toString() {
        return "Blender{" + super.toString() + "velocity=" + velocity + ", ability=" + ability + '}';
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
    /*
    @Override*/
    public void buy(int amount) {
        System.out.println("The product was bought for -> " + amount);
    }
    
/*
    @Override*/
    public void sell(int amount) {
        System.out.println("The product was sold "+ amount);
    }
/*
    @Override*/
    public void toStock() {
        System.out.println("The product is in stock");
    }
/*
    @Override*/
    public Gain generateprofit() {
        return new Gain();
    }
    
}
