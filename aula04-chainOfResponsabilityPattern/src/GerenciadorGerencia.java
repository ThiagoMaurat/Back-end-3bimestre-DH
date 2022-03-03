public class GerenciadorGerencia extends Gerenciador {

    @Override
    public void verificar(Mail email) {
        if ((email.getDestino().equalsIgnoreCase("gerencia@colmeia.com")) ||
                (email.getAssunto().equalsIgnoreCase("Gerência"))) {
            System.out.println("Enviado ao departamento da Gerência.");
        }
        else {
            if (this.getSeguinte() != null) {
                this.getSeguinte().verificar(email);
            }
        }

    } // Fecha o método verificar

} // Fecha a classe
