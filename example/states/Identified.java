package example.states;

import example.Kiosk;
import example.models.Course;

import static java.lang.Integer.parseInt;

public class Identified implements State {
    private final Kiosk context;

    public Identified(Kiosk context) {
        this.context = context;
    }

    @Override
    public void transitionTo(State state) {
        context.setState(state);
    }

    @Override
    public void identifyStudent(String enrollment) throws IllegalStateException {
        throw new IllegalStateException("Você já está identificado.");
    }

    @Override
    public void selectCourse(String courseKey) throws IllegalArgumentException {

        Course course = this.context.getCoursesRepository().findCourse(courseKey);
        // Verifica a entrada de dado que representa a escolha do minicurso
        if (parseInt(courseKey) > this.context.getCoursesRepository().getCourses().size() || parseInt(courseKey) < 1) {
            throw new IllegalArgumentException("A escolha deve ser entre 1 e 4");
        }
        // Verifica se há vagas no minicurso escolhido
        else if (course.getSlots() == 0) {
            throw new IllegalArgumentException("Não há vagas para o minicurso " + course.getName());
        // Caso não haja nenhum problema, o minicurso é selecionado e o estado da inscrição é alterado para Processing
        } else {
            System.out.println("Curso '" + course.getName() + "' selecionado.");
            context.setCourse(course);
            this.transitionTo(new Processing(context));
        }

    }

    @Override
    public void payment(String cardNumber, String cvv, String expirationDate, String owner) throws IllegalStateException {
        throw new IllegalStateException("Por favor, selecione um minicurso antes de tentar realizar o pagamento.");
    }

    @Override
    public void generateTicket() throws IllegalStateException {
        throw new IllegalStateException("Por favor, selecione um minicurso antes de tentar gerar um ticket.");
    }

}
