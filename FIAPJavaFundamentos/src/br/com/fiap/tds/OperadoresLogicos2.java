/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fiap.tds;

/**
 *
 * @author gilbe
 */
public class OperadoresLogicos2 {
    
    public static void main(String[] args) {
        int x = 9, y = 11;
        
        boolean teste = x > 10 ^ y > 10;
        
        System.out.println(teste);
        
        int idade = 20;
        
        boolean maioridade = !(idade >= 18);
        System.out.println(maioridade);
    }
    
}
