/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.computadora;

/**
 *
 * @author xXSorzXx
 */
public class Smartphone extends Computer{
    
    public Smartphone(String marca, double ram, double almacenamiento) {
        super(marca, ram, almacenamiento);
    }
    
    private double pulgadas;

    public double getPulgadas() {
        return pulgadas;
    }
    
    public void imprimePulgadas(){
        System.out.println("Pulgadas: " + getPulgadas());
    }
}
