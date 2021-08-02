/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author 59399
 */
public class FileManager implements Persistence {

    @Override
    public void crete(String data, String table) {
       //TODO create the file
    }

    @Override
    public String read(String table) {
        //TODO read the file
        return "";
    }

    @Override
    public String find(String seachString, String table) {
        //TODO find the file
        return "";
    }

    @Override
    public boolean update(String seachString, String data, String table) {
        //TODO update the file
        return true;
    }

    @Override
    public boolean delete(String seacString, String table) {
        //TODO delete from the file
        return true;
    }
    
}
