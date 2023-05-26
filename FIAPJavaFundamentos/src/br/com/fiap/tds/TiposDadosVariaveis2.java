/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fiap.tds;

/**
 *
 * @author gilbe
 */
public class TiposDadosVariaveis2 {
    
    public static void main(String[] args) {
        int x = 10; //declaração de uma variável do tipo int 
        double d = x; //variável double recebe um tipo int
       // long 1 = x; //variável long recebe um tipo int
        float f = x; //variável float recebe um tipo int (atenção)
        short s = 20; //declaração de uma variável do tipo short
     //   x = s;        //variável int recbe um tipo short
        
        double valorDouble = 9.99;
        int valorInt = (int) valorDouble;
        System.out.print(valorInt);
    }
    
}
