/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.fromCDtoCode.model;

import java.util.ArrayList;

/**
 *
 * @author Ariel Gonzalez InnovaCode ESPE-DCCO
 */
public class Time {
    private float timeSinceBuyed;
    private float timeBeingSelled;
    private ArrayList <Cellphone> cellphones = new ArrayList<>();
    private ArrayList <HeadPhone> headphones = new ArrayList<>();
    private ArrayList <ScreenProtector> screenProtectors = new ArrayList<>();
    private ArrayList <Charger> chargers = new ArrayList<>();
    private ArrayList <PhoneCase> phoneCases = new ArrayList<>();
    
    public float calculateTimeInStock(){
        return 0;
    }
}
