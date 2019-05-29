
package clases;

import java.util.ArrayList;


public class Client extends Person{
    private final int ID;
    private static int idCounter=0;
    private ArrayList<Sale> sales;
    
    public Client(){
        this.ID = (idCounter+=1);
        sales = new ArrayList();
    }

    public Client(String name, String surName, int age, String email, Residence residence) {
        super(name, surName, age, email, residence);
        this.ID = (idCounter+=1);
        sales = new ArrayList();
    }

    public int getID() {
        return ID;
    }
    
    
}
