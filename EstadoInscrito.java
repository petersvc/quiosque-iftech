public class EstadoInscrito implements EstadoQuiosque {
    private Quiosque quiosque;

    public EstadoInscrito(Quiosque quiosque) {
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
//        System.out.println("Operação inválida. Já está inscrito em um minicurso.");
//    }
//
//    @Override
//    public boolean validarAluno(String matricula) {
//        System.out.println("Operação inválida. Já está inscrito em um minicurso.");
//        return false;
//    }
//
//    @Override
//    public void selecionarMinicurso(Minicurso minicurso) {
//        System.out.println("Operação inválida. Já está inscrito em um minicurso.");
//    }
//
//    @Override
//    public boolean informarCartao(CartaoDeCredito cartao) {
//        System.out.println("Operação inválida. Já está inscrito em um minicurso.");
//        return false;
//    }
//
//    @Override
//    public Ticket gerarTicket() {
//        Ticket ticket = new Ticket(
//                "MatriculaAluno",  // Substitua pelo valor apropriado
//                quiosque.getMinicursoSelecionado().getNome(),
//                quiosque.getMinicursoSelecionado().getPreco()
//        );
//
//        System.out.println("Inscrição realizada com sucesso. Ticket gerado: " + ticket);
//        quiosque.setEstado(new EstadoFinalizado(quiosque));
//        return ticket;
//    }
//
//    @Override
//    public void reiniciar() {
//        quiosque.setEstado(new EstadoEmEspera(quiosque));
//        quiosque.setMinicurso(null);
//    }
}
