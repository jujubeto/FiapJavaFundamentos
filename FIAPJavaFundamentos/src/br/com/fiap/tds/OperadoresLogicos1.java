/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fiap.tds;

/**
 *
 * @author gilbe
 */
public class OperadoresLogicos1 {
    
    public static void main(String[] args) {
        
        int idade = 20;
        boolean precisaVotar = idade >= 18 && idade < 70;
        
        System.out.println(precisaVotar);
        
        int nrAmarelo = 2, nrVermelho = 1;
        
        boolean suspenso = nrAmarelo == 2 || nrVermelho == 1;
        System.out.println(suspenso);
    }
    
}
