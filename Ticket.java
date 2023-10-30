public class Ticket {
    private Student student;
    private String minicursoNome;
    private double preco;

    public Ticket(Student student, String minicursoNome, double preco) {
        this.student = student;
        this.minicursoNome = minicursoNome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Matricula do estudante: " + student.getEnrollment() + '\n' + "Nome do estudante: " + student.getName() + "\n" + "Minicurso: " + minicursoNome + '\n' + "Preço: " + preco ;
    }
}
