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
public class Toaster extends Products{

    public Toaster(int id, float price, String model, float size, float weight, String material) {
        super(id, price, model, size, weight, material);
    }

    @Override
    public String toString() {
        return "Toaster{" + super.toString() + '}';
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
