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
 * @author Esteban Chablay EMCL. Java ESPE-DCCO
 */
public class ConexionContact {
    public DB baseDatos;
    public DBCollection coleccion;
    public BasicDBObject documento = new BasicDBObject();
    public MongoClientURI uri = new MongoClientURI("mongodb+srv://Esteban:pooEspe123@cluster0.seaw1.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
    
    public ConexionContact()
    {
        try{
            MongoClient mongo = new MongoClient(uri);
            baseDatos = mongo.getDB("contactsBook");
            coleccion = baseDatos.getCollection("contacts");
            System.out.println("Conexion a base de datos exitoso.");
        }
        catch(Exception e)
        {
            
        }
    }
}
