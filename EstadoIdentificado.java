public class EstadoIdentificado implements EstadoQuiosque {
    private Quiosque quiosque;

    public EstadoIdentificado(Quiosque quiosque) {
        this.quiosque = quiosque;
    }

    @Override
    public void identificarUsuario() {
        System.out.println("Você já está identificado como aluno.");
    }

    @Override
    public void selecionarProduto() {
        Minicurso minicurso = quiosque.getMockDB().getMinicurso("ChatGPT em Detalhes");
        quiosque.setMinicurso(minicurso);
        System.out.println("Minicurso '" + minicurso.nome() + "' selecionado.");
        quiosque.setEstado(new EstadoProcessando(quiosque));
    }

    @Override
    public void pagarProduto() {
        System.out.println("Por favor, selecione um minicurso primeiro.");
    }

    @Override
    public Ticket gerarTicket() {
        System.out.println("Por favor, selecione um minicurso primeiro.");
        return null;
    }

    @Override
    public void reiniciar() {
        quiosque.setEstado(new EstadoEmEspera(quiosque));
    }
}
