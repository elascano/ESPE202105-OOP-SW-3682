/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sanamedgui.model;

import java.util.Date;

/**
 *
 * @author Myckel Chamorro EMCL.java ESPE-DCCO
 */
public class Modification {
    private int id;
    private Date dateOfMod;
    private String description;

    public Modification(int id, Date dateOfMod, String description) {
        this.id = id;
        this.dateOfMod = dateOfMod;
        this.description = description;
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
     * @return the dateOfMod
     */
    public Date getDateOfMod() {
        return dateOfMod;
    }

    /**
     * @param dateOfMod the dateOfMod to set
     */
    public void setDateOfMod(Date dateOfMod) {
        this.dateOfMod = dateOfMod;
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
}
