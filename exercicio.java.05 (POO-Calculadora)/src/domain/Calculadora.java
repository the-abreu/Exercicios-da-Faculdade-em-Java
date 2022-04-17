package domain;

import java.util.Scanner;

public class Calculadora {


    public int num;
    public float n1, n2, soma, sub, mul, div;

    Scanner scan = new Scanner(System.in);

    public void somaDoisNumeros(int num1, int num2){
        System.out.println("Soma de dois números: " + (num1 + num2));
    }

    public void soma(){
        System.out.println("\nVOCÊ ESCOLHEU: SOMA");
        System.out.println("DIGITE O PRIMEIRO NÚMERO: ");
        n1 = scan.nextFloat();
        System.out.println("DIGITE O SEGUNDO NÚMERO: ");
        n2 = scan.nextFloat();
        soma = n1 - n2;
        System.out.println("\nRESULTADO DA SOMA: " + soma);

    }

    public void sub(){
        System.out.println("\nVOCÊ ESCOLHEU: SUBTRAÇÃO");
        System.out.println("DIGITE O PRIMEIRO NÚMERO: ");
        n1 = scan.nextFloat();
        System.out.println("DIGITE O SEGUNDO NÚMERO: ");
        n2 = scan.nextFloat();
        sub = n1 - n2;
        System.out.println("\nRESULTADO DA SUBTRAÇÃO: " + sub);

    }

    public void mul(){
        System.out.println("\nVOCÊ ESCOLHEU: MULTIPLICAÇÃO");
        System.out.println("DIGITE O PRIMEIRO NÚMERO: ");
        n1 = scan.nextFloat();
        System.out.println("DIGITE O SEGUNDO NÚMERO: ");
        n2 = scan.nextFloat();
        mul = n1 * n2;
        System.out.println("\nRESULTADO DA MULTIPLICAÇÃO: " + mul);
    }

    public void div(){
        System.out.println("\nVOCÊ ESCOLHEU: DIVISÃO");
        System.out.println("DIGITE O PRIMEIRO NÚMERO: ");
        n1 = scan.nextFloat();
        System.out.println("DIGITE O SEGUNDO NÚMERO: ");
        n2 = scan.nextFloat();
        div = n1 / n2;
        System.out.println("\nRESULTADO DA DIVISÃO: " + div);
    }

}