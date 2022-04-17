package com.company;

import domain.Restaurante;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        Scanner scan = new Scanner(System.in);
        char resposta = 'N';
        float comida, sobremesa;
        int bebida;

        System.out.println("\n--------------------RESTAURANTE--------------------\n");
        restaurante.tebela();
        do{
            System.out.println("\nGOSTARIA DE COMPRAR CONOSCO? DIGITE [S/N]");
            resposta = scan.next().charAt(0);

            switch (resposta){
                case 'S':
                case 's':
                    System.out.println("==================================================");
                    System.out.println("SELECIONE OS SEUS PEDIDOS: \n");
                    System.out.println("DIGITE QUANTAS GRAMAS DE COMIDA TEM NO PRATO:");
                    comida = scan.nextFloat();
                    restaurante.comida(comida);

                    System.out.println("\nDIGITE QUANTAS UNIDADES DE BEBIDA VOCÊ QUER COMPRAR:");
                    bebida = scan.nextInt();
                    restaurante.bebidaQuantidade(bebida);

                    System.out.println("\nDIGITE QUANTAS GRAMAS DE SOBREMESA TEM NO PRATO:");
                    sobremesa = scan.nextFloat();
                    restaurante.sobremesaQuantidade(sobremesa);

                    System.out.println("\n----------------------------------------------");
                    System.out.println("SEGUE ABAIXO A COMANDA DOS SEUS PEDIDOS: ");
                    System.out.println("-------------------------------------------------");
                    restaurante.comanda();

                    System.out.println("\n-------------------------------------------------");
                    System.out.println("SEGUE ABAIXO O RECIBO: ");
                    System.out.println("-------------------------------------------------");
                    restaurante.recibo();
                    break;

                case 'N':
                    break;

                default:
                    System.out.println("DIGITE APENAS 'S' OU 'N' EM MAIÚSCULO");
            }

        }while(resposta != 'N');
        System.out.println("TUDO BEM! ESTAREMOS LHE AGUARDANDO PARA UMA PRÓXIMA OCASIÃO! ATÉ BREVE! \n");
    }
}
