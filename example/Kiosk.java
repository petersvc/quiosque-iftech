package example;

import example.models.Course;
import example.models.Student;
import example.repositories.CoursesRepository;
import example.repositories.CreditCardsRepository;
import example.repositories.StudentsRepository;
import example.repositories.TicketsRepository;
import example.states.OnHold;
import example.states.State;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Kiosk {

    // Iniciando o Kiosk com o estado OnHold
    private State state = new OnHold(this);;
    private Course course = null;;
    private Student student = null;

    StudentsRepository studentsRepository;
    CoursesRepository coursesRepository;
    CreditCardsRepository creditCardsRepository;
    TicketsRepository ticketsRepository;
    private final Scanner scanner = new Scanner(System.in);

    public Kiosk(StudentsRepository studentsRepository, CoursesRepository coursesRepository, CreditCardsRepository creditCardsRepository, TicketsRepository ticketsRepository) {
        this.studentsRepository = studentsRepository;
        this.coursesRepository = coursesRepository;
        this.creditCardsRepository = creditCardsRepository;
        this.ticketsRepository = ticketsRepository;
    }

    public void start() {
        System.out.println("Quiosque iniciado.");
        this.execute();
    }

    // método que executa o fluxo de inscrição em um minicurso
    public void execute() {
        // enquanto houver vagas disponíveis executa o fluxo
        while (ticketsRepository.getTickets().size() < coursesRepository.getSlots()) {

            System.out.println(coursesRepository.getSlots() - ticketsRepository.getTickets().size() + " vagas restantes.");
            // identifica o estudante
            if (this.getStudent() == null) {
                this.identifyStudent();
            }
            // seleciona o minicurso
            if (this.getCourse() == null) {
                this.selectCourse();
            }
            // realiza o pagamento
            this.payment();
            // gera o ticket se o pagamento for aprovado, caso contrário, reinicia o fluxo
            if (this.getState() instanceof OnHold) {
                this.reset();
                this.execute();
            } else {
                this.generateTicket();
                this.restart();
            }

        }

        System.out.println("Não há mais vagas disponíveis. Encerrando o atendimento.");

    }

    public void identifyStudent() {

        System.out.println("\n---------------- Identificação ----------------\n");
        System.out.println("Por favor, digite a sua matrícula.");
        String enrollment = this.scanner.nextLine();

        try {
            this.state.identifyStudent(enrollment);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void selectCourse() {

        AtomicInteger i = new AtomicInteger(1);
        System.out.println("\n---------------- Inscrição em um minicurso ----------------");
        System.out.println("\nPor favor, selecione um dos minicursos abaixo.\n");
        // percorre o HashMap de cursos e imprime as opções
        this.coursesRepository.getCourses().forEach((key, value) -> System.out.println((i.getAndIncrement()) + " - " + value.getName() + " | Preço: " + value.getPrice() + " | Vagas: " + value.getSlots()));

        String courseKey = this.scanner.nextLine();

        try {
            state.selectCourse(courseKey);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void payment() {
        System.out.println("\n---------------- Pagamento ----------------\n");
        System.out.println("Por favor, digite o número do cartão");
        String cardNumber = this.scanner.nextLine();

        System.out.println("Por favor, digite o código de segurança");
        String cvv = this.scanner.nextLine();

        System.out.println("Por favor, digite a data de validade");
        String expirationDate = this.scanner.nextLine();

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

    public void restart() {
        System.out.println("Obrigado por utilizar o quiosque.\n");
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

    public State getState() {
        return this.state;
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

    public StudentsRepository getStudentsRepository() {
        return studentsRepository;
    }

    public CoursesRepository getCoursesRepository() {
        return coursesRepository;
    }

    public CreditCardsRepository getCreditCardsRepository() {
        return creditCardsRepository;
    }

    public TicketsRepository getTicketsRepository() {
        return ticketsRepository;
    }

}
