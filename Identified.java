import static java.lang.Integer.parseInt;

public class Identified implements State {
    private final Kiosk context;

    public Identified(Kiosk context) {
        this.context = context;
    }

    @Override
    public void transitionTo() {
        context.setState(new Processing(context));
    }

    @Override
    public void identifyStudent(String enrollment) throws IllegalStateException {
        throw new IllegalStateException("Você já está identificado.");
    }

    @Override
    public void selectCourse(String courseKey) throws IllegalArgumentException {

        Course course = this.context.coursesRepository.findCourse(courseKey);

        if (parseInt(courseKey) > this.context.coursesRepository.getCourses().size() || parseInt(courseKey) < 1) {
            throw new IllegalArgumentException("A escolha deve ser entre 1 e 4");
        }
        else if (course.getSlots() == 0) {
            throw new IllegalArgumentException("Curso sem vagas.");
        } else {
            System.out.println("Curso '" + course.getName() + "' selecionado.");
            context.setCourse(course);
            this.transitionTo();
        }

    }

    @Override
    public void payment(String cardNumber, String cvv, String expirationDate, String owner) throws IllegalStateException {
        throw new IllegalStateException("Por favor, selecione um minicurso antes de tentar realizar o pagamento.");
    }

    @Override
    public Ticket generateTicket() throws IllegalStateException {
        throw new IllegalStateException("Por favor, selecione um minicurso antes de tentar gerar um ticket.");
    }

}
