package example.states;

import example.Kiosk;
import example.models.Student;

public class OnHold implements State {
    private final Kiosk context;

    public OnHold(Kiosk context) {
        this.context = context;
    }

    @Override
    public void transitionTo(State state) {
        this.context.setState(state);
    }

    @Override
    public void identifyStudent(String enrollment) throws NullPointerException {

        Student student = this.context.getStudentsRepository().findStudent(enrollment);

        // Lógica de validação da matrícula
        if (student != null) {
            System.out.println("Estudante " + student.getName() + " identificado com sucesso.");
            this.context.setStudent(student);
            this.transitionTo(new Identified(context));
        } else {
            throw new NullPointerException("Matrícula inválida. Tente novamente.");
        }
    }

    @Override
    public void selectCourse(String coursekey) throws IllegalStateException {
        throw new IllegalStateException("Por favor, identifique-se antes de tentar selelecionar o minicurso.");
    }

    @Override
    public void payment(String cardNumber, String cvv, String expirationDate, String owner) throws IllegalStateException {
        throw new IllegalStateException("Por favor, identifique-se antes de tentar fazer o pagamento.");
    }

    @Override
    public void generateTicket() throws IllegalStateException {
        throw new IllegalStateException("Por favor, identifique-se antes de tentar gerar um ticket.");
    }

}
