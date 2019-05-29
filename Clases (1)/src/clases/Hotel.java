/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class Hotel extends Building{
    private final int ID;
    private static int idCounter;
    private int countStars;
    private ArrayList<String> services;
    //private ArrayList<Sale> sales;
    
    public Hotel(){
        this.ID = (idCounter += 1);
        countStars = 0;
        services = new ArrayList();
        //sales = new ArrayList();
    }
    
    public Hotel(int countStars, String[]services){
        this.ID = (idCounter += 1);
        this.countStars = countStars;
        //metodo agregar al list usando el arreglo
    }

    public int getCountStars() {
        return countStars;
    }

    public void setCountStars(int countStars) {
        this.countStars = countStars;
    }
    
    
}
