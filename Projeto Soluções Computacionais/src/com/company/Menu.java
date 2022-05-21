package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    Cliente cliente = new Cliente();
    Filme filme = new Filme();


    public void executar(){

        String[] recebeNome = new String [100];
        String[] recebeCpf = new String[100];
        String[] recebeTelefone = new String[100];
        String[] recebeEmail = new String[100];
        String[] recebeCep = new String[100];

        //String[] nomeFilme = new String[];

        ArrayList<String>  minhaLista = new ArrayList<>();
        String nomeFilme;

        int i = 0;
        int indice = i++ + 1;
        int clientesCadastrados = i++;

        int[] totalClientes = new int[clientesCadastrados];

        //classes
        Scanner scan = new Scanner(System.in);
        Menu menu = new Menu();
        Cliente cliente = new Cliente();

        //variáveis
        int num;
        String nome, cpf, telefone, email, cep;


        System.out.println("\n---------------------INICIO DO PROGRAMA--------------------\n");

        menu.exibirMenu();

        do{

            System.out.println("==================== ESCOLHA SUA OPÇÃO ====================");
            System.out.printf("\nDIGITE UM NÚMERO ENTRE 1 E 7 PARA UTILIZAR O MENU: ");
            num = scan.nextInt();

            switch (num){

                case 1:
                    menu.realizarAluguel();
                    break;

                case 2:
                    menu.cadastrarCliente();
                    cliente.cadastroCliente();
                    break;

                case 3:
                    menu.consultarCliente();
                    cliente.listaClientes();

                    break;

                case 4:
                    menu.cadastrarFilme();
                    filme.cadastrarFilme();
                    /*System.out.println("DIGITE O NOME DO FILME");
                    nomeFilme = scan.nextLine();
                    nomeFilme = scan.nextLine();
                    minhaLista.add(nomeFilme);*/

                    break;

                case 5:
                    menu.consultarFilme();
                    filme.consultarFilmes();

                    /*for (int is = 0; is < minhaLista.size(); is++){
                        System.out.println("TITULO DO FILME: " + minhaLista.get(is));

                    }*/

                    //System.out.println("TITULO DO FILME: " + minhaLista.get(0));
                    break;

                case 6:
                    menu.pendencias();
                    break;

                case 7:
                    menu.sair();
                    break;

                default:
                    menu.mensagemDefault();
                    break;

            }

        }while(num != 7);

        System.out.println("--------------------PROGRAMA FINALIZADO--------------------");
    }

    public void exibirMenu(){

        System.out.println("-----------------------------------------------------------");
        System.out.println("| \t\t   [1] REALIZAR ALUGUEL                            |");
        System.out.println("| \t\t   [2] CADASTRAR CLIENTE                           |");
        System.out.println("| \t\t   [3] CONSULTAR CLIENTE                           |");
        System.out.println("| \t\t   [4] CADASTRAR FILME                             |");
        System.out.println("| \t\t   [5] CONSULTAR FILME                             |");
        System.out.println("| \t\t   [6] ALUGUEIS PENDENTES                          |");
        System.out.println("| \t\t   [7] SAIR                                        |");
        System.out.println("-----------------------------------------------------------\n");

    }

    public void realizarAluguel(){
        System.out.println("\nVOCÊ SELECIONOU: [1] REALIZAR ALUGUEL\n");
    }

    public void cadastrarCliente(){
        System.out.println("\nVOCÊ SELECIONOU: [2] CADASTRAR CLIENTE\n");
    }

    public void consultarCliente(){
        System.out.println("\nVOCÊ SELECIONOU: [3] CONSULTAR CLIENTE\n");
    }

    public void cadastrarFilme(){
        System.out.println("\nVOCÊ SELECIONOU: [4] CADASTRAR FILME\n");
    }

    public void consultarFilme(){
        System.out.println("\nVOCÊ SELECIONOU: [5] CONSULTAR FILME\n");
    }

    public void pendencias(){
        System.out.println("\nVOCÊ SELECIONOU: [6] ALUGUEIS PENDENTES\n");
    }

    public void sair(){
        System.out.println("\nVOCÊ SELECIONOU: [7] SAIR\n");
    }

    public void mensagemDefault(){
        System.out.println("\n[ALERTA] VOCÊ DEVE SELECIONAR UM NÚMERO ENTRE 1 E 7 PARA UTILIZAR O MENU!\n");
    }
}
