package com.company;

import domain.Calculadora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scan = new Scanner(System.in);

        int num;

        do {
            System.out.println("\n---------MENU---------\n");

            System.out.println("[1] - SOMA\n");
            System.out.println("[2] - SUBTRAÇÃO\n");
            System.out.println("[3] - MULTIPLICAÇÃO\n");
            System.out.println("[4] - DIVISÃO\n");
            System.out.println("[5] - SAIR\n");

            System.out.println("DIGITE UM N° REFERENTE AS OPÇÕES ACIMA: ");
            num = scan.nextInt();

            switch (num) {
                case 1 -> calculadora.soma();
                case 2 -> calculadora.sub();
                case 3 -> calculadora.mul();
                case 4 -> calculadora.div();
                default -> System.out.println("DIGITE UM NÚMERO ENTRE 1 E 5");
            }
        }while (num != 5);
    }
}
