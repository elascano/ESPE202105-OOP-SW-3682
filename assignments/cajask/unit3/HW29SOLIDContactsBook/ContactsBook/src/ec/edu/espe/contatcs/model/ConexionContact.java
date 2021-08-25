/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contatcs.model;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

/**
 *
 * @author Karla Cajas EMCL. Java ESPE-DCCO
 */
public class ConexionContact {
    public DB baseDatos;
    public DBCollection coleccion;
    public BasicDBObject documento = new BasicDBObject();
    public MongoClientURI uri = new MongoClientURI("mongodb+srv://karla123:mksa89717@cluster0.5213n.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
    
    public ConexionContact()
    {
        try{
            MongoClient mongo = new MongoClient(uri);
            baseDatos = mongo.getDB("ContacBook");
            coleccion = baseDatos.getCollection("contact");
            System.out.println("Conexion a base de datos exitoso.");
        }
        catch(Exception e)
        {
            
        }
    }
}
