/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testlibreria;
import Impuesto.Renta;
/**
 *
 * @author Vinicio Guaman The Programers ESPE-DCCO
 */
public class TestLibreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Renta impuesto = new Renta();
        double impuestoFinal = impuesto.ObtenerImpuesto(2000, 0.12);
        System.out.println("El valor a paga es: " + impuestoFinal);
    }
}
