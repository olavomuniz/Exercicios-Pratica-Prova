package com.mycompany.exercicios_prova;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        char[] res = new char[6];

        for (int i = 0; i < 6; i++) {
            System.out.println("Digite o resultado do jogo " + (i + 1) + ": ");
            res[i] = ler.next().charAt(0);
        }

        int v = 0;

        for (int i = 0; i < 6; i++) {
            if (res[i] == 'v' || res[i] == 'V') {
                v++;
            }
        }

        if (v >= 5 && v <= 6) {
            System.out.println("\nGrupo 1!");
        } 
        else if (v >= 3 && v <= 4) {
            System.out.println("\nGrupo 2!");
        } 
        else if (v >= 1 && v <= 2) {
            System.out.println("\nGrupo 1!");
        } 
        else {
            System.out.println("\n-1");
        }

    }
}
