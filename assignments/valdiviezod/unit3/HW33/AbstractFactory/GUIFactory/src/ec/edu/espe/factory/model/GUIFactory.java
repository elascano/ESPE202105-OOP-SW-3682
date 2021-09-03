/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.factory.model;

/**
 *
 * @author Darwin Valdiviezo NullPointers ESPE-DCCO
 */
public abstract class GUIFactory {
    public static GUIFactory getFactory(){
        int sys = readFromConfigFile("OS_TYPE");
        if(sys==0)
            return (new WinFactory());
        else
            if(sys==1)
                return (new LinuxFactory());
            else
                return (new MacFactory());
        
    }
    public abstract Button createButton();
    public abstract Menu createMenu();
    
}
