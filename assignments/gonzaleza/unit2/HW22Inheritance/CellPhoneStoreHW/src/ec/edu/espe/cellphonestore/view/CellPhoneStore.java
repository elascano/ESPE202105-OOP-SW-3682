/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cellphonestore.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.cellphonestore.model.CellPhone;
import ec.edu.espe.cellphonestore.model.Charger;
import ec.edu.espe.cellphonestore.model.Customer;
import ec.edu.espe.cellphonestore.model.HeadPhone;
import ec.edu.espe.cellphonestore.model.PhoneCase;
import ec.edu.espe.cellphonestore.model.ScreenProtector;
import ec.epe.edu.utils.InventoryFileManager;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author InnovaCode
 */
public class CellPhoneStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String color;
        String type;
        String brand;
        float price;
        int id;
        String model;
        String material;
        String entryType;
        String name;
        String email;
        String phoneNumber;
        
        
        Scanner scan = new Scanner(System.in);

        ArrayList<CellPhone> cellphones = new ArrayList<>();
        ArrayList<PhoneCase> phoneCases = new ArrayList<>();
        ArrayList<Charger> chargers = new ArrayList<>();
        ArrayList<HeadPhone> headPhones = new ArrayList<>();
        ArrayList<ScreenProtector> screenProtectors = new ArrayList<>();
        ArrayList<Customer> customers = new ArrayList<>();
        

        int selection = 0;
        
        System.out.println("Welcome to the Inventory System");
        System.out.println("Please enter your personal information");
        System.out.println("Name: ");
        name = scan.nextLine();
        System.out.println("Identification card:  ");
        id = scan.nextInt(); 
        scan.nextLine();
        System.out.println("Email:  ");
        email = scan.nextLine();
        System.out.println("Phone Number:  ");
        phoneNumber= scan.nextLine();
        Customer customer = new Customer(name, id, email, phoneNumber);
        
        System.out.println("\n*****Hello, " + customer.getName()+ ". Welcome.***** \n");
        
        

        do {
            
            System.out.println("*****You have opened the CellPhone Store database*****\n");
            System.out.println("DATABASE WITH JSON");
            System.out.println("");
            System.out.println("Please, select what do you want to do.");
            System.out.println("1 -> Enter new data to .json file.");
            System.out.println("2 -> Read data from .json file.");
            System.out.println("3 -> Delete a product.");
            System.out.println("4 -> Exit the program.");
            selection = scan.nextInt();
            scan.nextLine();

            switch (selection) {
                case 1:
                    int option = 0;
                    System.out.println("Which product are you going to add?");
                    System.out.println("[1] Add cellphone.");
                    System.out.println("[2] Add phone case.");
                    System.out.println("[3] Add charger.");
                    System.out.println("[4] Add headphone.");
                    System.out.println("[5] Screen Protector.");
                    System.out.println("[6] Go back.");
                    option = scan.nextInt();
                    scan.nextLine();
                    switch (option) {
                        case 1:
                            System.out.println("    Adding a new cellphone");
                            System.out.println("Insert the model: ");
                            model = scan.nextLine();
                            System.out.println("Write the id: ");
                            id = scan.nextInt();
                            scan.nextLine();
                            System.out.println("Write the price: ");
                            price = scan.nextFloat();
                            scan.nextLine();
                            System.out.println("Write the brand: ");
                            brand = scan.nextLine();
                            System.out.println("Write the color: ");
                            color = scan.nextLine();

                            CellPhone cellphone = new CellPhone(color, model, id, price, brand);
                            System.out.println("Cellphone added. \n");
                            cellphones.add(cellphone);
                            break;

                        case 2:
                            System.out.println("Adding a new Phone Case");
                            System.out.println("Insert the model: ");
                            model = scan.nextLine();
                            System.out.println("Write the id: ");
                            id = scan.nextInt();
                            scan.nextLine();
                            System.out.println("Write the price: ");
                            price = scan.nextFloat();
                            scan.nextLine();
                            System.out.println("Write the brand: ");
                            brand = scan.nextLine();
                            System.out.println("Write the color: ");
                            color = scan.nextLine();
                            System.out.println("Write the material: ");
                            material = scan.nextLine();

                            PhoneCase phoneCase = new PhoneCase(color, model, material, id, price, brand);
                            System.out.println("Phone Case added. \n");
                            phoneCases.add(phoneCase);
                            break;

                        case 3:
                            System.out.println("Adding a new Charger");
                            System.out.println("Insert the brand: ");
                            model = scan.nextLine();
                            System.out.println("Write the id: ");
                            id = scan.nextInt();
                            scan.nextLine();
                            System.out.println("Write the price: ");
                            price = scan.nextFloat();
                            scan.nextLine();
                            System.out.println("Write the color: ");
                            color = scan.nextLine();
                            System.out.println("Write the Entry Type: ");
                            entryType = scan.nextLine();
                            System.out.println("Write the brand: ");
                            brand = scan.nextLine();

                            Charger charger = new Charger(color, entryType, model, id, price, brand);
                            System.out.println("Phone Case added. \n");
                            chargers.add(charger);
                            break;

                        case 4:
                            System.out.println("Adding a new HeadPhone");
                            System.out.println("Insert the model: ");
                            model = scan.nextLine();
                            System.out.println("Write the id: ");
                            id = scan.nextInt();
                            scan.nextLine();
                            System.out.println("Write the price: ");
                            price = scan.nextFloat();
                            scan.nextLine();
                            System.out.println("Write the color: ");
                            color = scan.nextLine();
                            System.out.println("Write the brand: ");
                            brand = scan.nextLine();

                            HeadPhone headPhone = new HeadPhone(color, model, id, price, brand);
                            System.out.println("Phone Case added. \n");
                            headPhones.add(headPhone);
                            break;

                        case 5:
                            System.out.println("Adding a new ScreenProtector");
                            System.out.println("Insert the model: ");
                            model = scan.nextLine();
                            System.out.println("Write the id: ");
                            id = scan.nextInt();
                            scan.nextLine();
                            System.out.println("Write the price: ");
                            price = scan.nextFloat();
                            scan.nextLine();
                            System.out.println("Write the material: ");
                            material = scan.nextLine();
                            System.out.println("Write the brand: ");
                            brand = scan.nextLine();

                            ScreenProtector screenProtector = new ScreenProtector(material, model, id, price, brand);
                            System.out.println("ScreenProtector added. \n");
                            screenProtectors.add(screenProtector);
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("Invalid option.");
                    }
                    break;
                case 2:
                    int option1 = 0;
                    System.out.println("Which data product are you going to watch?");
                    System.out.println("[1] Cellphone.");
                    System.out.println("[2] Phone case.");
                    System.out.println("[3] Charger.");
                    System.out.println("[4] Headphone.");
                    System.out.println("[5] Screen Protector.");
                    System.out.println("[6] Go back.");
                    option1 = scan.nextInt();
                    scan.nextLine();
                    switch (option1) {
                        case 1:
                            System.out.println("Watching CellPhone Data ");
                            for (int i = 0; i < cellphones.size(); i++) {
                                System.out.println("CellPhone: "
                                        + cellphones.get(i).getBrand() + " "
                                        + cellphones.get(i).getModel() + " "
                                        + cellphones.get(i).getId() + " "
                                        + " " + cellphones.get(i).getPrice()
                                        + " "
                                        + cellphones.get(i).getColor() + "\n");
                            }
                            break;
                            
                        case 2:
                            System.out.println("Watching Phone Cases Data ");
                            for (int i = 0; i < phoneCases.size(); i++) {
                                System.out.println("Phone Cases: "
                                        + phoneCases.get(i).getBrand() + " "
                                        + phoneCases.get(i).getModel() + " "
                                        + phoneCases.get(i).getId() + " "
                                        + phoneCases.get(i).getMaterial() + " "
                                        + phoneCases.get(i).getPrice() + " "
                                        + phoneCases.get(i).getColor() + "\n");
                            }
                            break;
                            
                        case 3:
                            System.out.println("Watching Charger Data ");
                            for (int i = 0; i < chargers.size(); i++) {
                                System.out.println("Charger: "
                                        + chargers.get(i).getModel() + " "
                                        + chargers.get(i).getId() + " "
                                        + chargers.get(i).getEntryType() + " "
                                        + chargers.get(i).getPrice() + " "
                                        + chargers.get(i).getColor() + "\n");
                            }
                            break;
                        case 4:
                            System.out.println("Watching HeaPhone Data ");
                            for (int i = 0; i < headPhones.size(); i++) {
                                System.out.println("HeadPhone: "
                                        + headPhones.get(i).getModel() + " "
                                        + headPhones.get(i).getId() + " "
                                        + headPhones.get(i).getPrice() + " "
                                        + headPhones.get(i).getColor() + "\n");
                            }
                            break;
                            
                        case 5:
                            System.out.println("Watching ScreenProtector Data ");
                            for (int i = 0; i < screenProtectors.size(); i++) {
                                System.out.println("ScreenProtector: "
                                        + screenProtectors.get(i).getModel() + " "
                                        + screenProtectors.get(i).getId() + " "
                                        + screenProtectors.get(i).getPrice() + " "
                                        + screenProtectors.get(i).getMaterial() + "\n");
                            }
                            break;    
                        case 6:
                            break;
                        default:
                            System.out.println("Invalid option.");
                    }
                    break;
                    
                case 3:
                    int option2 = 0;
                    System.out.println("Which product you want to delete?");
                    System.out.println("[1] Cellphone.");
                    System.out.println("[2] Phone case.");
                    System.out.println("[3] Charger.");
                    System.out.println("[4] Headphone.");
                    System.out.println("[5] Screen Protector.");
                    System.out.println("[6] Return.");
                    option2 = scan.nextInt();
                    switch (option2){
                        case 1:
                            System.out.println("Delete");
                            System.out.println("Position of the product you want to delete: ");
                            id = scan.nextInt();
                            scan.nextLine();
                            cellphones.remove(id);
                            Iterator it = cellphones.iterator();
                            while(it.hasNext())
                                System.out.println(it.next());
                            break;
                        case 2:
                            System.out.println("Delete");
                            System.out.println("Position of the product you want to delete: ");
                            id = scan.nextInt();
                            scan.nextLine();
                            phoneCases.remove(id);
                            Iterator it1 = phoneCases.iterator();
                            while(it1.hasNext())
                                System.out.println(it1.next());
                            break;
                        case 3:
                            System.out.println("Delete");
                            System.out.println("Position of the product you want to delete: ");
                            id = scan.nextInt();
                            scan.nextLine();
                            chargers.remove(id);
                            Iterator it2 = chargers.iterator();
                            while(it2.hasNext())
                                System.out.println(it2.next());
                            break;
                        case 4:
                            System.out.println("Delete");
                            System.out.println("Position of the product you want to delete: ");
                            id = scan.nextInt();
                            scan.nextLine();
                            headPhones.remove(id);
                            Iterator it3 = headPhones.iterator();
                            while(it3.hasNext())
                                System.out.println(it3.next());
                            break;
                        case 5:
                            System.out.println("Delete");
                            System.out.println("Position of the product you want to delete: ");
                            id = scan.nextInt();
                            scan.nextLine();
                            screenProtectors.remove(id);
                            Iterator it4 = screenProtectors.iterator();
                            while(it4.hasNext())
                                System.out.println(it4.next());
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("Invalid option.");
                    }
                case 4:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("That option does not exist.");
            }
        } while (selection != 4);
        
        InventoryFileManager.createJsonFile(cellphones, phoneCases, 
                screenProtectors, chargers, headPhones);
    }
}
