/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SaleP;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class Sale {

    private final int ID;
    private static int idCounter;
    private Date startDate;
    private Date finalDate;
    private double finalPrice;
    private String paymentMethod;
    private int clientID;

    public Sale() {
        this.ID = (idCounter += 1);
        this.finalDate = null;
        this.startDate = null;
        this.finalPrice = 0;
        this.paymentMethod = "";
        this.clientID = 0;

    }

    public Sale(Date startDate, Date finalDate, double finalPrice, String paymentMethod, int clienteID) {

        this.ID = (idCounter += 1);
        this.startDate = startDate;
        this.finalDate = finalDate;
        this.finalPrice = finalPrice;
        this.paymentMethod = paymentMethod;
        this.clientID = clienteID;

    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getFinalDate() {
        return finalDate;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public int getClientID() {
        return clientID;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setFinalDate(Date finalDate) {
        this.finalDate = finalDate;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

}
