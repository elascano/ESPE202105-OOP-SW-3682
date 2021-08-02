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
public class FileManager implements Persistence{

    @Override
    public void create(String data, String table) {
        //TODO insert new record in file
    }

    @Override
    public String read(String table) {
        //TODO read all data from file
        return "";
    }

    @Override
    public String find(String searchString, String table) {
        //TODO find a record file
        return "";
    }

    @Override
    public boolean update(String searchString, String data, String table) {
        //TODO update the file
        return true;
    }

    @Override
    public boolean delete(String searchString, String table) {
        //TODO delete from file
        return true;
    }
    
}
