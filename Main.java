public class Main {
    public static void main(String[] args) {
        // Criando um quiosque e um banco de dados simulado
        MockDB mockDB = new MockDB();
        Quiosque quiosque = new Quiosque(mockDB);

        // Simulando interações do aluno com o quiosque
        quiosque.identificarUsuario();
        quiosque.selecionarProduto();
        quiosque.pagarProduto();
        quiosque.gerarTicket();
        quiosque.reiniciar();
    }
}
