/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cliente.model;

import com.mongodb.BasicDBObject;

/**
 *
* @author Lizbeth Cajas
 */
public class ClientDAO {
    public void insertClient(Client c){
        Conexion con = new Conexion();
        BasicDBObject documento = new BasicDBObject();
        documento.put("id","'" +c.getId()+ "'");
        documento.put("name","'" +c.getName()+ "'");
        documento.put("age","'" +c.getAge()+ "'");
        con.coleccion.insert(documento);
    }
}
