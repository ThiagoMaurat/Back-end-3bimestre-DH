package model;

public class Tigre {
    
    private static final Logger logger = Logger.getLogger(Leao.class);
    private String nome;
    private int idade;
    private boolean eAlfa;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public boolean iseAlfa() {
        return eAlfa;
    }
    public void seteAlfa(boolean eAlfa) {
        this.eAlfa = eAlfa;
    }

    public void correr(){
        logger.info("O tigre " + nome + " está correndo!");
    }
    
    public void eMaiorQue10() throws Exception{
        if (idade > 10){
            logger.info("O tigre " + nome + " é maior que 10 anos!");
        }
        if(idade < 0){
            logger.error("A idade não pode ser negativa!");
            throw new Exception();
        }
    }
}
