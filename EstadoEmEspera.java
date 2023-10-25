public class EstadoEmEspera implements EstadoQuiosque {
    private Quiosque quiosque;

    public EstadoEmEspera(Quiosque quiosque) {
        this.quiosque = quiosque;
    }

    @Override
    public void executar() {
        System.out.println("Quiosque iniciado. Aguardando identificação do aluno.");
    }

    @Override
    public void mudarEstado() {
        quiosque.setEstado(new EstadoIdentificado(quiosque));
    }


    public boolean validarAluno(String matricula) {
        // Lógica de validação da matrícula
        if (matricula != null && !matricula.isEmpty()) {
            System.out.println("Aluno identificado com sucesso.");
            return true;
        } else {
            System.out.println("Matrícula inválida. Tente novamente.");
            return false;
        }
    }

}
