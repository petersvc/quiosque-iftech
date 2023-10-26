import java.util.HashMap;

public class Quiosque {

    private EstadoQuiosque estado;

    private Minicurso minicursoSelecionado;
    private MockDB mockDB;

    private Aluno aluno;

    public Quiosque(MockDB mockDB) {
        this.estado = new EstadoEmEspera(this);
        this.minicursoSelecionado = null;
        // Carrega os alunos e minicursos
        this.mockDB = mockDB;
    }

    public void identificarUsuario() {
        estado.identificarUsuario();
    }

    public void selecionarProduto() {
        estado.selecionarProduto();
    }

    public void pagarProduto() {
        estado.pagarProduto();
    }

    public Ticket gerarTicket() {
        return estado.gerarTicket();
    }

    public void reiniciar() {
        estado.reiniciar();
    }

    public Aluno getAluno() {
        return this.aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
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

    public MockDB getMockDB() {
        return mockDB;
    }
}
