/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.gui.model;

import ec.edu.espe.gui.model.Button;
import ec.edu.espe.gui.model.GUIFactory;
import java.util.Scanner;

/**
 *
 * @author Alisson Caiza ASUS ESPE-DCCO
 */
public class ClientApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int brand = 4;
        int widget = 4;
        Scanner scan = new Scanner(System.in);

        while (brand != 3 || widget != 3) {
            System.out.println("3. Leave");
            System.out.println("-----------------------------------");
            System.out.println("0. Windows");
            System.out.println("1. Linux");
            System.out.println("2. Mac");
            System.out.println("Choose Brand");
            brand = scan.nextInt();
            System.out.println("-----------------------------------");
            System.out.println("1. Button.\n");
            System.out.println("2. Menu.\n");
            System.out.println("Choose Widget");
            widget = scan.nextInt();
                
            
            GUIFactory aFactory = GUIFactory.getFactory(brand);
            switch (widget) {
                case 1:
                    Button aButton = aFactory.createButton();
                    aButton.caption = "Play";
                    aButton.paint();
                    break;
                case 2:
                    Menu menu = aFactory.createMenu();
                    menu.caption = "Play";
                    menu.paint();
                    break;

            }
        }
    }

}
