/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Esteban Chablay EMCL. Java ESPE-DCCO
 */
public class FileManager implements Persistence{

    @Override
    public void create(String data, String table) {
        
    }

    @Override
    public String read(String table) {
        //TODO read all data from 
        return "";
    }

    @Override
    public String find(String searchString, String table) {
        return "";
    }

    @Override
    public boolean update(String searchString, String data, String table) {
        return true;
    }

    @Override
    public boolean delete(String searchString, String table) {
        return true;
    }
    
}
