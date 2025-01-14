package com.DX.Aplicacoes;

    class JurosCompostos extends Juros {
        public JurosCompostos(double capital, double taxa, int tempoDeAplicacao) {
            super(capital, taxa, tempoDeAplicacao);
        }
        public JurosCompostos(){}

        @Override
       public void calcularJuros() {
            double montante =capital*(Math.pow((1+taxa),tempoDeAplicacao)) ;
            System.out.printf("O montante final com juros compostos é de: R$%.2f\n" , montante);
        }

        @Override
        public void pedirDados() {
            System.out.println("----------JUROS COMPOSTOS----------");
            super.pedirDados();
        }
    }
