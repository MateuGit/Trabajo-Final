/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

import residence.Residence;

/**
 *
 * @author usuario
 */
public class Car extends Vehicle{

    public Car() {
        super();
    }

    public Car(Residence residence, int capacity, int id, String company, String type, String brand, String model, int rating) {
        super(residence, capacity, id, company, type, brand, model, rating);
    }

    public Car(int capacity, int id, String company, String type, String brand, String model, int rating, String destination) {
        super(capacity, id, company, type, brand, model, rating, destination);
    }

    

    
    
}
