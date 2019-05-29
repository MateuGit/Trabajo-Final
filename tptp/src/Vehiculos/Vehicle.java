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
public abstract class Vehicle {

    private Residence residence;
    private int capacity;
    private final int id;
    private static int idCounter;
    private String company;
    private String type;
    private String brand;//marca
    private String model;
    private String destination;
    private boolean disponible;
    private double price;

    public Vehicle() {
        this.id = (idCounter += 1);

        this.capacity = 0;
        this.company = "";
        this.type = "";
        this.brand = "";
        this.model = "";
        this.disponible = false;
        this.residence = new Residence();
        this.price = 0;

    }

    public Vehicle(double price, Residence residence, int capacity, int id, String company, String type, String brand, String model, int rating) {
        this.capacity = capacity;
        this.id = (idCounter += 1);
        this.company = company;
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.disponible = false;
        this.residence = new Residence(residence);
        this.price = price;
    }

    public Vehicle(double price, int capacity, int id, String company, String type, String brand, String model, int rating, String destination) {
        this.id = (idCounter += 1);
        this.capacity = capacity;
        this.company = company;
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.residence = new Residence(residence);
        this.destination = destination;
        this.disponible = false;
        this.price = price;
    }

    /* 
    
    
    
    LOGICA
    
    
    
    
     */
    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

}
