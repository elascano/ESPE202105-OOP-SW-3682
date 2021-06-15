/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Esteban Chablay EMCL. Java ESPE-DCCO
 */
public class Person {
    private String name;
    private int age;
    private int code;
    private String country;

    public Person() {
    }

    public Person(String name, int age, int code, String country) {
        this.name = name;
        this.age = age;
        this.code = code;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String city) {
        this.country = country;
    }
    
    public void dataEntry(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        name = scan.nextLine();
        System.out.println("Ingrese el pais: ");
        country = scan.nextLine();
        System.out.println("Ingrese la edad: ");
        age = scan.nextInt();
        System.out.println("Ingrese el codigo: ");
        code = scan.nextInt();
        System.out.println("--------------------------");
    }
    
}
