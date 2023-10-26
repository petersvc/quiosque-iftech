public class EstadoFinalizado implements EstadoQuiosque {
    private final Quiosque quiosque;

    public EstadoFinalizado(Quiosque quiosque) {
        this.quiosque = quiosque;
    }

    @Override
    public void identificarUsuario() {
        System.out.println("Operação inválida. A operação foi finalizada. Reinicie o quiosque.");
    }

    @Override
    public void selecionarProduto() {
        System.out.println("Operação inválida. A operação foi finalizada. Reinicie o quiosque.");
    }

    @Override
    public void pagarProduto() {
        System.out.println("Operação inválida. A operação foi finalizada. Reinicie o quiosque.");
    }

    @Override
    public Ticket gerarTicket() {
        System.out.println("Operação inválida. A operação foi finalizada. Reinicie o quiosque.");
        return null;
    }

    @Override
    public void reiniciar() {
        quiosque.setEstado(new EstadoEmEspera(quiosque));
        quiosque.setMinicurso(null);
        System.out.println("Quiosque reiniciado. Aguardando identificação do aluno.");
    }
}
