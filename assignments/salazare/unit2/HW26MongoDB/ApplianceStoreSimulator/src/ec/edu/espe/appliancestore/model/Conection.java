/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.appliancestore.model;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Salazar Matthew NullPointers ESPE-DCC
 */
public class Conection {
    DB database;
    DBCollection coleccion;
    
    BasicDBObject document  = new BasicDBObject();
    
    public Conection(){
        try{
           Mongo mongo = new Mongo("localhost",27017); 
           database = mongo.getDB("ApplianceStore");
           coleccion = database.getCollection("Products");
            System.out.println("Connect to database successfully");
           
        }catch (UnknownHostException ex){
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    public boolean insert(String accion) {
        document.put("accion",accion);
        coleccion.insert(document);
        return true;
    }
    
    public void show(){
        DBCursor cursor = coleccion.find();
        while(cursor.hasNext()){
            System.out.println(cursor.hasNext());
        }
    }
    
    public boolean update(String oldStock,String newStock){
        document.put("accion",oldStock);
        BasicDBObject documentNew = new BasicDBObject();
        documentNew.put("accion",newStock);
        coleccion.findAndModify(document, documentNew);
        return true;
    }
    
    public boolean delete(String accion){
        document.put("accion", accion);
        coleccion.remove(document);
        return true;
    }
}
