/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theorical.model;

import java.util.ArrayList;
import javax.swing.text.Highlighter;

/**
 *
 * @author Steven Achig FutureProgrammers ESPE-DCCO
 */
class Product {
    float price;
    int amount;
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<calculator> calcularos = new ArrayList<>();
    ArrayList<Notebook> notebooks = new ArrayList<>();
    ArrayList<Pensil> pensils = new ArrayList<>();
    ArrayList<Highlighter> highlighters = new ArrayList<>();
    ArrayList<ColorPencil> colorspencil = new ArrayList<>();
    ArrayList<Pen> pens = new ArrayList<>();
}
