import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Kiosk {

    private State state;
    private Course course;
    private Student student;
    StudentsRepository studentsRepository;
    CoursesRepository coursesRepository;
    CreditCardRepository creditCardRepository;

    private Scanner scanner = new Scanner(System.in);

    public Kiosk(StudentsRepository studentsRepository, CoursesRepository coursesRepository, CreditCardRepository creditCardRepository) {
        this.state = new OnHold(this);
        this.course = null;
        this.student = null;
        this.studentsRepository = studentsRepository;
        this.coursesRepository = coursesRepository;
        this.creditCardRepository = creditCardRepository;
    }

    public void start() {
        System.out.println("Quiosque iniciado.");
    }

    public void identifyStudent() {
        System.out.println("Por favor, digite a sua matrícula.");
        String enrollment = this.scanner.nextLine();
        //String matricula = "20221370036";
        try {
            this.state.identifyStudent(enrollment);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void selectCourse() {
        AtomicInteger i = new AtomicInteger(1);
        System.out.println("Por favor, selecione um dos minicursos abaixo.");

        this.coursesRepository.getCourses().entrySet().forEach(course -> {
            System.out.println((i.getAndIncrement()) + " - " + course.getValue().getName() + " | Preço: " + course.getValue().getPrice() + " | Vagas: " + course.getValue().getSlots());
        });

        String courseKey = this.scanner.nextLine();

        try {
            state.selectCourse(courseKey);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void payment() {
        System.out.println("Por favor, digite o número do cartão");
        String cardNumber = this.scanner.nextLine();
        System.out.println(cardNumber);

        System.out.println("Por favor, digite o código de segurança");
        String cvv = this.scanner.nextLine();
        System.out.println(cvv);

        System.out.println("Por favor, digite a data de validade");
        String expirationDate = this.scanner.nextLine();
        System.out.println(expirationDate);

        String owner = this.student.getName();

        try {
            state.payment(cardNumber, cvv, expirationDate, owner);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void generateTicket() {
        try {
            state.generateTicket();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void finalizar() {
        System.out.println("Obrigado por utilizar o quiosque.");
        reset();
    }

    public void reset() {
        this.state = new OnHold(this);
        this.course = null;
        this.student = null;
    }

    public Student getStudent() {
        return this.student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

}
