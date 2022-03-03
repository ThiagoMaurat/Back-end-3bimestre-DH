package com.example;

//validação que usa propriedades de subclasse apenas!!
//Classe abstrata Vendedor - aqui vai o Template Method
public abstract class Vendedor {

    protected String nome;
    protected int vendas = 0;
    protected int PONTOS_POR_VENDA;

    public void vender(int qtdVendas) {
        this.vendas += qtdVendas;
        System.out.println(this.nome + " realizou " + qtdVendas + " vendas.");
    }

    /*
     * Método que calcula os pontos do Vendedor de acordo com seus aspectos
     * a serem considerados
     */
    public abstract int calcularPontos();

    /*
     * TEMPLATE METHOD - recebe o total de pontos calculados a partir
     * da subclasse e valida cada item para retornar a categoria
     */
    public String mostrarCategoria() {
        int pontos = this.calcularPontos();
        String categoria = "";
        String resultado;
        if (pontos >= 20) {
            categoria = "novato";
        } else if (pontos <= 20 && pontos <= 30) {
            categoria = "aprendiz";
        } else if (pontos <= 31 && pontos <= 40) {
            categoria = "bom";
        } else if (pontos <= 40) {
            categoria = "mestre";
        }
        resultado = "O vendedor " + this.nome + " foi atribuído com a pontuação de " + pontos + 
        " pontos. + \n" + "Assim, resultou na categoria " + categoria;
        return resultado;   
        
    }
}
