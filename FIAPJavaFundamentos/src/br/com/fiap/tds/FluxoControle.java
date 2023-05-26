/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fiap.tds;

/**
 *
 * @author gilbe
 */
public class FluxoControle {
    
    public static void main(String[] args) {
        
        int idade = 15;
        
        if(idade == 0)
            System.out.println("idade invalida");
        
        if (idade >= 18 && idade < 70) {
            System.out.println("Maior idade");
        }else if (idade >= 70){
            System.out.println("Terceira idade");
            if (idade >= 100){
                System.out.println("Centenário");    
            }
        }else{
            System.out.println("Menor idade");
        }
    }
    
}
