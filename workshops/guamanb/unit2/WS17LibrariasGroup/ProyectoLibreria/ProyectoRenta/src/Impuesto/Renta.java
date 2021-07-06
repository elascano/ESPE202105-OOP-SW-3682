/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Impuesto;

/**
 *
 * @author Vinicio Guaman The Programers ESPE-DCCO
 */
public class Renta {
    public double ObtenerImpuesto(double sueldo, double Iva){
        double impuesto = 0.00;
        impuesto = ((sueldo * 12)*0.12);
        return impuesto;
    }
    
}
