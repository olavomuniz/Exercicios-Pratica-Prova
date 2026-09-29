package com.mycompany.exercicios_prova;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int num1, dis1, vel1;
        int num2, dis2, vel2;

        System.out.println("Digite o numero da primeira charrete: ");
        num1 = ler.nextInt();

        System.out.println("Digite a distancia da primeira charrete: ");
        dis1 = ler.nextInt();

        System.out.println("Digite a velocidade da primeira charrete: ");
        vel1 = ler.nextInt();

        System.out.println("Digite o numero da segunda charrete: ");
        num2 = ler.nextInt();

        System.out.println("Digite a distancia da segunda charrete: ");
        dis2 = ler.nextInt();

        System.out.println("Digite a velocidade da segunda charrete: ");
        vel2 = ler.nextInt();

        if ((num1 >= 1 && num1 <= 99) &&
            (dis1 > 0 && dis1 <= 1000) &&
            (vel1 > 0 && vel1 <= 50) &&
            (num2 >= 1 && num2 <= 99) &&
            (dis2 > 0 && dis2 <= 1000) &&
            (vel2 > 0 && vel2 <= 50) &&
            (num1 != num2)) {

            if (dis1 * vel2 < dis2 * vel1) {
                System.out.println("A charrete " + num1 + " ganha a corrida!");
            } else {
                System.out.println("A charrete " + num2+ " ganha a corrida!");
            }

        } else {
            System.out.println("Valores inválidos.");
        }
    }
}