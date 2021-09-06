/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.speaker.model;

import com.mongodb.BasicDBObject;

/**
 *
 * @author Asmal Kevin
 */
public class speakerDAO {
    public void insertSpeaker(Speaker s){
        Conexion con = new Conexion();
        BasicDBObject documento = new BasicDBObject();
        documento.put("id","'" +s.getId()+ "'");
        documento.put("power","'" +s.getPower()+ "'");
        documento.put("price","'" +s.getPrice()+ "'");
        documento.put("model","'" +s.getModel()+ "'");
        documento.put("brand","'" +s.getBrand()+ "'");
        documento.put("bluetooth","'" +s.getBluetooth()+ "'");
        con.coleccion.insert(documento);
    }
}
