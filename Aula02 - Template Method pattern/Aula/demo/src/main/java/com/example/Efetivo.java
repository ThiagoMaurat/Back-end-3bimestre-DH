package com.example;

public class Efetivo extends Funcionario {
    
    private double salarioBase;
    private double desconto;
    private double bonificacao;

    public Efetivo(String nome, String sobrenome, String numeroConta, double salarioBase, double desconto, double bonificacao) {
        super(nome, sobrenome, numeroConta);
        this.salarioBase = salarioBase;
        this.desconto = desconto;
        this.bonificacao = bonificacao;
    }

    @Override
    public double calcularSaldo(){
        return salarioBase + bonificacao - desconto;
    }

    @Override
    public void imprimirRecibo(double quantia){
        System.out.println("Gerado recibo do funcionário efetivo: ");
        System.out.println("Salário: " + quantia);
    }

    @Override
    public void depositar(double quantia){
        System.out.println("Depositado " + quantia + " na conta do funcionário efetivo: ");
    }
}
