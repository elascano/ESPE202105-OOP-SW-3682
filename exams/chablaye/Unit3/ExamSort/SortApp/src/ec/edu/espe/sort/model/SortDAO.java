/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sort.model;

import com.mongodb.BasicDBObject;
import ec.edu.espe.sort.view.SortFrm;

/**
 *
 * @author Esteban Chablay EMCL. Java ESPE-DCCO
 */
public class SortDAO {
    public void addNumber(int data[], int numero, int elementos){  
        Conexion con = new Conexion();
        Sort c = new Sort();
        BasicDBObject documento = new BasicDBObject();
        documento.put("numbers","'" +c.getNumbers()+ "'");
        documento.put("algorithm","'" +c.getAlgorithm()+ "'");
        documento.put("sort","'" +c.getSort()+ "'");
        con.coleccion.insert(documento);
    }
    
    
    public void orderNumbers(int data[]){
        int size;
        SortingContext sc = new SortingContext();
        int sortedList[] = sc.sort(data);
        size = sortedList.length;
        for(int i=0;i<size;i++){
            System.out.println(sortedList[i] + " - ");
        }

    }
}
