/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fiap.tds;

/**
 *
 * @author gilbe
 */
public class OperadoresAritmeticos {
    
    public static void main(String[] args) {
        
        int x = 5;
        int y = 10;
        int z = 15;
        
        int result = x + y;
        System.out.println(result);
        
        result = x - y;
        System.out.println(result);
        
        result = x * y;
        System.out.println(result);
        
        result = x % y;
        System.out.println(result);
        
        result = z - x + y * (x / y);
        System.out.println(result);
             
    }
    
}
