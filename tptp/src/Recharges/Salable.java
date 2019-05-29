/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recharges;

/**
 *
 * @author usuario
 */
public interface Salable {
    void sendStadistics(); //Envia Estadisticas
    void calculateFinalCost(); //Saca el precio final sumando todos los recargos
    double IVA=0.21;
    double feeTax=0.05;
}
