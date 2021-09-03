/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.airport.model;

import com.mongodb.DBCursor;
import ec.edu.espe.airport.view.AirportFrm;

/**
 *
 * @author Esteban Chablay EMCL. Java ESPE-DCCO
 */
public class AircraftDAO {
    public void  showModels(){
        ConexionModel objCon = new ConexionModel();
        DBCursor cursor = objCon.coleccion.find();

        while(cursor.hasNext()){
            System.out.println(cursor.next());
            //vista.txtFieldDatos.setText((String) vista.txtFieldDatos.getText()+ "\n" +cursor.next().get("name"));
        }    
    }
    
    public void showSeating(){
        ConexionSeating objCon = new ConexionSeating();
        DBCursor cursor = objCon.coleccion.find();

        while(cursor.hasNext()){
            System.out.println(cursor.next());
            //vista.txtFieldDatos.setText((String) vista.txtFieldDatos.getText()+ "\n" +cursor.next().get("name"));
        }
    }
}
