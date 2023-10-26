public class EstadoEmEspera implements EstadoQuiosque {
    private final Quiosque quiosque;

    public EstadoEmEspera(Quiosque quiosque) {
        this.quiosque = quiosque;
    }

    @Override
    public void identificarUsuario() {
        System.out.println("Por favor, digite sua matrícula.");
        String matricula = "20221370036";
        Aluno aluno = this.quiosque.getMockDB().getAluno(matricula);
        // Lógica de validação da matrícula
        if (aluno != null) {
            System.out.println("Aluno identificado com sucesso.");
            this.quiosque.setAluno(aluno);
            this.quiosque.setEstado(new EstadoIdentificado(quiosque));
        } else {
            System.out.println("Matrícula inválida. Tente novamente.");
        }
    }

    @Override
    public void selecionarProduto() {
        System.out.println("Por favor, identifique-se primeiro.");
    }

    @Override
    public void pagarProduto() {
        System.out.println("Por favor, identifique-se primeiro.");
    }

    @Override
    public Ticket gerarTicket() {
        System.out.println("Por favor, identifique-se primeiro.");
        return null;
    }

    @Override
    public void reiniciar() {
       quiosque.setEstado(new EstadoEmEspera(quiosque));
    }
}
