package model;

public class Filial {
    private Integer id;
    private String nome_da_filial;
    private String rua;
    private String numero;
    private String cidade;
    private String estado;
    private Boolean e5estrelas;

    public Filial(){

    }

    public Filial(Integer id, String nome_da_filial, String rua, String numero, String cidade, String estado, Boolean e5estrelas) {
        this.id = id;
        this.nome_da_filial = nome_da_filial;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.e5estrelas = e5estrelas;
    }

    public Filial(String nome_da_filial, String rua, String numero, String cidade, String estado, Boolean e5estrelas) {
        this.nome_da_filial = nome_da_filial;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.e5estrelas = e5estrelas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome_da_filial() {
        return nome_da_filial;
    }

    public void setNome_da_filial(String nome_da_filial) {
        this.nome_da_filial = nome_da_filial;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Boolean getE5estrelas() {
        return e5estrelas;
    }

    public void setE5estrelas(Boolean e5estrelas) {
        this.e5estrelas = e5estrelas;
    }

    @Override
    public String toString() {
        return "Filial{" +
                "id=" + id +
                ", nome_da_filial='" + nome_da_filial + '\'' +
                ", rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", e5estrelas=" + e5estrelas +
                '}';
    }
}
