/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bookstore.view;

import bookstore.conexionmongodb.Connection;
import ec.edu.espe.bookstore.model.*;
import java.util.ArrayList;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.bookstore.utils.Archive;


/**
 * @author Steven Achig Future Programmers ESPE-DCCO
 */
public class SystemDisplay {
    public static void main(String[] arg){

        Scanner scan = new Scanner(System.in);
        int option;
        int id;
        int amount;
        float price;
        ArrayList<Book> listBook = new ArrayList<>();
        ArrayList<Calculator> listCalculator = new ArrayList<>();                                
        ArrayList<Folder> listFolder = new ArrayList<>();                                
        ArrayList<Marker> listMarker = new ArrayList<>();
        ArrayList<Notebook> listNotebook = new ArrayList<>();
        ArrayList<Pen> listPen = new ArrayList<>();
        String jsonProduct;
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        Connection connection = new Connection();
        
        do{
            System.out.println("--------------| Bookstore Menu |--------------");
            System.out.println("1. Enter a product.");
            System.out.println("2. Read the file of Products");
            System.out.println("3. Sell");
            System.out.println("4. Exit system.\n");
            System.out.print("Choose an option:  ");
            option = scan.nextInt();
            
            switch(option){
                case 1:
                    do{
                        System.out.println("\nSelect the category of product you want to enter.");
                        System.out.println("1. Book.");
                        System.out.println("2. Calculator.");
                        System.out.println("3. Folder.");
                        System.out.println("4. Marker.");
                        System.out.println("5. Notebook.");
                        System.out.println("6. Pen.");
                        System.out.println("0. Exit product input");
                        System.out.print("Choose an option:  ");
                        option = scan.nextInt();
                        switch(option){
                            case 1:
                                String title;
                                String author;
                                System.out.println("\nEnter the required book data:");
                                do{
                                    System.out.println("Enter your title: ");
                                    scan.nextLine();
                                    title = scan.nextLine();
                                    System.out.println("Enter your author: ");
                                    author = scan.nextLine();
                                    System.out.println("Enter your price: ");
                                    price = scan.nextFloat();
                                    System.out.println("Enter your amount: ");
                                    amount = scan.nextInt();
                                    for(id=1; id <= amount; id++){
                                        Book books = new Book(title, author, id, price, amount);
                                        listBook.add(books);
                                        jsonProduct = gson.toJson(books);
                                        Archive.writeArchive(jsonProduct, "Books.json");
                                        connection = new Connection("books");
                                        connection.insert(jsonProduct);
                                    }

                                    System.out.println("Would you like to enter a new book?  1. Yes  2.No ");
                                    System.out.print("Choose your option:  ");
                                    option = scan.nextInt();
                                }while(option == 1);
                                break;
                            
                            case 2:
                                String model;
                                String brand;
                                System.out.println("\nEnter the required calculator data:");
                                do{
                                    System.out.println("Enter your model: ");
                                    model = scan.next();
                                    scan.nextLine();
                                    System.out.println("Enter your brand: ");
                                    brand = scan.nextLine();
                                    System.out.println("Enter your price: ");
                                    price = scan.nextFloat();
                                    System.out.println("Enter your amount: ");
                                    amount = scan.nextInt();
                                    
                                    for(id=1; id <= amount; id++){
                                        Calculator calculators = new Calculator(model,brand, id, price, amount);
                                        listCalculator.add(calculators);
                                        jsonProduct = gson.toJson(calculators);
                                        Archive.writeArchive(jsonProduct, "Calculators.json");
                                        connection = new Connection("calculators");
                                        connection.insert(jsonProduct);
                                    }
                                                                       
                                    System.out.println("Would you like to enter a new calculator?  1. Yes  2.No ");
                                    System.out.print("Choose your option:  ");
                                    option = scan.nextInt();
                                }while(option == 1);
                                break;
                                
                            case 3:
                                String material;
                                String color;                               
                                System.out.println("\nEnter the required folder data:");
                                do{
                                    System.out.println("Enter your material: ");
                                    material = scan.next();
                                    scan.nextLine();
                                    System.out.println("Enter your color: ");
                                    color = scan.nextLine();
                                    System.out.println("Enter your price: ");
                                    price = scan.nextFloat();
                                    System.out.println("Enter your amount: ");
                                    amount = scan.nextInt();
                                    
                                    for(id=1; id <= amount; id++){
                                        Folder folders = new Folder(material,color, id, price, amount);
                                        listFolder.add(folders);
                                        jsonProduct = gson.toJson(folders);
                                        Archive.writeArchive(jsonProduct, "Folders.json");
                                        connection = new Connection("folders");
                                        connection.insert(jsonProduct);
                                    }
                                    
                                    System.out.println("Would you like to enter a new folder?  1. Yes  2.No ");
                                    System.out.print("Choose your option:  ");
                                    option = scan.nextInt();
                                }while(option == 1);    
                                break;
                                
                            case 4:
                                String inkType;                               
                                System.out.println("\nEnter the required marker data:");
                                do{
                                    System.out.println("Enter your color: ");
                                    color = scan.next();
                                    scan.nextLine();
                                    System.out.println("Enter your inkType: ");
                                    inkType = scan.nextLine();
                                    System.out.println("Enter your price: ");
                                    price = scan.nextFloat();
                                    System.out.println("Enter your amount: ");
                                    amount = scan.nextInt();
                                    
                                    for(id=1; id <= amount; id++){
                                        Marker markers = new Marker(color,inkType, id, price, amount);
                                        listMarker.add(markers);
                                        jsonProduct = gson.toJson(markers);
                                        Archive.writeArchive(jsonProduct, "Markers.json");
                                        connection = new Connection("markers");
                                        connection.insert(jsonProduct);
                                    }
                                    
                                    System.out.println("Would you like to enter a new marker?  1. Yes  2.No ");
                                    System.out.print("Choose your option:  ");
                                    option = scan.nextInt();
                                }while(option == 1);    
                                break;
                                
                            case 5:
                                String type;
                                int numberOfPages;                               
                                System.out.println("\nEnter the required notebook data:");
                                do{
                                    System.out.println("Enter your type: ");
                                    type = scan.next();
                                    scan.nextLine();
                                    System.out.println("Enter your number of pages: ");
                                    numberOfPages = scan.nextInt();
                                    System.out.println("Enter your price: ");
                                    price = scan.nextFloat();
                                    System.out.println("Enter your amount: ");
                                    amount = scan.nextInt();
                                    
                                    for(id=1; id <= amount; id++){
                                        Notebook notebooks = new Notebook(type,numberOfPages, id, price, amount);
                                        listNotebook.add(notebooks);
                                        jsonProduct = gson.toJson(notebooks);
                                        Archive.writeArchive(jsonProduct, "Notebooks.json");
                                        connection = new Connection("notebooks");
                                        connection.insert(jsonProduct);
                                    }
                                    
                                    System.out.println("Would you like to enter a new notebook?  1. Yes  2.No ");
                                    System.out.print("Choose your option:  ");
                                    option = scan.nextInt();
                                }while(option == 1);   
                                break;
                                
                            case 6:
                                String tipType;                               
                                System.out.println("\nEnter the required notebook data:");
                                do{
                                    System.out.println("Enter your color: ");
                                    color = scan.next();
                                    scan.nextLine();
                                    System.out.println("Enter your tipType: ");
                                    tipType = scan.nextLine();
                                    System.out.println("Enter your price: ");
                                    price = scan.nextFloat();
                                    System.out.println("Enter your amount: ");
                                    amount = scan.nextInt();
                                    
                                    for(id=1; id <= amount; id++){
                                        Pen pens = new Pen(color,tipType,id, price, amount);
                                        listPen.add(pens);
                                        jsonProduct = gson.toJson(pens);
                                        Archive.writeArchive(jsonProduct, "Pens.json");
                                        connection = new Connection("pens");
                                        connection.insert(jsonProduct);
                                    }
                                    
                                    System.out.println("Would you like to enter a new pen?  1. Yes  2.No ");
                                    System.out.print("Choose your option:  ");
                                    option = scan.nextInt();
                                }while(option == 1);
                                break;
                            case 0:
                                System.out.println("returning to the main menu\n\n");
                                break;
                        }
                    }while(option != 0);
                    break;
                
                case 2:
                    do{
                        System.out.println("\nSelect the products for print.");
                        System.out.println("1. Book.");
                        System.out.println("2. Calculator.");
                        System.out.println("3. Folder.");
                        System.out.println("4. Marker.");
                        System.out.println("5. Notebook.");
                        System.out.println("6. Pen.");
                        System.out.println("0. Exit product input");
                        System.out.print("Choose an option:  ");
                        option = scan.nextInt();
                        switch(option){
                            case 1:
                                System.out.println("list of Books -> " + listBook);
                                Archive.readArchive("Books.json");
                                break;
                            case 2:
                                System.out.println("list of Calculator -> " + listCalculator);
                                Archive.readArchive("Calculators.json");
                                break;
                            case 3:
                                System.out.println("list of Folders -> " + listFolder);
                                Archive.readArchive("Folders.json");
                                break;
                            case 4:
                                System.out.println("list of Markers -> " + listMarker);
                                Archive.readArchive("Markers.json");
                                break;
                            case 5:
                                System.out.println("list of Notebooks -> " + listNotebook);
                                Archive.readArchive("Notebooks.json");
                                break;
                            case 6:
                                System.out.println("list of Pens -> " + listPen);
                                Archive.readArchive("Pens.json");
                                break;
                            case 0:
                                System.out.println("Returning to principal menu ...\n\n");
                                break;
                            default:
                                System.out.println("wrong Option, Try again\n\n");
                                break;
                        }
                    }while(option!=0);
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Thanks for use a program. \n\n");
                    break;
                
                default:
                    System.out.println("Choose only the options below. \n\n");
            }
        }while(option != 4); 
       
    }
}