package com.DX.Aplicacoes;

public class TesteJuros {
    public static void main(String args[]){
        JurosSimples j1 = new JurosSimples();
        j1.pedirDados();
        j1.calcularJuros();

        JurosCompostos jc1 = new JurosCompostos();
        jc1.pedirDados();
        jc1.calcularJuros();

    }
}
