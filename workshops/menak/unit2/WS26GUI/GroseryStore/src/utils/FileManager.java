/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Paul Mena The Programmers ESPE-DCCO
 */
public class FileManager implements Persistence {

    @Override
    public void create(String data, String table) {
        //TODO create the file
    }

    @Override
    public String read(String table) {
        //TODO read all data from file
        return "";

    }

    @Override
    public String find(String searchString, String table) {
        //TODO find the file
        return "";

    }

    @Override
    public boolean update(String searchString, String data, String table) {
        return true;

    }

    @Override
    public boolean delete(String searchString, String table) {
        //
        return true;
    }
    
}
