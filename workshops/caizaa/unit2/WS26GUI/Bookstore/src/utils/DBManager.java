/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Steven Achig Future Programmers ESPE-DCCO
 */
public class DBManager implements Persistence{

     @Override
    public void create(String data, String table) {
        //TODO insert new record in MongoDB
    }

    @Override
    public String read(String table) {
        //TODO read all data from MongoDB
        return "";
    }

    @Override
    public String find(String searchString, String table) {
        //TODO find a record in MongoDB
        return "";
    }

    @Override
    public boolean update(String searchString, String data, String table) {
        //TODO update the MongoDB
        return true;
    }

    @Override
    public boolean delete(String searchString, String table) {
        //TODO delete from MongoDb
        return true;
    }
    
}
