/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.applianceStore.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Sebastian Solano NullPunters ESPE-DCCO
 */
public class Inventory {
    
    private String computer;
    private String dvd;
    private String blender;
    private String toster;
    private String tv;
    private String description;
    private String coffeMaker;
    private ArrayList<Employees> employees = new ArrayList<>();
    private Date manufacturing;
    private int numberunits;
    

    public Inventory(String computer, String dvd, String blender, String toster, String tv, String description, String coffeMaker, Date manufacturing, int numberunits) {
        this.computer = computer;
        this.dvd = dvd;
        this.blender = blender;
        this.toster = toster;
        this.tv = tv;
        this.description = description;
        this.coffeMaker = coffeMaker;
        this.manufacturing = manufacturing;
        this.numberunits = numberunits;
    }
    

    /**
     * @return the computer
     */
    public String getComputer() {
        return computer;
    }

    /**
     * @param computer the computer to set
     */
    public void setComputer(String computer) {
        this.computer = computer;
    }

    /**
     * @return the dvd
     */
    public String getDvd() {
        return dvd;
    }

    /**
     * @param dvd the dvd to set
     */
    public void setDvd(String dvd) {
        this.dvd = dvd;
    }

    /**
     * @return the blender
     */
    public String getBlender() {
        return blender;
    }

    /**
     * @param blender the blender to set
     */
    public void setBlender(String blender) {
        this.blender = blender;
    }

    /**
     * @return the toster
     */
    public String getToster() {
        return toster;
    }

    /**
     * @param toster the toster to set
     */
    public void setToster(String toster) {
        this.toster = toster;
    }

    /**
     * @return the tv
     */
    public String getTv() {
        return tv;
    }

    /**
     * @param tv the tv to set
     */
    public void setTv(String tv) {
        this.tv = tv;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the coffeMaker
     */
    public String getCoffeMaker() {
        return coffeMaker;
    }

    /**
     * @param coffeMaker the coffeMaker to set
     */
    public void setCoffeMaker(String coffeMaker) {
        this.coffeMaker = coffeMaker;
    }

    /**
     * @return the employees
     */
    public ArrayList<Employees> getEmployees() {
        return employees;
    }

    /**
     * @param employees the employees to set
     */
    public void setEmployees(ArrayList<Employees> employees) {
        this.employees = employees;
    }

    /**
     * @return the manufacturing
     */
    public Date getManufacturing() {
        return manufacturing;
    }

    /**
     * @param manufacturing the manufacturing to set
     */
    public void setManufacturing(Date manufacturing) {
        this.manufacturing = manufacturing;
    }

    /**
     * @return the numberunits
     */
    public int getNumberunits() {
        return numberunits;
    }

    /**
     * @param numberunits the numberunits to set
     */
    public void setNumberunits(int numberunits) {
        this.numberunits = numberunits;
    }

    public void add(Inventory inventory) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
