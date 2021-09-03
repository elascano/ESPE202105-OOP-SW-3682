/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.ArrayList;

/**
 *
 * @author Alisson Caiza ASUS ESPE-DCCO
 */
public interface DBManager {

    public boolean connect();
    
    public boolean add(ArrayList data);

    public String read(String table);

    public void update(String searchInfo, String table, String data);

    public boolean delete(String searchInfo, String table);

    public String find(String searchInfo, String table);
}
