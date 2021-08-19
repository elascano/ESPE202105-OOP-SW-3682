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

    public int remove(int id) {
        return 0;
    }
  
}
