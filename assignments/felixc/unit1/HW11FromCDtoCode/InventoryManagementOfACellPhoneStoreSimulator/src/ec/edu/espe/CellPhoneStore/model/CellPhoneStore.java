/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.CellPhoneStore.model;

import java.util.ArrayList;

/**
 *
 * @author Cristian Felix InnovaCode ESPE-DCCO
 */
public class CellPhoneStore {
    ArrayList <CellPhone> cellPhones =  new  ArrayList <> ();
    ArrayList <EarPod> earPods =  new  ArrayList <> ();
    ArrayList <DataCable> dataCable =  new  ArrayList <> ();
    ArrayList <Charger> chargers =  new  ArrayList <> ();
    ArrayList <MemoryCard> memoryCards =  new  ArrayList <> ();
    ArrayList <Case> cases =  new  ArrayList <> ();
    ArrayList <Screen> screens = new ArrayList <>();
    
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
    
}