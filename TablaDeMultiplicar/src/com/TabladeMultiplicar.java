/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

/**
 *
 * @author Merly
 */
public class TabladeMultiplicar {
    public static void main(String[] args) {
        // 6. Realizar un programa que mediante la utilización de bucles, debe permitir imprimir cualquier tabla de multiplicar.
        int num=5;
       for (int i=1; i<=12; i++){
           int tm=num*i;
           System.out.println(i+"x"+num+"="+tm);
       }
    }
}
