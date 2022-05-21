package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Filme {

    private int id;
    private String titulo;
    private String diretor;
    private String genero;
    private int duracao;
    private int classificacao;
    private int quantidade;
    private float valor;

    Scanner scan = new Scanner(System.in);

    //DECLARANDO OS ARRAYLISTS

    ArrayList<Integer>  idLista = new ArrayList<>();
    ArrayList<String> tituloLista = new ArrayList<>();
    ArrayList<String>  diretorLista = new ArrayList<>();
    ArrayList<Integer>  duracaoLista = new ArrayList<>();
    ArrayList<String>  generoLista = new ArrayList<>();
    ArrayList<Integer>  classificacaoLista = new ArrayList<>();
    ArrayList<Integer>  quantidadeLista = new ArrayList<>();
    ArrayList<Float>  valorLista = new ArrayList<>();




    public Filme(int id, String titulo, String diretor, int duracao, String genero, int classificacao, int quantidade, float valor) {
        this.id = id;
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
        this.genero = genero;
        this.classificacao = classificacao;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public Filme(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void cadastrarFilme(){

        System.out.printf("INFORME O TÍTULO: ");
        titulo = scan.nextLine();
        tituloLista.add(titulo);

        System.out.print("INFORME O DIRETOR: ");
        diretor = scan.nextLine();
        diretorLista.add(diretor);

        System.out.print("INFORME O GÊNERO: ");
        genero = scan.nextLine();
        generoLista.add(genero);

        System.out.print("INFORME A DURAÇÃO (EM MINUTOS): ");
        duracao = scan.nextInt();
        duracaoLista.add(duracao);

        System.out.print("INFORME A CLASSIFICAÇÃO INDICATIVA: ");
        classificacao = scan.nextInt();
        classificacaoLista.add(classificacao);

        System.out.print("INFORME A QUANTIDADE DE CÓPIAS DISPONÍVEIS: ");
        quantidade = scan.nextInt();
        quantidadeLista.add(quantidade);

        System.out.print("INFORME O VALOR DO ALUGUEL POR UNIDADE: ");
        valor = scan.nextFloat();
        valorLista.add(valor);

        String nome;
        nome = scan.nextLine();

        System.out.println("\nCADASTRO CONCLUIDO!");

    }

    public void consultarFilmes(){

        System.out.println("==================== DADOS DOS FILMES ===================== \n");

        for (int i = 0 ; i < tituloLista.size(); i++ ){
            System.out.println("-----------------------------------------------------------");
            System.out.println("| TÍTULO DO FILME: " + tituloLista.get(i));
            System.out.println("| DIRETOR: " + diretorLista.get(i));
            System.out.println("| GÊNERO: " + generoLista.get(i));
            System.out.println("| DURAÇÃO: " + duracaoLista.get(i) + " MINUTOS");
            System.out.println("| CLASSIFICAÇÃO INDICATIVA: " + classificacaoLista.get(i) + " ANOS");
            System.out.println("| UNIDADES DISPONÍVEIS: " + quantidadeLista.get(i));
            System.out.println("| VALOR POR UNIDADE: R$ " + valorLista.get(i));
            System.out.println("-----------------------------------------------------------\n");
        }
            System.out.println("-----------------------------------------------------------");
            System.out.println("|                    FIM DA CONSULTA                      |");
            System.out.println("-----------------------------------------------------------\n");

    }

}

