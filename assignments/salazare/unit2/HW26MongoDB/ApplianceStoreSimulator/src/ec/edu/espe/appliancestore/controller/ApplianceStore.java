/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestore.controller;

import ec.edu.espe.appliancestore.model.Blender;
import ec.edu.espe.appliancestore.model.CoffeeMaker;
import ec.edu.espe.appliancestore.model.Computer;
import ec.edu.espe.appliancestore.model.DVD;
import ec.edu.espe.appliancestore.model.Microwave;
import ec.edu.espe.appliancestore.model.TV;
import ec.edu.espe.appliancestore.model.Toaster;
import java.util.ArrayList;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public abstract class  ApplianceStore implements Appliance {
   int serialNumber;
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
   
   
   
   
    @Override
   public void addMicroave(Object microwave){
       microwaves.add((Microwave) microwave);
    }
    @Override
   public void addToaster(Object toaster){
       toasters.add((Toaster) toaster);
    }
    @Override
   public void addBlender(Object blender){
       blenders.add((Blender) blender);
    }
    @Override
   public void addCoffeeMarker(Object coffeeMaker){
       coffemakers.add((CoffeeMaker) coffeeMaker);
    }
    @Override
   public void addTv(Object tv){
       tvs.add((TV) tv);
    }
    @Override
   public void addDvd(Object dvd){
      dvds.add((DVD) dvd);
    }
    @Override
   public void addComputer(Object computer){
      computers.add((Computer) computer);
    }
    @Override
   public void remove(Object object){
   }

    /**
     * @return the serialnumber
     */
    @Override
    public int getSerialnumber() {
        return serialNumber;
    }

    /**
     * @param serialnumber the serialnumber to set
     */
    @Override
    public void setSerialnumber(int serialnumber) {
        this.serialNumber = serialnumber;
    }

    /**
     * @return the microwaves
     */
    @Override
    public ArrayList < Microwave> getMicrowaves() {
        return microwaves;
    }

    /**
     * @param microwaves the microwaves to set
     */
    @Override
    public void setMicrowaves(ArrayList < Microwave> microwaves) {
        this.microwaves = microwaves;
    }

    /**
     * @return the toasters
     */
    @Override
    public ArrayList < Toaster> getToasters() {
        return toasters;
    }

    /**
     * @param toasters the toasters to set
     */
    @Override
    public void setToasters(ArrayList < Toaster> toasters) {
        this.toasters = toasters;
    }

    /**
     * @return the blenders
     */
    @Override
    public ArrayList < Blender> getBlenders() {
        return blenders;
    }

    /**
     * @param blenders the blenders to set
     */
    @Override
    public void setBlenders(ArrayList < Blender> blenders) {
        this.blenders = blenders;
    }

    /**
     * @return the coffemakers
     */
    @Override
    public ArrayList < CoffeeMaker> getCoffemakers() {
        return coffemakers;
    }

    /**
     * @param coffemakers the coffemakers to set
     */
    @Override
    public void setCoffemakers(ArrayList < CoffeeMaker> coffemakers) {
        this.coffemakers = coffemakers;
    }

    /**
     * @return the tvs
     */
    @Override
    public ArrayList < TV> getTvs() {
        return tvs;
    }

    /**
     * @param tvs the tvs to set
     */
    @Override
    public void setTvs(ArrayList < TV> tvs) {
        this.tvs = tvs;
    }

    /**
     * @return the dvds
     */
    @Override
    public ArrayList < DVD> getDvds() {
        return dvds;
    }

    /**
     * @param dvds the dvds to set
     */
    @Override
    public void setDvds(ArrayList < DVD> dvds) {
        this.dvds = dvds;
    }

    /**
     * @return the computers
     */
    @Override
    public ArrayList < Computer> getComputers() {
        return computers;
    }

    /**
     * @param computers the computers to set
     */
    @Override
    public void setComputers(ArrayList < Computer> computers) {
        this.computers = computers;
    }
     /**
     * @return the price
     */
    @Override
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    @Override
    public void setPrice(float price) {
        this.price = price;
    }
      
    
}
