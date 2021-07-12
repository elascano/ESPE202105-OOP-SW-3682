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
public class Computer extends Products{

    private float storage;
    private float power; 

    @Override
    public String toString() {
        return "Computer{" + super.toString() + "storage=" + storage + ", power=" + power + '}';
    }

    public Computer(int id, float price, String model, float size, float weight, String material, float storage,float power) {
        super(id, price, model, size, weight, material);
        this.storage = storage;
        this.power = power;
    }

    public Computer(){
        storage = 0.0F;
        power = 0.0F;
    }
    
    /**
     * @return the storage
     */
    public float getStorage() {
        return storage;
    }

    /**
     * @param storage the storage to set
     */
    public void setStorage(int storage) {
        this.storage = storage;
    }

    /**
     * @return the power
     */
    public float getPower() {
        return power;
    }

    /**
     * @param power the power to set
     */
    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void buy(int amount) {
        System.out.println("The product was bought");
    }

    @Override
    public void sell(int amount) {
        System.out.println("The product was sold");
    }

    @Override
    public void toStock() {
        System.out.println("The product is in stock");
    }

    @Override
    public Gain generateprofit() {
        return new Gain();
    }

}
