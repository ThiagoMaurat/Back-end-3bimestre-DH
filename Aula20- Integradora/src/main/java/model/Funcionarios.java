package model;

import java.io.Serializable;

public class Funcionarios implements Serializable {
    private String nome;
    private String sobrenome;
    private String documento_identificacao;
    private Double salario;

    public Funcionarios(String nome, String sobrenome, String documento_identificacao, Double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.documento_identificacao = documento_identificacao;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDocumento_identificacao() {
        return documento_identificacao;
    }

    public void setDocumento_identificacao(String documento_identificacao) {
        this.documento_identificacao = documento_identificacao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionarios{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", documento_identificacao='" + documento_identificacao + '\'' +
                ", salario=" + salario +
                '}';
    }
}
