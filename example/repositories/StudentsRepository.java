package example.repositories;

import example.models.Student;

import java.util.HashMap;

public class StudentsRepository {
    private final HashMap<String, Student> students;

    public StudentsRepository() {
        this.students = new HashMap<>();
        this.loadStudents();
    }

    public Student findStudent(String enrollment) {
        return students.getOrDefault(enrollment, null);
    }

    private void loadStudents() {
//        this.students.put("20221370036", new Student("20221370036", "Peter Costa"));
//        this.students.put("20220380037", new Student("20220380037", "Julyana Alencar"));
//        this.students.put("20221390038", new Student("20221390038", "Kilson"));
        this.students.put("1", new Student("1", "João"));
        this.students.put("2", new Student("2", "Maria"));
        this.students.put("3", new Student("3", "José"));
        this.students.put("4", new Student("4", "Ana"));
    }
}
