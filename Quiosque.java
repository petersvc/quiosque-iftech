public class Quiosque {

    private EstadoQuiosque estado;
    private Minicurso minicursoSelecionado;

    public Quiosque() {
        this.estado = new EstadoEmEspera(this);
        this.minicursoSelecionado = null;
    }

    public void iniciar() {
        estado.iniciar();
    }

    public EstadoQuiosque getEstado() {
        return estado;
    }

    public void setEstado(EstadoQuiosque estado) {
        this.estado = estado;
    }

    public Minicurso getMinicursoSelecionado() {
        return minicursoSelecionado;
    }

    public void setMinicurso(Minicurso minicurso) {
        this.minicursoSelecionado = minicurso;
    }

    public boolean validarAluno(String matricula) {
        return estado.validarAluno(matricula);
    }

    public void selecionarMinicurso(Minicurso minicurso) {
        estado.selecionarMinicurso(minicurso);
    }

    public boolean informarCartao(CartaoDeCredito cartao) {
        return estado.informarCartao(cartao);
    }

    public Ticket gerarTicket() {
        return estado.gerarTicket();
    }

    public void reiniciar() {
        estado.reiniciar();
    }
}
