/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cellphonestore.model;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import static ec.edu.espe.cellphonestore.view.CellPhoneStore.createConection;

/**
 *
 * @author InnovaCode ESPE-DCCO
 */
public class PhoneCase extends Products {
    private String color;
    private String model;
    private String material;
    
    public static void addPhoneCase(String color, String model, int id, float price, String brand, int stock){
        MongoClient conection = createConection();
        DB db = conection.getDB("Products");
        DBCollection colection = db.getCollection("PhoneCase");
        BasicDBObject document = new BasicDBObject();
        document.put("Id",id);
        document.put("Brand",brand);
        document.put("Model",model);
        document.put("Color",color);
        document.put("Price",price);
        document.put("Stock",stock);        
        
        colection.insert(document);
    }
    
    public static void deletePhoneCase(int id){
        MongoClient conection = createConection();
        DB db = conection.getDB("Products");
        DBCollection colection = db.getCollection("PhoneCase");
        colection.remove(new BasicDBObject().append("Id", id));
    }

    public PhoneCase(String color, String model, String material, int id, float price, String brand, int stock) {
        super(id, price, brand, stock);
        this.color = color;
        this.model = model;
        this.material = material;
    }

    public String getMaterial() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getColor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }

}
