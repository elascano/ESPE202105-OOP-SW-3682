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
 * @author Salazar Matthew NullPointers ESPE-DCC
 */
public interface Appliance {

    void addBlender(Object blender);

    void addCoffeeMarker(Object coffeeMaker);

    void addComputer(Object computer);

    void addDvd(Object dvd);

    void addMicroave(Object microwave);

    void addToaster(Object toaster);

    void addTv(Object tv);

    /**
     * @return the blenders
     */
    ArrayList<Blender> getBlenders();

    /**
     * @return the coffemakers
     */
    ArrayList<CoffeeMaker> getCoffemakers();

    /**
     * @return the computers
     */
    ArrayList<Computer> getComputers();

    /**
     * @return the dvds
     */
    ArrayList<DVD> getDvds();

    /**
     * @return the microwaves
     */
    ArrayList<Microwave> getMicrowaves();

    /**
     * @return the price
     */
    float getPrice();

    /**
     * @return the serialnumber
     */
    int getSerialnumber();

    /**
     * @return the toasters
     */
    ArrayList<Toaster> getToasters();

    /**
     * @return the tvs
     */
    ArrayList<TV> getTvs();

    void remove(Object object);

    /**
     * @param blenders the blenders to set
     */
    void setBlenders(ArrayList<Blender> blenders);

    /**
     * @param coffemakers the coffemakers to set
     */
    void setCoffemakers(ArrayList<CoffeeMaker> coffemakers);

    /**
     * @param computers the computers to set
     */
    void setComputers(ArrayList<Computer> computers);

    /**
     * @param dvds the dvds to set
     */
    void setDvds(ArrayList<DVD> dvds);

    /**
     * @param microwaves the microwaves to set
     */
    void setMicrowaves(ArrayList<Microwave> microwaves);

    /**
     * @param price the price to set
     */
    void setPrice(float price);

    /**
     * @param serialnumber the serialnumber to set
     */
    void setSerialnumber(int serialnumber);

    /**
     * @param toasters the toasters to set
     */
    void setToasters(ArrayList<Toaster> toasters);

    /**
     * @param tvs the tvs to set
     */
    void setTvs(ArrayList<TV> tvs);

    String toString();
    
}
