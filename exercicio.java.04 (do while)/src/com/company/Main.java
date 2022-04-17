package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);

        int numero;
        float n1, n2, soma, sub, mul, div;

        do{

            System.out.println("\nMenu\n");

            System.out.println("1 - Soma\n");
            System.out.println("2 - Subtracao\n");
            System.out.println("3 - Multiplicacao\n");
            System.out.println("4 - Divisao\n");
            System.out.println("5 - Sair\n");

            System.out.println("Escolha sua opcao: ");

            numero = entrada.nextInt();


            switch(numero){

                case 1:
                    System.out.println("\nVocê escolheu: Soma\n");
                    System.out.println("Digite o primeiro número: ");
                    n1 = entrada.nextFloat();
                    System.out.println("Digite o segundo número: ");
                    n2 = entrada.nextFloat();
                    soma = n1 + n2;
                    System.out.println("\nResultado da soma: " + soma);
                    break;

                case 2:
                    System.out.println("\nVocê escolheu: Subtracao\n");
                    System.out.println("Digite o primeiro número: ");
                    n1 = entrada.nextFloat();
                    System.out.println("Digite o segundo número: ");
                    n2 = entrada.nextFloat();
                    sub = n1 - n2;
                    System.out.println("\nResultado da subtração: " + sub);
                    break;

                case 3:
                    System.out.println("\nVocê escolheu: Multiplicacao\n");
                    System.out.println("Digite o primeiro número: ");
                    n1 = entrada.nextFloat();
                    System.out.println("Digite o segundo número: ");
                    n2 = entrada.nextFloat();
                    mul = n1 * n2;
                    System.out.println("\nResultado da multiplicação: " + mul);
                    break;

                case 4:
                    System.out.println("\nVocê escolheu: Divisao\n");
                    System.out.println("Digite o primeiro número: ");
                    n1 = entrada.nextFloat();
                    System.out.println("Digite o segundo número: ");
                    n2 = entrada.nextFloat();
                    div = n1 / n2;
                    System.out.println("\nResultado da divisão: " + div);

            }

        } while (numero != 5);
    }
}