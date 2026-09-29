package com.mycompany.exercicios_prova;

import java.util.Scanner;


public class Ex4 {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int pe;
        int conta;
        
        System.out.print("Escreva a quantidade de pecas: ");
        pe = ler.nextInt();
        
        conta = (pe + 1) * (pe + 2) / 2;
        
        System.out.println("\n" + conta);
    }
    
}
