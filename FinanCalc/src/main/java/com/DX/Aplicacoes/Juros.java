package com.DX.Aplicacoes;
import java.util.Scanner;

public abstract class Juros {
    public double capital;
    public double juros;
    public double taxa;
    public int tempoDeAplicacao;
    Scanner entrada = new Scanner(System.in);

    //Construtores
    public Juros(double capital, double taxa, int tempoDeAplicacao){
        this.capital = capital;
        this.taxa = taxa;
        this.tempoDeAplicacao = tempoDeAplicacao;
    }
    public Juros(){}

    //Métodos
    abstract void calcularJuros();

    public void pedirDados(){
        System.out.print("Digite o valor inicial da aplicação: ");
        capital = entrada.nextDouble();entrada.nextLine();

        System.out.print("Digite a porcentagem da taxa: %");
        taxa = entrada.nextDouble();entrada.nextLine();
        taxa = taxa/100;

        System.out.print("Digite a duração da aplicação em meses: ");
        tempoDeAplicacao = entrada.nextInt();entrada.nextLine();

    }
}
