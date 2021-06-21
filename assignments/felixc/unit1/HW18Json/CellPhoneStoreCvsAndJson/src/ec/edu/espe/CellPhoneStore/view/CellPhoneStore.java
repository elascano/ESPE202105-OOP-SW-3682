/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.CellPhoneStore.view;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.CellPhoneStore.model.CellPhone;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Cristian Felix InnovaCode ESPE-DCCO
 */
public class CellPhoneStore {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    

    public static void writeInCsvFile() throws IOException {
        String color;
        String model;
        String brand;
        float price;
        int id;

        ArrayList<CellPhone> cellPhones = new ArrayList<>();
        CellPhone cellPhonesArray[] = new CellPhone[3];
        Scanner select = new Scanner(System.in);
        System.out.println("Please, enter the new data to the csv file");

        System.out.println("Enter the product id: ");
        id = select.nextInt();
        System.out.println("Enter product price: ");
        price = select.nextFloat();
        System.out.println("Enter product brand: ");
        brand = select.nextLine();
        System.out.println("Enter the product model: ");
        model = select.nextLine();
        System.out.println("Enter product color: ");
        color = select.nextLine();

        CellPhone cellPhone = new CellPhone();

        cellPhone = new CellPhone(id, price, brand, model, color);
        System.out.println("CellPhone object -> " + cellPhone);

        cellPhones.add(cellPhone);

        System.out.println("CellPhone -> " + cellPhones + "\n");

        cellPhonesArray[0] = cellPhone;
        String fileOutput = "CellPhone.csv";
        boolean exists = new File(fileOutput).exists();

        if (exists) {
            File cellPhoneFile = new File(fileOutput);
            cellPhoneFile.delete();
        }

        try {
            CsvWriter csvWriter = new CsvWriter("CellPhone.csv");

            for (CellPhone cellPhoneArray : cellPhones) {
                String[] date = cellPhone.getArray();
                csvWriter.writeRecord(date);
            }

            csvWriter.close();

        } catch (IOException e) {
        }
    }
    
    public static void readFromCsvFile() throws FileNotFoundException, IOException {
        try {
            ArrayList<CellPhone> cellPhones = new ArrayList<>();
            System.out.println("read data from CSV");
            CsvReader readCellPhone = new CsvReader("CellPhone.csv");
            readCellPhone.readHeaders();
            while (readCellPhone.readRecord()) {
                String date = readCellPhone.get(0);
            }
            readCellPhone.close();

            cellPhones.forEach((CellPhoneArray) -> {
                System.out.println(CellPhoneArray.getId() + ","
                        + CellPhoneArray.getPrice() + "," + CellPhoneArray.getBrand() + ","
                        + CellPhoneArray.getModel() + "," + CellPhoneArray.getColor());
            });

        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }

    }
    
    public static void writeInJsonFile() throws IOException {

        String brand;
        String model;
        String color;
        float price;
        int id;
        ArrayList<CellPhone> cellPhones = new ArrayList<>();
        CellPhone cellPhonesArray[] = new CellPhone[3];
        Scanner select = new Scanner(System.in);
        System.out.println("Please, enter the new data to the json file");

        System.out.println("Ingrese el numero de serie :");
        id = select.nextInt();
        System.out.println("Enter product price: ");
        price = select.nextFloat();
        System.out.println("Enter product brand: ");
        brand = select.nextLine();
        System.out.println("Enter the product model: ");
        model = select.nextLine();
        System.out.println("Enter product color: ");
        color = select.nextLine();

        CellPhone cellPhone = new CellPhone();

        cellPhone = new CellPhone(id, price, brand, model, color);
        System.out.println("CellPhone object -> " + cellPhone);

        cellPhones.add(cellPhone);

        System.out.println("CellPhones -> " + cellPhones + "\n");

        cellPhonesArray[0] = cellPhone;
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter file = new FileWriter("CellPhone.json")) {
            file.write(gson.toJson(cellPhones));
            file.close();
        }
    }
    
    public static void readFromJsonFile() throws FileNotFoundException, IOException, ParseException {

        ArrayList<CellPhone> cellPhones = new ArrayList<>();
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader("CellPhone.json"));

            JSONObject jsonObject = (JSONObject) obj;

            String id = (String) jsonObject.get("id");
            String price = (String) jsonObject.get("price");
            String brand = (String) jsonObject.get("brand");
            String model = (String) jsonObject.get("model");
            String color = (String) jsonObject.get("color");

            System.out.println("Id: " + id);
            System.out.println("Price: " + price);
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Color: " + color);

            Iterator iterator = cellPhones.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

        } catch (FileNotFoundException e) {
        }
    }
 
    public static void main(String[] args) throws IOException, Exception {

        String color;
        String brand;
        float price;
        int id;
        String model;

        CellPhone cellPhonesArray[] = new CellPhone[3];
        ArrayList<CellPhone> cellPhones = new ArrayList<>();

        int selection;

        Scanner select = new Scanner(System.in);
        System.out.println("*****You have opened the CellPhone Store database*****\n");
        System.out.println("Please, select the type of file you want to access");
        System.out.println("1-> DATABASE WITH CSV");
        System.out.println("2-> DATABASE WITH JSON");
        selection = select.nextInt();

        if (selection == 1) {
            System.out.println("1-> Enter new data in csv file");
            System.out.println("2-> Read data from csv file");
            selection = select.nextInt();
            if (selection == 1) {
                writeInCsvFile();
            } else {
                if (selection == 2) {
                    readFromCsvFile();
                }
            }
        } else {
            if (selection == 2) {
                System.out.println("1-> Enter new data in Json file");
                System.out.println("2-> read data from Json file");
                selection = select.nextInt();
                if (selection == 1) {
                    writeInJsonFile();
                } else {
                    if (selection == 2) {
                        readFromJsonFile();
                    }
                }
            }
        }
    }
}
