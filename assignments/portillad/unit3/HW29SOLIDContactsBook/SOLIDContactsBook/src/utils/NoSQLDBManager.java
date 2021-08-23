/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Kenneth Andrade ESPE-DCCO
 */
public interface NoSQLDBManager extends DBManager {

    public boolean openConnection(String dataBaseName);
    
}
