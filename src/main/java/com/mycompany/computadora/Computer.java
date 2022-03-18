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
public class Computer {
    private String marca;
    private double ram;
    private double almacenamiento;
    
   public Computer(String marca, double ram, double almacenamiento){
       
   }

    public String getMarca() {
        return marca;
    }

    public double getRam() {
        return ram;
    }

    public double getAlmacenamiento() {
        return almacenamiento;
    }
   
    public void imprimeMarca(){
        System.out.println("Marca: " + getMarca());
    }
}
