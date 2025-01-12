package com.DX.Aplicacoes;

    public class JurosSimples extends Juros{
        public JurosSimples(double capital, double taxa, int tempoDeAplicacao){
            super(capital, taxa, tempoDeAplicacao);
        }

        public JurosSimples(){}

        public void calcularJuros(){
            juros = capital*taxa*tempoDeAplicacao;
            double montante =capital+juros;
            System.out.printf("Montante final: R$%.2f\n",montante);
        }

        @Override
        public void pedirDados() {
            System.out.println("----------JUROS SIMPLES----------");
            super.pedirDados();
        }
}
