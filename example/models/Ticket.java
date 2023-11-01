package example.models;

public class Ticket {
    private final Student student;
    private final Course course;

    public Ticket(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Matricula do estudante: " + student.getEnrollment() + '\n' + "Nome do estudante: " + student.getName() + "\n" + "Minicurso: " + course.getName();
    }
}
