/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Diego Portilla NullPointers ESPE-DCCO
 */
public class DBManager implements Persistence {

    @Override
    public void crete(String data, String table) {
       //TODO insert new record in MongoDB
    }

    @Override
    public String read(String table) {
        //TODO read new record in MongoDB
        return "";
    }

    @Override
    public String find(String seachString, String table) {
        //TODO find new record in MongoDB
        return "";
    }

    @Override
    public boolean update(String seachString, String data, String table) {
        //TODO update in MongoDB
        return true;
    }

    @Override
    public boolean delete(String seacString, String table) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
