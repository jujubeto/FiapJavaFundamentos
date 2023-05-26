/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fiap.tds;

/**
 *
 * @author gilbe
 */
import java.util.Scanner;
        
public class EntradaSaidaDados {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite a idade: ");
        int idade = sc.nextInt();
        
        if(idade == 0)
            System.out.println("idade invalida");
        
        if (idade >= 18 && idade < 70) {
            System.out.println(nome);
            System.out.println("Maior idade");
        }else if (idade >= 70){
            System.out.println(nome);
            System.out.println("Terceira idade");
            if (idade >= 100){
                System.out.println(nome);
                System.out.println("Centenário");    
            }
        }else{
            System.out.println(nome);
            System.out.println("Menor idade");
        }
        
    }
    
}
