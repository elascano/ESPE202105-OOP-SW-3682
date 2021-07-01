/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.bookstore.view;

import ec.edu.espe.bookstore.model.*;
import java.util.ArrayList;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


/**
 *
 * @author jejoc
 */
public class SystemDisplay {
    public static void main(String[] arg){

        String route = "C:\\Users\\steve\\Desktop\\BookstoreProyect\\06-Code\\Bookstore\\file\\jsonFile.txt";
        String content = "";
        
        ArchiveLibrary.writeArchive(route, content);
        ArchiveLibrary.readArchive(route);
        
        Scanner scan = new Scanner(System.in);
        int option;
        ArrayList<Book> listBook = new ArrayList<>();
        ArrayList<Calculator> listCalculator = new ArrayList<>();                                
        ArrayList<Folder> listFolder = new ArrayList<>();                                
        ArrayList<Marker> listMarker = new ArrayList<>();
        ArrayList<Notebook> listNotebook = new ArrayList<>();
        ArrayList<Pen> listPen = new ArrayList<>();
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
       
        do{
            System.out.println("--------------| Bookstore Menu |--------------");
            System.out.println("1. Enter a product.");
            System.out.println("2. Print product list.");
            System.out.println("3. Exit system.\n");
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
                                float price;                               
                                System.out.println("\nEnter the required book data:");
                                do{
                                    System.out.println("Enter your title: ");
                                    title = scan.next();
                                    scan.nextLine();
                                    System.out.println("Enter your author: ");
                                    author = scan.nextLine();
                                    System.out.println("Enter your price: ");
                                    price = scan.nextFloat();
                                    
                                    Book books = new Book(title, author, price);
                                    listBook.add(books);
                                                                                                            
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
                                    
                                    Calculator calculators = new Calculator(model,brand,price);
                                    listCalculator.add(calculators);
                                    
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
                                    
                                    Folder folders = new Folder(material,color,price);
                                    listFolder.add(folders);
                                    
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
                                    
                                    Marker markers = new Marker(color,inkType,price);
                                    listMarker.add(markers);
                                    
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
                                    
                                    Notebook notebooks = new Notebook(type,numberOfPages,price);
                                    listNotebook.add(notebooks);
                                    
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
                                    
                                    Pen pens = new Pen(color,tipType,price);
                                    listPen.add(pens);
                                    
                                    System.out.println("Would you like to enter a new pen?  1. Yes  2.No ");
                                    System.out.print("Choose your option:  ");
                                    option = scan.nextInt();
                                }while(option == 1);
                                break;
                            case 7:
                                System.out.println("\nlist of Books -> " + listBook + "\n");
                                System.out.println("\nlist of Calculator -> " + listCalculator + "\n");
                                System.out.println("\nlist of Folders -> " + listFolder + "\n");                               
                                System.out.println("\nlist of Markers -> " + listMarker + "\n");                                
                                System.out.println("\nlist of Notebooks -> " + listNotebook + "\n");                               
                                System.out.println("\nlist of Pens -> " + listPen + "\n");
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
                                break;
                            case 2:
                                System.out.println("list of Calculator -> " + listCalculator);
                                break;
                            case 3:
                                System.out.println("list of Folders -> " + listFolder);                               
                                break;
                            case 4:
                                System.out.println("list of Markers -> " + listMarker);                                
                                break;
                            case 5:
                                System.out.println("list of Notebooks -> " + listNotebook);                               
                                break;
                            case 6:
                                System.out.println("list of Pens -> " + listPen);                                
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
                    System.out.println("Thanks for use a program. \n\n");
                    option = 3;
                    break;
                
                default:
                    System.out.println("Choose only the options below. \n\n");
            }
        }while(option != 3); 
       
    }
}
