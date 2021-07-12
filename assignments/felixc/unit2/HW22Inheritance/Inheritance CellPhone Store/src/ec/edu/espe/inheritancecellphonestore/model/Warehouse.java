/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.inheritancecellphonestore.model;

import java.util.ArrayList;

/**
 *
 * @author 59399
 */
public class Warehouse {
   private int id;
   private float priceRange;
   private ArrayList < CellPhone> cellPhones =  new  ArrayList <> ();
   private ArrayList < Charger> chargers =  new  ArrayList <> ();
   private ArrayList < HeadPhone> headPhones =  new  ArrayList <> ();
   private ArrayList < PhoneCase> phoneCases =  new  ArrayList <> ();
   private ArrayList < ScreenProtector> screenProtectors =  new  ArrayList <> ();

    public Warehouse(int id, float priceRange) {
        this.id = id;
        this.priceRange = priceRange;
    }

    @Override
    public String toString() {
        return "Warehouse{" + "id=" + getId() + ", priceRange=" + getPriceRange() + ", cellPhones=" + getCellPhones() + ", chargers=" + getChargers() + ", headPhones=" + getHeadPhones() + ", phoneCases=" + getPhoneCases() + ", screenProtectors=" + getScreenProtectors() + '}';
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the priceRange
     */
    public float getPriceRange() {
        return priceRange;
    }

    /**
     * @param priceRange the priceRange to set
     */
    public void setPriceRange(float priceRange) {
        this.priceRange = priceRange;
    }

    /**
     * @return the cellPhones
     */
    public ArrayList < CellPhone> getCellPhones() {
        return cellPhones;
    }

    /**
     * @param cellPhones the cellPhones to set
     */
    public void setCellPhones(ArrayList < CellPhone> cellPhones) {
        this.cellPhones = cellPhones;
    }

    /**
     * @return the chargers
     */
    public ArrayList < Charger> getChargers() {
        return chargers;
    }

    /**
     * @param chargers the chargers to set
     */
    public void setChargers(ArrayList < Charger> chargers) {
        this.chargers = chargers;
    }

    /**
     * @return the headPhones
     */
    public ArrayList < HeadPhone> getHeadPhones() {
        return headPhones;
    }

    /**
     * @param headPhones the headPhones to set
     */
    public void setHeadPhones(ArrayList < HeadPhone> headPhones) {
        this.headPhones = headPhones;
    }

    /**
     * @return the phoneCases
     */
    public ArrayList < PhoneCase> getPhoneCases() {
        return phoneCases;
    }

    /**
     * @param phoneCases the phoneCases to set
     */
    public void setPhoneCases(ArrayList < PhoneCase> phoneCases) {
        this.phoneCases = phoneCases;
    }

    /**
     * @return the screenProtectors
     */
    public ArrayList < ScreenProtector> getScreenProtectors() {
        return screenProtectors;
    }

    /**
     * @param screenProtectors the screenProtectors to set
     */
    public void setScreenProtectors(ArrayList < ScreenProtector> screenProtectors) {
        this.screenProtectors = screenProtectors;
    }
   
   
    
}
