/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Sebastian Solano NullPunters ESPE-DCCO
 */
public class MongoDB {
    private String cluster;
    private MongoClientURI uri;
    private MongoClient mongoClient;
    private MongoDatabase database; 
    private MongoCollection collection;

    public MongoDB() {
        cluster = "cloud.mongodb.com/v2/6100e02f62cc7776fd9f9040#metrics/replicaSet/61127b36457892036a7a19a2/explorer/Aircraft/Aircraft/find";
        uri = new MongoClientURI(cluster);
        mongoClient = new MongoClient(uri);
        database= mongoClient.getDatabase("Vehiculos");
        collection = database.getCollection("Model");
    }
    
}
