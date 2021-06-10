/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theoretical.model;

import java.util.ArrayList;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class ApplianceStoreOwner {
    
    private String name;
    private int age;
    private ArrayList<ApplianceStore> stores = new ArrayList<>();
    
    public ApplianceStore add(ApplianceStore stores){
        return new ApplianceStore();
    }
}
