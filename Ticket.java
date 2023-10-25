public class Ticket {
    private String alunoMatricula;
    private String minicursoNome;
    private double preco;

    public Ticket(String alunoMatricula, String minicursoNome, double preco) {
        this.alunoMatricula = alunoMatricula;
        this.minicursoNome = minicursoNome;
        this.preco = preco;
    }

    public String getAlunoMatricula() {
        return alunoMatricula;
    }

    public String getMinicursoNome() {
        return minicursoNome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "alunoMatricula='" + alunoMatricula + '\'' +
                ", minicursoNome='" + minicursoNome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
