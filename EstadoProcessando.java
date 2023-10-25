public class EstadoProcessando implements EstadoQuiosque {
    private Quiosque quiosque;

    public EstadoProcessando(Quiosque quiosque) {
        this.quiosque = quiosque;
    }

    @Override
    public void executar() {

    }

    @Override
    public void mudarEstado() {

    }

//    @Override
//    public void iniciar() {
//        System.out.println("Processando pagamento. Aguarde.");
//    }
//
//    @Override
//    public boolean validarAluno(String matricula) {
//        System.out.println("Pagamento em processamento. Aguarde a conclusão.");
//        return false;
//    }
//
//    @Override
//    public void selecionarMinicurso(Minicurso minicurso) {
//        System.out.println("Pagamento em processamento. Aguarde a conclusão.");
//    }
//
//    @Override
//    public boolean informarCartao(CartaoDeCredito cartao) {
//        // Lógica de autorização do cartão
//        if (cartao != null) {
//            System.out.println("Pagamento autorizado. Aguarde a geração do ticket.");
//            quiosque.setEstado(new EstadoInscrito(quiosque));
//            return true;
//        } else {
//            System.out.println("Pagamento não autorizado. Tente novamente.");
//            quiosque.setEstado(new EstadoIdentificado(quiosque));
//            return false;
//        }
//    }
//
//    @Override
//    public Ticket gerarTicket() {
//        System.out.println("Por favor, aguarde a conclusão do pagamento.");
//        return null;
//    }
//
//    @Override
//    public void reiniciar() {
//        quiosque.setEstado(new EstadoEmEspera(quiosque));
//        quiosque.setMinicurso(null);
//    }
}
