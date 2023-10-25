public class EstadoIdentificado implements EstadoQuiosque {
    private Quiosque quiosque;

    public EstadoIdentificado(Quiosque quiosque) {
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
//        System.out.println("Aluno já identificado. Escolha um minicurso.");
//    }
//
//    @Override
//    public boolean validarAluno(String matricula) {
//        System.out.println("Você já está identificado como aluno.");
//        return true;  // Já está identificado, não precisa validar novamente
//    }
//
//    @Override
//    public void selecionarMinicurso(Minicurso minicurso) {
//        quiosque.setMinicurso(minicurso);
//        System.out.println("Minicurso '" + minicurso.getNome() + "' selecionado.");
//        quiosque.setEstado(new EstadoProcessando(quiosque));
//    }
//
//    @Override
//    public boolean informarCartao(CartaoDeCredito cartao) {
//        System.out.println("Por favor, selecione um minicurso primeiro.");
//        return false;
//    }
//
//    @Override
//    public Ticket gerarTicket() {
//        System.out.println("Por favor, selecione um minicurso primeiro.");
//        return null;
//    }
//
//    @Override
//    public void reiniciar() {
//        quiosque.setEstado(new EstadoEmEspera(quiosque));
//    }
}
