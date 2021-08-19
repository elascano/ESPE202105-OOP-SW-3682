/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.conexionmongodb;

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
 * @author Steven Achig FutureProgrammers ESPE-DCCO
 */
public class Connection {
    DB DataBase;
    DBCollection collection;
    BasicDBObject document = new BasicDBObject();
    
    public Connection(){
        try {
          Mongo mongo = new Mongo("localhost", 27017);
          DataBase = mongo.getDB("myDataBase");
          collection = DataBase.getCollection("products");
            System.out.println("Connect to database succesfully");
        } catch (UnknownHostException except) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, except);
        }
    }
    
    public boolean insert(String action){
        document.put("action", action);
        collection.insert(document);
        return true;
    }
    
    public void show(){
        DBCursor cursor = collection.find();
        while(cursor.hasNext()){
            System.out.println(cursor.next());
        }
    }
    
    public boolean actualize(String oldAction, String newAction){
        document.put("action", oldAction);
        BasicDBObject newDocument = new BasicDBObject();
        newDocument.put("action", newAction);
        collection.findAndModify(document, newDocument);
        return true;
    }
    
    public boolean delete(String action){
        document.append("action", action);
        collection.remove(document);
        return true;
    }
}
