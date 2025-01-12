package com.DX.Aplicacoes;

 public abstract class Juros {
    public double capital;
    public double juros;
    public double taxa;
    public int tempoDeAplicacao;
    public double capitalFinal;

    public Juros(double capital, double taxa, int tempoDeAplicacao){
        this.capital = capital;
        this.taxa = taxa;
        this.tempoDeAplicacao = tempoDeAplicacao;
    }

    abstract void calcularJuros();

}
