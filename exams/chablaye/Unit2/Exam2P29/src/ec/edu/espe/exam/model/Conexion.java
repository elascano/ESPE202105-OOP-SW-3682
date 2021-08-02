/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.exam.model;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

/**
 *
 * @author Esteban Chablay EMCL. Java ESPE-DCCO
 */
public class Conexion {
    DB baseDatos;
    DBCollection coleccion;
    BasicDBObject documento = new BasicDBObject();
    
    public Conexion()
    {
        try{
            MongoClient mongo = new MongoClient("localhost", 27017);
            baseDatos = mongo.getDB("exam");
            coleccion = baseDatos.getCollection("clients");
            System.out.println("Conexion a base de datos exitoso.");
        }
        catch(Exception e)
        {
            
        }
    }
}
