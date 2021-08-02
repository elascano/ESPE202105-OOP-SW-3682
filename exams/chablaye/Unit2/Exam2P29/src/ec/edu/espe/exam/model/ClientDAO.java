/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam.model;

import com.mongodb.BasicDBObject;

/**
 *
 * @author Esteban Chablay EMCL. Java ESPE-DCCO
 */
public class ClientDAO {
    public void insertClient(Client c){
        Conexion con = new Conexion();
        BasicDBObject documento = new BasicDBObject();
        documento.put("password","'" +c.getPassword()+ "'");
        documento.put("name","'" +c.getName()+ "'");
        con.coleccion.insert(documento);
    }
}
