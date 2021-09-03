/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model.invoice;

/**
 *
 * @author Eduardo Mortensen The Programers
 */
public class Invoice {
    
    private static Invoice instance;
    private float taxPercentage;
    private DB db;
    private DBCollection table;
    private DBCollection tableP;
    private DBCursor cursor = null;
    private BasicDBObject document = new BasicDBObject();
    
}
