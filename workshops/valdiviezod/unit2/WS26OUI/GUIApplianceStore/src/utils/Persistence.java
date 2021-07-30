/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author Darwin Valdiviezo NullPointers ESPE-DCCO
 */
public interface Persistence {
    public void crete(String data , String table);
    public String read(String table);
    public String find(String seachString ,String table);
    public boolean update(String seachString , String data , String table);
    public boolean delete(String seacString , String table );
}
