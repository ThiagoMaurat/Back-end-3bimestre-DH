package com.example;

public class Estagiario extends Vendedor {
    private int vendas;

    public Estagiario(String nome, int vendas) {
        super.nome = nome;
        super.PONTOS_POR_VENDA = 5;
        this.vendas = vendas;
    }

    @Override
    public int calcularPontos() {
        return this.vendas * PONTOS_POR_VENDA;
    }

    @Override
    public String mostrarCategoria() {
        String resultado;
        String categoria;
        if (calcularPontos() < 50) {
            categoria = "Estagiário Novato";
        } else {
            categoria = "Estagiário Experiente";
        }
        resultado = "O estagiário " + this.nome + " foi atribuído com a pontuação de " + calcularPontos()
                + " pontos. + \n"
                + "Assim, resultou na categoria " + categoria;
        return resultado;
    }
}
