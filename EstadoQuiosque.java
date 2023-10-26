public interface EstadoQuiosque {
    void identificarUsuario();
    void selecionarProduto();
    void pagarProduto();
    Ticket gerarTicket();
    void reiniciar();
}
