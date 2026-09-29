package com.mycompany.exercicios_prova;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int s, a, b, pa = 0;

        System.out.println("Digite o valor de S: ");
        s = ler.nextInt();

        System.out.println("Digite o valor de A: ");
        a = ler.nextInt();

        System.out.println("Digite o valor de B: ");
        b = ler.nextInt();

        if (s >= 1 && s <= 36
                && a >= 1 && a <= 10000
                && b >= 1 && b <= 10000
                && a <= b) {

            for (int i = a; i <= b; i++) {
                int num = i;
                int so = 0;

                while (num > 0) {
                    so += num % 10;
                    num /= 10;
                }

                if (so == s) {
                    pa++;
                }
            }
            System.out.println("\n" + pa);
        } else {
            System.out.println("Valor fora das restricoes");
        }
    }
}
