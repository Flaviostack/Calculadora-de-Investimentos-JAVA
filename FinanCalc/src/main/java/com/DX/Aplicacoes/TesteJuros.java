package com.DX.Aplicacoes;

public class TesteJuros {
    public static void main(String args[]){
        JurosSimples j1 = new JurosSimples(100.00, 0.01,10);
        j1.calcularJuros();

        JurosCompostos jc1 = new JurosCompostos(100,0.02,10);
        jc1.calcularJuros();

    }
}
