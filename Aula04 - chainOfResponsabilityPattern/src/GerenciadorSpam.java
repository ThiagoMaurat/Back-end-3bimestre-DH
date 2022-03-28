public class GerenciadorSpam extends Gerenciador {

    @Override
    public void verificar(Mail email) {
        System.out.println("Cai fora: SPAM!");

    } // Fecha o método verificar

} // Fecha a classe
