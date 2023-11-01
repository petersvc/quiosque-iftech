package example.models;

public class Student {
    private final String enrollment;
    private final String name;

    public Student(String enrollment, String name) {
        this.enrollment = enrollment;
        this.name = name;
    }

    public String getEnrollment() {
        return this.enrollment;
    }

    public String getName() {
        return this.name;
    }
}
