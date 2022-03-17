package model;

import java.util.List;

public class Empresa implements java.io.Serializable {
    private String CNPJ;
    private String razao_social;
    private List<Funcionarios> funcionarios;

    public Empresa(String CNPJ, String razao_social, List<Funcionarios> funcionarios) {
        this.CNPJ = CNPJ;
        this.razao_social = razao_social;
        this.funcionarios = funcionarios;
    }

    public Empresa(Empresa readObject) {
        this.CNPJ = readObject.CNPJ;
        this.razao_social = readObject.razao_social;
        this.funcionarios = readObject.funcionarios;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public List<Funcionarios> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionarios> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "CNPJ='" + CNPJ + '\'' +
                ", razao_social='" + razao_social + '\'' +
                '}';
    }
}
