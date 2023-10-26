import java.util.HashMap;

public class MockDB {

    private final HashMap<String, Aluno> alunos;
    private final HashMap<String, Minicurso> minicursos;

    public MockDB() {
        this.alunos = new HashMap<>();
        this.minicursos = new HashMap<>();
        carregarAlunos();
        carregarMinicursos();
    }

    public Aluno getAluno(String matricula) {
        return alunos.getOrDefault(matricula, null);
    }

    private void carregarAlunos() {
        this.alunos.put("20221370036", new Aluno("20221370036", "Peter Costa"));
        this.alunos.put("20220380037", new Aluno("20220380037", "Julyana Alencar"));
        this.alunos.put("20221390038", new Aluno("20221390038", "Kilson"));
    }

    public Minicurso getMinicurso(String nome) {
        return minicursos.getOrDefault(nome, null);
    }

    public void carregarMinicursos() {
        int quantidadeDeVagas = 10;
        this.minicursos.put("ChatGPT em Detalhes", new Minicurso("ChatGPT em Detalhes", 100.00, quantidadeDeVagas));
        this.minicursos.put("Blockchain", new Minicurso("Blockchain", 90.00, quantidadeDeVagas));
        this.minicursos.put("IoT", new Minicurso("IoT", 80.00, quantidadeDeVagas));
        this.minicursos.put("Realidade Virtual", new Minicurso("Realidade Virtual", 70.00, quantidadeDeVagas));
    }
}
