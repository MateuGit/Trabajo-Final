/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

/**
 *
 * @author usuario
 */
public class Bus extends Vehicle{

    public Bus() {
        super();
    }

    public Bus(Residence residence, int capacity, int id, String company, String type, String brand, String model, int rating) {
        super(residence, capacity, id, company, type, brand, model, rating);
    }

    public Bus(int capacity, int id, String company, String type, String brand, String model, int rating, String destination) {
        super(capacity, id, company, type, brand, model, rating, destination);
    }
    
}
