/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.fromCDtoCode.model;

import java.util.ArrayList;

/**
 *
 * @author InnovaCode ESPE-DCCO
 */
public class Time {
    private float timeSinceBuyed;
    private float timeBeingSelled;
    private ArrayList <Cellphone> cellphones = new ArrayList<>();
    private ArrayList <HeadPhone> headphones = new ArrayList<>();
    private ArrayList <ScreenProtector> screenProtectors = new ArrayList<>();
    private ArrayList <Charger> chargers = new ArrayList<>();
    private ArrayList <PhoneCase> phoneCases = new ArrayList<>();
    
    public float calculateTimeInStock(){
        return 0;
    }

    /**
     * @return the timeSinceBuyed
     */
    public float getTimeSinceBuyed() {
        return timeSinceBuyed;
    }

    /**
     * @param timeSinceBuyed the timeSinceBuyed to set
     */
    public void setTimeSinceBuyed(float timeSinceBuyed) {
        this.timeSinceBuyed = timeSinceBuyed;
    }

    /**
     * @return the timeBeingSelled
     */
    public float getTimeBeingSelled() {
        return timeBeingSelled;
    }

    /**
     * @param timeBeingSelled the timeBeingSelled to set
     */
    public void setTimeBeingSelled(float timeBeingSelled) {
        this.timeBeingSelled = timeBeingSelled;
    }

    /**
     * @return the cellphones
     */
    public ArrayList <Cellphone> getCellphones() {
        return cellphones;
    }

    /**
     * @param cellphones the cellphones to set
     */
    public void setCellphones(ArrayList <Cellphone> cellphones) {
        this.cellphones = cellphones;
    }

    /**
     * @return the headphones
     */
    public ArrayList <HeadPhone> getHeadphones() {
        return headphones;
    }

    /**
     * @param headphones the headphones to set
     */
    public void setHeadphones(ArrayList <HeadPhone> headphones) {
        this.headphones = headphones;
    }

    /**
     * @return the screenProtectors
     */
    public ArrayList <ScreenProtector> getScreenProtectors() {
        return screenProtectors;
    }

    /**
     * @param screenProtectors the screenProtectors to set
     */
    public void setScreenProtectors(ArrayList <ScreenProtector> screenProtectors) {
        this.screenProtectors = screenProtectors;
    }

    /**
     * @return the chargers
     */
    public ArrayList <Charger> getChargers() {
        return chargers;
    }

    /**
     * @param chargers the chargers to set
     */
    public void setChargers(ArrayList <Charger> chargers) {
        this.chargers = chargers;
    }

    /**
     * @return the phoneCases
     */
    public ArrayList <PhoneCase> getPhoneCases() {
        return phoneCases;
    }

    /**
     * @param phoneCases the phoneCases to set
     */
    public void setPhoneCases(ArrayList <PhoneCase> phoneCases) {
        this.phoneCases = phoneCases;
    }
}
