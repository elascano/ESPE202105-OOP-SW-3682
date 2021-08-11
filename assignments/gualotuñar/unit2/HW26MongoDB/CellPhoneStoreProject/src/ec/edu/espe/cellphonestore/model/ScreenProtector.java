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
public class ScreenProtector extends Products {
    
    private String material;
    private String model;
    
    public static void addScreenProtector(String material, String model, int id, float price, String brand, int stock){
        MongoClient conection = createConection();
        DB db = conection.getDB("Products");
        DBCollection colection = db.getCollection("ScreenProtector");
        BasicDBObject document = new BasicDBObject();
        document.put("Id",id);
        document.put("Brand",brand);
        document.put("Model",model);
        document.put("Material",material);
        document.put("Price",price);
        document.put("Stock",stock);        
        
        colection.insert(document);
    }
    
    public static void deleteScreenProtector(int id){
        MongoClient conection = createConection();
        DB db = conection.getDB("Products");
        DBCollection colection = db.getCollection("ScreenProtector");
        colection.remove(new BasicDBObject().append("Id", id));
    }

    public ScreenProtector(String material, String model, int id, float price, String brand, int stock) {
        super(id, price, brand, stock);
        this.material = material;
        this.model = model;
    }

    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
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
