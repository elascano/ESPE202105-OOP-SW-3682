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
public class Kitchen extends Products{

    private String color;
    private int knobs;
    
    public Kitchen(int id, float price, String model, float size, float weight, String material,String color, int knobs) {
        super(id, price, model, size, weight, material);
        this.color=color;
        this.knobs=knobs;
    }

    public Kitchen(){
        
        color = "";
        knobs = 0;
    }
    
    @Override
    public String toString() {
        return "Kitchen{" + super.toString() + "color=" + getColor() + "knobs=" + getKnobs() + '}';
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
     * @return the knobs
     */
    public int getKnobs() {
        return knobs;
    }

    /**
     * @param knobs the color to set
     */
    public void setKnobs(int knobs) {
        this.knobs =  knobs;
    }
    
}
