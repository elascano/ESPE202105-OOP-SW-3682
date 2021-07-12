/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cellphonestore.model;

import java.util.ArrayList;

/**
 *
 * @author InnovaCode
 */
public class Warehouse {
    private int id;
    
    
    private ArrayList<CellPhone> cellphones = new ArrayList<>();
    private ArrayList<PhoneCase> phoneCases = new ArrayList<>();
    private ArrayList<Charger> chargers = new ArrayList<>();
    private ArrayList<HeadPhone> headPhones = new ArrayList<>();
    private ArrayList<ScreenProtector> screenProtectors = new ArrayList<>();

    public CellPhone add(CellPhone cellPhones) {
        return new CellPhone(id, id, "");
    }
    
    public Charger add(Charger chargers) {
        return new Charger(id, id, "");
    }
    
    public HeadPhone add(HeadPhone headPhones) {
        return new HeadPhone(id, id, "");
    }
    
    public PhoneCase add(PhoneCase phoneCases) {
        return new PhoneCase(id, id, "");
    }
    
    public ScreenProtector add(ScreenProtector screenProtectors) {
        return new ScreenProtector(id, id, "");
    }

    public int remove(int id) {
        return 0;
    }

   
  
}
