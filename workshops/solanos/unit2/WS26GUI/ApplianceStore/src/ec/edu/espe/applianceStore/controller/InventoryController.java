/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.applianceStore.controller;

import ec.edu.espe.applianceStore.model.Employees;
import ec.edu.espe.applianceStore.model.Inventory;
import ec.edu.espe.applianceStore.view.FrmInventory;
import java.util.ArrayList;
import utils.DBManager;
import utils.Persistence;

/**
 *
 * @author Sebastian Solano NullPunters ESPE-DCCO
 */
public class InventoryController {
    private Inventory inventory;
    private FrmInventory frmInventory; 
    private ArrayList<Employees> employees;
    private Persistence dataManager = new DBManager();
    
    public void addInventory (Inventory inventory){
        //TODO read inventory (list) from database
        //TODO add contact to database
        //using the utils class
        
        String inventoryJson= "{}";
        dataManager.create(inventoryJson, "inventory");
        
    }

    public Inventory readInventory(){
        ArrayList<Inventory> inventorys = new ArrayList<>();
        //TODO read inventory from database
        //TODO ude the utils class
       /* Inventory inventory = new Inventory("dell", "sony", "boster", "oster", "lg", "big", "oster", 12-02-13, 13);
        inventorys.add(inventory);
        return inventory;*/
    }
    
    
    
    ArrayList<Inventory> findContact(String LastName){
        Inventory inventory = new Inventory("dell", "sony", "boster", "oster", "lg", "big", "oster", 12-02-13, 13);
        inventorys.add(inventory);
        return inventory;
    }
    /*
    Inventory findInventory(String id);
    
    boolean removeInventory(String fullName);
    
    void updateInventory (string fullName, Inventory inventory);
    
    
    */
    
    public InventoryController(Inventory inventory, FrmInventory frmInventory, ArrayList<Employees> employees) {
        this.inventory = inventory;
        this.frmInventory = frmInventory;
        this.employees = employees;
    }
    
   
    
    /**
     * @return the inventory
     */
    public Inventory getInventory() {
        return inventory;
    }

    /**
     * @param inventory the inventory to set
     */
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    /**
     * @return the frmInventory
     */
    public FrmInventory getFrmInventory() {
        return frmInventory;
    }

    /**
     * @param frmInventory the frmInventory to set
     */
    public void setFrmInventory(FrmInventory frmInventory) {
        this.frmInventory = frmInventory;
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
    
    
}
