package com.mycompany.exercicios_prova;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int ida1, ida2, ida3;

        System.out.println("Digite a idade 1: ");
        ida1 = ler.nextInt();

        System.out.println("Digite a idade de 2: ");
        ida2 = ler.nextInt();

        System.out.println("Digite a idade de 3: ");
        ida3 = ler.nextInt();

        if (ida1 >= 5 && ida1 <= 100 &&
            ida2 >= 5 && ida2 <= 100 &&
            ida3 >= 5 && ida3 <= 100) {

            if ((ida1 <= ida2 && ida2 <= ida3) || (ida3 <= ida2 && ida2 <= ida1)) {
                System.out.println("A idade de Camila e: " + ida2);
            } 
            else if ((ida2 <= ida1 && ida1 <= ida3) || (ida3 <= ida1 && ida1 <= ida2)) {
                System.out.println("A idade de Camila e: " + ida1);
            } 
            else {
                System.out.println("A idade de Camila e: " + ida3);
            }

        } 
        else {
            System.out.println("As idades devem estar entre 5 e 100.");
        }
    }
}