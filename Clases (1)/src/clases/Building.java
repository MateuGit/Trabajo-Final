/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Matias
 */
public abstract class Building {
    private final int ID;
    private static int idCounter;
    private Residence residence;
    private int capacity;    
    

    public Building() {
        this.ID = (idCounter += 1);
        residence = null;
        capacity = 0;
        
    }

    public Building(Residence residence, int capacity) {
        this.residence = residence;
        this.capacity = capacity;
        this.ID = (idCounter += 1);
    }

    public int getID() {
        return ID;
    }

    public Residence getResidence() {
        return residence;
    }

    public void setResidence(Residence residence) {
        this.residence = residence;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    
    
    
}
