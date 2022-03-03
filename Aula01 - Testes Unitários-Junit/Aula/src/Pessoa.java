import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private LocalDate idade;
    private List<String> colecao = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
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

    public LocalDate getIdade() {
        return idade;
    }

    public void setIdade(LocalDate idade) {
        this.idade = idade;
    }

    public List<String> getColecao() {
        return colecao;
    }

    public void setColecao(List<String> colecao) {
        this.colecao = colecao;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public List<String> adicionarNome(Pessoa pessoa){
        int var = pessoa.getNome().length();
        int idade = pessoa.calcIdade();
        if (var >= 5 && idade > 18) {
            this.colecao.add(pessoa.getNome());
            System.out.println(colecao);
        }
        return null;
        }


    public int calcIdade(){
        int idade = Period.between(this.idade, LocalDate.of(2022,02,21)).getYears();
        return idade;
    }
}
