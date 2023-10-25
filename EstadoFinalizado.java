public class EstadoFinalizado implements EstadoQuiosque {
    private Quiosque quiosque;

    public EstadoFinalizado(Quiosque quiosque) {
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
//        System.out.println("Operação inválida. A operação foi finalizada. Reinicie o quiosque.");
//    }
//
//    @Override
//    public boolean validarAluno(String matricula) {
//        System.out.println("Operação inválida. A operação foi finalizada. Reinicie o quiosque.");
//        return false;
//    }
//
//    @Override
//    public void selecionarMinicurso(Minicurso minicurso) {
//        System.out.println("Operação inválida. A operação foi finalizada. Reinicie o quiosque.");
//    }
//
//    @Override
//    public boolean informarCartao(CartaoDeCredito cartao) {
//        System.out.println("Operação inválida. A operação foi finalizada. Reinicie o quiosque.");
//        return false;
//    }
//
//    @Override
//    public Ticket gerarTicket() {
//        System.out.println("Operação inválida. A operação foi finalizada. Reinicie o quiosque.");
//        return null;
//    }
//
//    @Override
//    public void reiniciar() {
//        quiosque.setEstado(new EstadoEmEspera(quiosque));
//        quiosque.setMinicurso(null);
//        System.out.println("Quiosque reiniciado. Aguardando identificação do aluno.");
//    }
}
