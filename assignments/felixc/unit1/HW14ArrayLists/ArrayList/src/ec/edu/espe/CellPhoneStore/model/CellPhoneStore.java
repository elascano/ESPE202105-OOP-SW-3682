/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.CellPhoneStore.model;

import java.util.ArrayList;

/**
 *
 * @author 59399
 */
public class CellPhoneStore {
    private ArrayList <CellPhone> cellPhones =  new  ArrayList <> ();
    private ArrayList <EarPod> earPods =  new  ArrayList <> ();
    private ArrayList <DataCable> dataCable =  new  ArrayList <> ();
    private ArrayList <Charger> chargers =  new  ArrayList <> ();
    private ArrayList <MemoryCard> memoryCards =  new  ArrayList <> ();
    private ArrayList <Case> cases =  new  ArrayList <> ();
    private ArrayList <Screen> screens = new ArrayList <>();
    
    public CellPhone add(CellPhone celPhones){
        return new CellPhone();
    }
    public EarPod add(EarPod earPods){
        return new EarPod();
    }
    public DataCable add(DataCable dataCables){
        return new DataCable();
    }
    public Charger add(Charger chargers){
        return new Charger();
    }
    public MemoryCard add(MemoryCard memoryCards){
        return new MemoryCard();
    }
    public Case add(Case cases){
        return new Case();
    }
    public Screen add (Screen screens){
        return new Screen();
    }

    /**
     * @return the cellPhones
     */
    public ArrayList <CellPhone> getCellPhones() {
        return cellPhones;
    }

    /**
     * @param cellPhones the cellPhones to set
     */
    public void setCellPhones(ArrayList <CellPhone> cellPhones) {
        this.cellPhones = cellPhones;
    }

    /**
     * @return the earPods
     */
    public ArrayList <EarPod> getEarPods() {
        return earPods;
    }

    /**
     * @param earPods the earPods to set
     */
    public void setEarPods(ArrayList <EarPod> earPods) {
        this.earPods = earPods;
    }

    /**
     * @return the dataCable
     */
    public ArrayList <DataCable> getDataCable() {
        return dataCable;
    }

    /**
     * @param dataCable the dataCable to set
     */
    public void setDataCable(ArrayList <DataCable> dataCable) {
        this.dataCable = dataCable;
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
     * @return the memoryCards
     */
    public ArrayList <MemoryCard> getMemoryCards() {
        return memoryCards;
    }

    /**
     * @param memoryCards the memoryCards to set
     */
    public void setMemoryCards(ArrayList <MemoryCard> memoryCards) {
        this.memoryCards = memoryCards;
    }

    /**
     * @return the cases
     */
    public ArrayList <Case> getCases() {
        return cases;
    }

    /**
     * @param cases the cases to set
     */
    public void setCases(ArrayList <Case> cases) {
        this.cases = cases;
    }

    /**
     * @return the screens
     */
    public ArrayList <Screen> getScreens() {
        return screens;
    }

    /**
     * @param screens the screens to set
     */
    public void setScreens(ArrayList <Screen> screens) {
        this.screens = screens;
    }
    
}
