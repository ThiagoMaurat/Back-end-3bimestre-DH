public class GerenciadorTecnica extends Gerenciador {

    @Override
    public void verificar(Mail email) {
        if ((email.getDestino().equalsIgnoreCase("tecnica@colmeia.com")) ||
                (email.getAssunto().equalsIgnoreCase("Técnica"))) {
            System.out.println("Enviado ao departamento da Técnica.");
        }
        else {
            if (this.getSeguinte() != null) {
                this.getSeguinte().verificar(email);
            }
        }

    } // Fecha o método verificar

} // Fecha a classe
