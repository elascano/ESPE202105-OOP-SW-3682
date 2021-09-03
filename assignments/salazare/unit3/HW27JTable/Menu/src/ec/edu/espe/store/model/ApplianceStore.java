/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.store.model;


import java.util.ArrayList;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public abstract class ApplianceStore {
   private int serialNumber;
   private float price;
   ArrayList < Microwave> microwaves =  new  ArrayList <> ();
   ArrayList < Toaster> toasters =  new  ArrayList <> ();
   ArrayList < Blender> blenders =  new  ArrayList <> ();
   ArrayList < CoffeeMaker> coffemakers =  new  ArrayList <> ();
   ArrayList < TV> tvs =  new  ArrayList <> ();
   ArrayList < DVD> dvds =  new  ArrayList <> ();
   ArrayList < Computer> computers =  new  ArrayList <> ();

    public ApplianceStore(int serialNumber, float price) {
        this.serialNumber = serialNumber;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ApplianceStore{" + "serialNumber=" + serialNumber + ", price=" + price +'}';
    }
   
        
      /**
     * @return the serialnumber
     */
    public int getSerialnumber() {
        return serialNumber;
    }

    /**
     * @param serialnumber the serialnumber to set
     */
    public void setSerialnumber(int serialnumber) {
        this.serialNumber = serialnumber;
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
     
    
}
