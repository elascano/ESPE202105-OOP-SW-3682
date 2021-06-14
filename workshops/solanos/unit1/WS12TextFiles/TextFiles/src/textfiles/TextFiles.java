/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfiles;

import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Sebastian Solano NullPunters ESPE-DCCO
 */
public class TextFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner enter = new Scanner(System.in);
        FileWriter file;
        int cont;
        String name = null;
        
        cont =10;
        file = new FileWriter("D:\\Users\\Familia Solano\\Desktop\\Sebas\\Prog.Objetos\\Functions3682\\Workshops\\ESPE202105-OOP-SW-3682\\workshops\\solanos\\unit1\\WS12TextFiles\\file.txt");
        for(cont = 0; cont<10; cont++){
            System.out.println("Entre your name, age and id");
            name = enter.nextLine();
            file.write(name + "\n");
        }
       file.close();       
    }
    
}
