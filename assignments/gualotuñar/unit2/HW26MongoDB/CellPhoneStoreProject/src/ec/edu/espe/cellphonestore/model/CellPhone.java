/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cellphonestore.model;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import static ec.edu.espe.cellphonestore.view.CellPhoneStore.createConection;

/**
 *
 * @author InnovaCode
 */
public class CellPhone extends Products{
    private String color;
    private String model;

    public CellPhone(String color, String model, int id, float price, String brand, int stock) {
        super(id, price, brand, stock);
        this.color = color;
        this.model = model;
    }
    
    public static void addCellphone(String color, String model, int id, float price, String brand, int stock){
        MongoClient conection = createConection();
        DB db = conection.getDB("Products");
        DBCollection colection = db.getCollection("Cellphone");
        BasicDBObject document = new BasicDBObject();
        document.put("Id",id);
        document.put("Brand",brand);
        document.put("Model",model);
        document.put("Color",color);
        document.put("Price",price);
        document.put("Stock",stock);
        
        colection.insert(document);
    }
    
    public static void deleteCellphone(int id){
        MongoClient conection = createConection();
        DB db = conection.getDB("Products");
        DBCollection collection = db.getCollection("Cellphone");
        collection.remove(new BasicDBObject().append("Id", id));
    }
    
    public static void showColection(){
        MongoClient conection = createConection();
        DB db = conection.getDB("Products");
        DBCollection collection = db.getCollection("Cellphone");
        DBCursor cursor = collection.find();
        while(cursor.hasNext()){
            System.out.println("* " + cursor.next().get("Brand") + " - " + cursor.curr().get("Model") + " - " + cursor.curr().get("Color") + " - " + cursor.curr().get("Price"));
        }
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

}

