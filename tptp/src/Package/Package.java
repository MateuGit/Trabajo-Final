/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

import Recharges.Salable;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Package {
    private final int ID;
    private static int idCounter;
    private  ArrayList<Salable> Items;
    private int stock;
    private boolean disponible;
    private boolean inOfert;
    

    public Package() {
        ID=(idCounter+=1);
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public boolean decreaseStock(){
        if (stock<1) {
            return false;
        }else{
            stock--;
            return true;
        }
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
  
  
  
}
