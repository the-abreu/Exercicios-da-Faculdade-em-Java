package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int hora, minuto, segundo;
        int hora2, minuto2, segundo2;

        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite na sequência: Hora, minuto e segundos");
        hora = entrada.nextInt();
        minuto = entrada.nextInt();
        segundo = entrada.nextInt();
        System.out.println("Você digitou: " + hora + ":" + minuto + ":" + segundo);

        System.out.println("\nDigite o segundo horario com hora, minuto e segundos");
        hora2 = entrada.nextInt();
        minuto2 = entrada.nextInt();
        segundo2 = entrada.nextInt();
        System.out.println("Você digitou: " + hora2 + ":" + minuto2 + ":" + segundo2 + "\n");

        int hf1 = (hora*3600+minuto*60+segundo); //horario final 1
        int hf2 = (hora2*3600+minuto2*60+segundo2); //horario final 2
        int hftotal = hf1 - hf2; //diferença entre os horários


        System.out.println("A diferença entre os horários em segundos: " + hftotal*-1);
        System.out.println("A diferença de segundos convertida em horas: " + ((hftotal*-1)/3600) + " horas\n");
    }
}
