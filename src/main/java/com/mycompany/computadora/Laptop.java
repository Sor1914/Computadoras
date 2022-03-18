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
public class Laptop {
    private String resolucion;

    public String getResolucion() {
        return resolucion;
    }
    
    public void imprimeResolucion(){
        System.out.println("Resolución: " + getResolucion());
    }
}
