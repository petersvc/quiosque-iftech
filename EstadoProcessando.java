public class EstadoProcessando implements EstadoQuiosque {
    private final Quiosque quiosque;

    public EstadoProcessando(Quiosque quiosque) {
        this.quiosque = quiosque;
    }

    @Override
    public void identificarUsuario() {
        System.out.println("Pagamento em processamento. Aguarde a conclusão.");
    }

    @Override
    public void selecionarProduto() {
        System.out.println("Pagamento em processamento. Aguarde a conclusão.");
    }

    @Override
    public void pagarProduto() {
        CartaoDeCredito cartao = new CartaoDeCredito("1234-5678-9012-3456", "123", "12/25");
        // Lógica de autorização do cartão
        if (cartao != null) {
            System.out.println("Pagamento autorizado. Aguarde a geração do ticket.");
            quiosque.setEstado(new EstadoInscrito(quiosque));
        } else {
            System.out.println("Pagamento não autorizado. Tente novamente.");
            quiosque.setEstado(new EstadoEmEspera(quiosque));
        }
    }

    @Override
    public Ticket gerarTicket() {
        System.out.println("Por favor, aguarde a conclusão do pagamento.");
        return null;
    }

    @Override
    public void reiniciar() {
        quiosque.setEstado(new EstadoEmEspera(quiosque));
        quiosque.setMinicurso(null);
    }
}
