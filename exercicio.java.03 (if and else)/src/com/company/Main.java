package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float peso;
        float altura;

        System.out.println("Neste programa programa descobriremos o seu IMC!");
        System.out.println("Digite abaixo o seu peso:");
        peso = entrada.nextFloat();

        System.out.println("Excelente! Agora precisamos que voce nos informe sua altura:");
        altura = entrada.nextFloat();

        float quadrado = altura;
        float imc = peso/(altura*quadrado);

        System.out.println("Segue abaixo o seu IMC:");
        System.out.println(imc);

        if (imc < 18.5){
            System.out.println("Voce esta abaixo do peso! :(");
        } else if (imc >= 18.5 && imc <= 25){
            System.out.println("Voce esta com o peso normal! :D");
        } else if (imc > 25 && imc <= 30) {
            System.out.println("Cuidado! Voce está acima do peso! :)");
        } else {
            System.out.println("Essa não! Você se tornou obeso! :´(");
        }
    }
}