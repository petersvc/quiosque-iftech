public class EstadoInscrito implements EstadoQuiosque {
    private final Quiosque quiosque;

    public EstadoInscrito(Quiosque quiosque) {
        this.quiosque = quiosque;
    }

    @Override
    public void identificarUsuario() {
        System.out.println("Operação inválida. Já está inscrito em um minicurso.");
    }

    @Override
    public void selecionarProduto() {
        System.out.println("Operação inválida. Já está inscrito em um minicurso.");
    }

    @Override
    public void pagarProduto() {
        System.out.println("Operação inválida. Já está inscrito em um minicurso.");
    }

    @Override
    public Ticket gerarTicket() {
        Ticket ticket = new Ticket(
                quiosque.getAluno(),  // Substitua pelo valor apropriado
                quiosque.getMinicursoSelecionado().nome(),
                quiosque.getMinicursoSelecionado().preco()
        );

        System.out.println("Inscrição realizada com sucesso");
        quiosque.setEstado(new EstadoFinalizado(quiosque));
        System.out.println("-------- Ticket gerado --------\n" + ticket + "\n" + "-------------------------------");
        return ticket;
    }

    @Override
    public void reiniciar() {
        quiosque.setEstado(new EstadoEmEspera(quiosque));
        quiosque.setMinicurso(null);
    }
}
