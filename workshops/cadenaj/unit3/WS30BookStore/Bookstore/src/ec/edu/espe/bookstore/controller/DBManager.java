/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bookstore.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Steven Achig Future Programmers ESPE-DCCO
 */
public class DBManager {
    DB DataBase;
    DBCollection collection;
    BasicDBObject document = new BasicDBObject();
    DBCursor cursor;

    public DBManager(){
        try {
          Mongo mongo = new Mongo("localhost", 27017);
          DataBase = mongo.getDB("Bookstore");
            System.out.println("Connect to database succesfully");
        } catch (UnknownHostException except) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, except);
        }
    }

    public DBManager(String collections){
        try {
          Mongo mongo = new Mongo("localhost", 27017);
          DataBase = mongo.getDB("Bookstore");
          collection = DataBase.getCollection(collections);
          cursor = collection.find();
        } catch (UnknownHostException except) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, except);
        }
    }
    
    public boolean insert(BasicDBObject document){
        collection.insert(document);
        return true;
    }
    
    public void show(){
        DBCursor cursor = collection.find();
        while(cursor.hasNext()){
            System.out.println(cursor.next());
        }
    }
    
    public boolean actualize(String oldData, String newData){
        document.put("data", oldData);
        BasicDBObject newDocument = new BasicDBObject();
        newDocument.put("data", newData);
        collection.findAndModify(document, newDocument);
        return true;
    }
    
    public boolean delete(String data){
        document.append("data", data);
        collection.remove(document);
        return true;
    }
}
