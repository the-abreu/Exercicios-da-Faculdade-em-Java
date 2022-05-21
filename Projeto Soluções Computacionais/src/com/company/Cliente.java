package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    public Cliente(String nome, String cpf, String telefone, String email, String cep) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.cep = cep;
    }

    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String cep;


Scanner scan = new Scanner(System.in);

    int i = 0;

    ArrayList<String>  nomesLista = new ArrayList<>();
    ArrayList<String>  cpfLista = new ArrayList<>();
    ArrayList<String>  telefoneLista = new ArrayList<>();
    ArrayList<String>  emailLista = new ArrayList<>();
    ArrayList<String>  cepLista = new ArrayList<>();

    public Cliente() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void informarNome() {
        System.out.print("INFORME A SEGUIR O NOME DO CLIENTE: ");
    }

    public String cadastrarNome(String nome) {

        String recebeNome = nome;

        return recebeNome;
    }

    public void informarCpf() {
        System.out.print("INFORME A SEGUIR O CPF DO CLIENTE: ");
    }

    public String cadastrarCpf(String cpf) {
        String recebeCpf = cpf;

        return recebeCpf;
    }

    public void informarTelefone() {
        System.out.print("INFORME A SEGUIR O TELEFONE DO CLIENTE: ");
    }

    public String cadastrarTelefone(String telefone) {
        String recebeTelefone = telefone;

        return recebeTelefone;
    }

    public void informarEmail() {
        System.out.print("INFORME A SEGUIR O E-MAIL DO CLIENTE: ");
    }

    public String cadastrarEmail(String cpf) {
        String recebeEmail = email;

        return recebeEmail;
    }

    public void informarCep() {
        System.out.print("INFORME A SEGUIR O CEP DO CLIENTE: ");
    }

    public String cadastrarCep(String cpf) {
        String recebeCep = cep;

        return recebeCep;
    }

    public void cadastroCliente(){


        informarNome();
        nome = scan.nextLine();
        nomesLista.add(nome);

        informarCpf();
        cpf = scan.nextLine();
        cpfLista.add(cpf);

        informarTelefone();
        telefone = scan.nextLine();
        telefoneLista.add(telefone);

        informarEmail();
        email = scan.nextLine();
        emailLista.add(email);

        informarCep();
        cep = scan.nextLine();
        cepLista.add(cep);

        System.out.println("\nCADASTRO CONCLUIDO!");

    }

    public void listaClientes() {
        System.out.println("=================== DADOS DOS CLIENTES ==================== \n");

        for (i = 0 ; i < nomesLista.size(); i++ ){
            System.out.println("-----------------------------------------------------------");
            System.out.println("| NOME: " + nomesLista.get(i));
            System.out.println("| CPF: " + cpfLista.get(i));
            System.out.println("| TELEFONE: " + telefoneLista.get(i));
            System.out.println("| E-MAIL: " + emailLista.get(i));
            System.out.println("| CEP: " + cepLista.get(i));
            System.out.println("-----------------------------------------------------------\n");
        }
        System.out.println("-----------------------------------------------------------");
        System.out.println("|                    FIM DA CONSULTA                      |");
        System.out.println("-----------------------------------------------------------\n");


    }
}
