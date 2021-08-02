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
public interface Persistence {
    public void create(String data,String table);
    public String read(String table);
    public String find(String searchString,String table);
    public boolean update(String searchString,String data, String table);
    public boolean delete(String searchString,String table);
}
