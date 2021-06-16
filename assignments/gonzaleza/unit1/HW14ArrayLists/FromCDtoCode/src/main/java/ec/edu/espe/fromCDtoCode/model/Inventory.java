/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.fromCDtoCode.model;

import java.util.ArrayList;

/**
 *
 * @author InnovaCode ESPE-DCCO
 */
public class Inventory {
    private ArrayList <CellphoneStore> cellphoneStores = new ArrayList<>();
    
    public CellphoneStore determinateIfThereIsStock(Cellphone cellphones){
        return new CellphoneStore();
    }

    /**
     * @return the cellphoneStores
     */
    public ArrayList <CellphoneStore> getCellphoneStores() {
        return cellphoneStores;
    }

    /**
     * @param cellphoneStores the cellphoneStores to set
     */
    public void setCellphoneStores(ArrayList <CellphoneStore> cellphoneStores) {
        this.cellphoneStores = cellphoneStores;
    }
}
