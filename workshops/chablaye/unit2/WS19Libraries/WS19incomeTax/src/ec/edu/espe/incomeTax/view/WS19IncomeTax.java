/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.incomeTax.view;

import ec.edu.espe.incomeTax.model.FinancialPerson;
import ec.edu.espe.utils.IncomeTax;
import ec.edu.espe.utils.WriteJson;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Myck
 */
public class WS19IncomeTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, FileNotFoundException, ParseException {
        float amoutToCalculate;
        float inComeTax;
        String name;
        int op = 0;

        Scanner keyboardinput = new Scanner(System.in);
        System.out.println("-------Income Tax------");
        System.out.println("Your name-->");
        name = keyboardinput.next();
        System.out.print("Your mensual Salary--> ");
        amoutToCalculate = keyboardinput.nextFloat();
        inComeTax = IncomeTax.calculateIncomeTax(amoutToCalculate * 12);
        FinancialPerson person = new FinancialPerson(name, amoutToCalculate, amoutToCalculate * 12, inComeTax);

        System.out.println("Your mensual salary " + amoutToCalculate + " The income Tax for your anual salary is " + amoutToCalculate * 12 + " is " + inComeTax);
        JSONObject jsonFPerson = new JSONObject();
        jsonFPerson.put("name", person.getName());
        jsonFPerson.put("mesualSalary", person.getMensualSalary());
        jsonFPerson.put("anualSalary", person.getAnualSalary());
        jsonFPerson.put("incomeTax", person.getIncomeTax());

        JSONObject personData = new JSONObject();
        personData.put("FinancialPerson", jsonFPerson);
        JSONArray listPerson = new JSONArray();
        listPerson.add(personData);
        WriteJson.write(listPerson, "FinancialPerson.json");

        System.out.println("Desea ver el historial?");
        System.out.println("1.- Si");
        System.out.println("2._ No\n");
        op = keyboardinput.nextInt();

        if (op == 1) {
            String remove;
            JSONArray objList = new JSONArray();
            objList = WriteJson.read("FinancialPerson.json");
            objList.toString();
            for (Object fPerson : objList) {

                showInfoPerson((JSONObject) fPerson);

            }

        }

    }

    private static void showInfoPerson(JSONObject jsonObject) {
        JSONObject person = (JSONObject) jsonObject.get("FinancialPerson");
        System.out.println("Personas");
        String name = (String) person.get("name");
        System.out.println("Name-->" + name);
        Double mensual = (double) person.get("mesualSalary");
        System.out.println("Mensual Salary-->" + mensual);
        Double anual = (double) person.get("anualSalary");
        System.out.println("Anual Salary-->" + anual);
        Double income = (double) person.get("incomeTax");
        System.out.println("Income Tax-->" + income);

    }
}
