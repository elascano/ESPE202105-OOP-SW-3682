/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestore.model;

import java.util.ArrayList;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class ApplianceStore {
   private int serialNumber;
   private float price;
   private ArrayList < Microwave> microwaves =  new  ArrayList <> ();
   private ArrayList < Toaster> toasters =  new  ArrayList <> ();
   private ArrayList < Blender> blenders =  new  ArrayList <> ();
   private ArrayList < CoffeeMaker> coffemakers =  new  ArrayList <> ();
   private ArrayList < TV> tvs =  new  ArrayList <> ();
   private ArrayList < DVD> dvds =  new  ArrayList <> ();
   private ArrayList < Computer> computers =  new  ArrayList <> ();
   
    public ApplianceStore(int serialNumber, float price) {
        this.serialNumber = serialNumber;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ApplianceStore{" + "serialNumber=" + serialNumber + ", price=" + price +'}';
    }
   
   
   
   
   public void addMicroave(Object microwave){
       microwaves.add((Microwave) microwave);
    }
   public void addToaster(Object toaster){
       toasters.add((Toaster) toaster);
    }
   public void addBlender(Object blender){
       blenders.add((Blender) blender);
    }
   public void addCoffeeMarker(Object coffeeMaker){
       coffemakers.add((CoffeeMaker) coffeeMaker);
    }
   public void addTv(Object tv){
       tvs.add((TV) tv);
    }
   public void addDvd(Object dvd){
      dvds.add((DVD) dvd);
    }
   public void addComputer(Object computer){
      computers.add((Computer) computer);
    }
   public void remove(Object object){
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
     * @return the microwaves
     */
    public ArrayList < Microwave> getMicrowaves() {
        return microwaves;
    }

    /**
     * @param microwaves the microwaves to set
     */
    public void setMicrowaves(ArrayList < Microwave> microwaves) {
        this.microwaves = microwaves;
    }

    /**
     * @return the toasters
     */
    public ArrayList < Toaster> getToasters() {
        return toasters;
    }

    /**
     * @param toasters the toasters to set
     */
    public void setToasters(ArrayList < Toaster> toasters) {
        this.toasters = toasters;
    }

    /**
     * @return the blenders
     */
    public ArrayList < Blender> getBlenders() {
        return blenders;
    }

    /**
     * @param blenders the blenders to set
     */
    public void setBlenders(ArrayList < Blender> blenders) {
        this.blenders = blenders;
    }

    /**
     * @return the coffemakers
     */
    public ArrayList < CoffeeMaker> getCoffemakers() {
        return coffemakers;
    }

    /**
     * @param coffemakers the coffemakers to set
     */
    public void setCoffemakers(ArrayList < CoffeeMaker> coffemakers) {
        this.coffemakers = coffemakers;
    }

    /**
     * @return the tvs
     */
    public ArrayList < TV> getTvs() {
        return tvs;
    }

    /**
     * @param tvs the tvs to set
     */
    public void setTvs(ArrayList < TV> tvs) {
        this.tvs = tvs;
    }

    /**
     * @return the dvds
     */
    public ArrayList < DVD> getDvds() {
        return dvds;
    }

    /**
     * @param dvds the dvds to set
     */
    public void setDvds(ArrayList < DVD> dvds) {
        this.dvds = dvds;
    }

    /**
     * @return the computers
     */
    public ArrayList < Computer> getComputers() {
        return computers;
    }

    /**
     * @param computers the computers to set
     */
    public void setComputers(ArrayList < Computer> computers) {
        this.computers = computers;
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
