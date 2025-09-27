/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

/**
 *
 * @author Merly
 */
public class Numdel1al50 {
    public static void main(String[] args) {
        // 5. Realizar un programa que imprima la sumatoria de los números del 1 al 50 utilizando ciclos "do while".
        int j=1;
        int suma=0;
        
        do {
            suma+=j;
            j++;
        }
        
        while (j<=50);
        
        System.out.println(suma);
    }
    
}
