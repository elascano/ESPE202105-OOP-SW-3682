/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.tax.controller;

import utils.USTax;

/**
 *
 * @author Cristian Félix InnovaCode ESPE-DCCO
 */
public class Calculator {

    public static void main(String args[]) {
        USTax tax = USTax.getInstance();
        tax.computeSalesTotal(0);
    }
}
