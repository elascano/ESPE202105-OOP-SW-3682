/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Nicolas Suquillo NullPointers ESPE-DCCO
 */
public class DBManager implements Persistence{

    @Override
    public void create(String data, String table) {
        //Todo insert new record in Mongodb
    }

    @Override
    public String read(String table) {
        //TODO read all data from Mongodb
        return "";
    }

    @Override
    public String find(String searchString, String table) {
        //TODO find a record in Mongodb
        return "";
    }

    @Override
    public boolean update(String searchString, String data, String table) {
        //TODO update the Mongodb
        return true;
    }

    @Override
    public boolean delete(String searchString, String table) {
        //TODO delete from Mongodb
        return true;
    }
    
}
