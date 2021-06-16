/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.CellPhoneStore.model;

/**
 *
 * @author 59399
 */
public class CellPhoneStoreInCharge {
    private String name;
    private CellPhoneStore store;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the store
     */
    public CellPhoneStore getStore() {
        return store;
    }

    /**
     * @param store the store to set
     */
    public void setStore(CellPhoneStore store) {
        this.store = store;
    }
    
}
