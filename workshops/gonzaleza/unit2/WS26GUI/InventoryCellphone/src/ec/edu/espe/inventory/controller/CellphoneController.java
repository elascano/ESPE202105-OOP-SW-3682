/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.inventory.controller;

import ec.edu.espe.inventory.model.Cellphone;
import ec.edu.espe.inventory.model.Phonecase;
import ec.edu.espe.inventory.view.FrmCellphone;
import java.time.LocalDateTime;
import java.util.ArrayList;
import utils.DBManager;
import utils.Persistence;

/**
 *
 * @author Ariel Gonzalez InnovaCode ESPE-DCCO
 */
public class CellphoneController {
    private Cellphone cellphone;
    private FrmCellphone frmCellphone;
    private ArrayList<Phonecase> phonecases;
    private Persistence dataManager = new DBManager();

    public void addCellphone(Cellphone cellphone){
        //TODO read cellphones (list) from database
        //TODO add cellphone to database
        //using the utils class
        
        //TODO cellphone sent to database
        String cellphoneJson = "{}";
        dataManager.create(cellphoneJson, "Cellphones");
    }
    
    public ArrayList<Cellphone> readCellphone(){
        ArrayList<Cellphone> cellphones = new ArrayList<>();
        //TODO read cellphones from database
        //TODO use the utils class
        Cellphone cellphone = new Cellphone("Xiaomi", "Blue", 230.34F, 0, "Redmi Note 8", "", 0, LocalDateTime.MIN);
        cellphones.add(cellphone);
        cellphone = new Cellphone("Samsung", "Black", 420.5F, 0, "Galaxy S20", "", 0, LocalDateTime.MIN);
        cellphones.add(cellphone);
        return cellphones;
    }
    
    ArrayList<Cellphone> findCellphone(String dataToSearch){
        ArrayList<Cellphone> cellphones = new ArrayList<>();
        //TODO find in database
        //TODO call our utils to find the cellphone in the database
        Cellphone cellphone = new Cellphone("Xiaomi", "Blue", 230.34F, 0, "Redmi Note 8", "", 0, LocalDateTime.MIN);
        cellphones.add(cellphone);
        return cellphones;
    }
    
    //Contact findCellphone(String id);
    
    boolean removeCellphone(String data){
        //TODO findCellphone(data)
        //TODOverify what cellphone to remove
        return true;
    }
    
    void uptadeCellphone(String data, Cellphone cellphone){
        //TODO update the cellphone in the database
    }
    
    public CellphoneController(Cellphone cellphone, FrmCellphone frmCellphone, ArrayList<Phonecase> phonecases) {
        this.cellphone = cellphone;
        this.frmCellphone = frmCellphone;
        this.phonecases = phonecases;
    }

    /**
     * @return the cellphone
     */
    public Cellphone getCellphone() {
        return cellphone;
    }

    /**
     * @param cellphone the cellphone to set
     */
    public void setCellphone(Cellphone cellphone) {
        this.cellphone = cellphone;
    }

    /**
     * @return the frmCellphone
     */
    public FrmCellphone getFrmCellphone() {
        return frmCellphone;
    }

    /**
     * @param frmCellphone the frmCellphone to set
     */
    public void setFrmCellphone(FrmCellphone frmCellphone) {
        this.frmCellphone = frmCellphone;
    }

    /**
     * @return the phonecases
     */
    public ArrayList<Phonecase> getPhonecases() {
        return phonecases;
    }

    /**
     * @param phonecases the phonecases to set
     */
    public void setPhonecases(ArrayList<Phonecase> phonecases) {
        this.phonecases = phonecases;
    }
    
}
