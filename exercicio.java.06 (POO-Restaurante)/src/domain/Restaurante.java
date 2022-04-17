package domain;
import java.util.Scanner;

public class Restaurante {
    Scanner scan = new Scanner(System.in);

    public float pesoComida;
    public float pesoSobremesa;
    public int bebida;

    public void tebela(){
        System.out.println("BEM VINDO! CONFIRA A SEGUIR A NOSSA TABELA DE VALORES:\n");
        System.out.println("COMIDA (A KG):\t\tBEBIDA (UNIDADE):\t\tSOMBREMESA (A KG):");
        System.out.println("\tR$ 40,00\t\t\tR$ 02,00\t\t\t\tR$ 50,00");
    }

    public void comida(float c){
        this.pesoComida = c;
        System.out.println("SEU PRATO TEM " + pesoComida + " GRAMAS DE COMIDA.");
    }

    public void bebidaQuantidade(int b){
        this.bebida = b;
        System.out.println("VOCÊ SELECIONOU " + bebida + " UNIDADES DE BEBIDA.");
    }

    public void sobremesaQuantidade(float s){
        this.pesoSobremesa = s;
        System.out.println("VOCÊ SELECIONOU " + pesoSobremesa + " GRAMAS DE SOBREMESA");
    }

    public float comidaConversao(float x){
        this.pesoComida = x;
        float kilos = 1000;
        return x/kilos;
    }

    public float sobremesaConversao(float y){
        this.pesoSobremesa = y;
        float kilos = 1000;
        return y/kilos;
    }

    public void comanda(){
        System.out.println("QUANTIDADE DE COMIDA NO PRATO: " + comidaConversao(pesoComida) + " KILOS");
        System.out.println("QUANTIDADE BEBIDA SELECIONADA: " + bebida + " UNIDADES");
        System.out.println("QUANTIDADE DE SOBREMESA NO PRATO: " + sobremesaConversao(pesoSobremesa) + " KILOS");
    }

    public float calculoComida(float x){
        float valorComida = 40.00F;
        return comidaConversao(pesoComida)*valorComida;
    };

    public float calculoBebida(float y){
        float valorBebida = 2.00F;
        return bebida*valorBebida;
    }

    public float calculoSobremesa(float z){
        float valorSobremesa = 50.00F;
        return sobremesaConversao(pesoSobremesa)*valorSobremesa;
    }

    public void recibo(){
        System.out.println("COMIDA (A KG):\t\tBEBIDA (UNIDADE):\t\tSOBREMESA (A KG):");
        System.out.println("\t"+ "R$ "+ calculoComida(pesoComida)
                + "\t\t\t\t" + "R$ " + calculoBebida(bebida)
                + "\t\t\t\t\t" + " R$" + calculoSobremesa(pesoSobremesa));
    }
}