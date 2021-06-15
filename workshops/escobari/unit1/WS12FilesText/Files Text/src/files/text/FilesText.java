/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files.text;

import java.io.FilePermission;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Isaac Escobar InnovaCode ESPE-DCCO
 */
public class FilesText {
    
    public static void main(String[] args) throws IOException {
        
        FileWriter fichero = new FileWriter ("C:\\Users\\Usuario\\Desktop\\codigo\\Semestre Mayo21-Septiembre21\\ESPE202105-OOP-SW-3682\\workshops\\escobari\\unit1\\WS12FilesText\\Rows of numbers.txt");
        for (int x= 0; x<10; x++){
            fichero.write("Rows of numbers" + x + "\n");
   
            
            
        }
        fichero.close();
    }

  
}
