public class Ticket {
    private Aluno aluno;
    private String minicursoNome;
    private double preco;

    public Ticket(Aluno aluno, String minicursoNome, double preco) {
        this.aluno = aluno;
        this.minicursoNome = minicursoNome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Matricula do Aluno: " + aluno.matricula() + '\n' + "Nome do Aluno: " + aluno.nome() + "\n" + "Minicurso: " + minicursoNome + '\n' + "Preço: " + preco ;
    }
}
