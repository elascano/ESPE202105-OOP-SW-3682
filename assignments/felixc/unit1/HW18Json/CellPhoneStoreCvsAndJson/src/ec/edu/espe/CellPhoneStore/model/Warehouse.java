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
public class Warehouse {

    private int id;
    ArrayList<CellPhone> cellPhones = new ArrayList<>();

    public CellPhone add(CellPhone cellPhones) {
        return new CellPhone();
    }

    public int remove(int serialnumber) {
        return 0;
    }

}
