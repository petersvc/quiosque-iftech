import java.util.HashMap;

public class CoursesRepository {
    private final HashMap<String, Course> courses;

    public CoursesRepository() {
        this.courses = new HashMap<>();
        this.loadCourses();
    }

    public Course findCourse(String key) {
        return courses.getOrDefault(key, null);
    }

    public HashMap<String, Course> getCourses() {
        return this.courses;
    }

    private void loadCourses() {
        int quantidadeDeVagas = 10;
        this.courses.put("1", new Course("ChatGPT em Detalhes", 100.00, quantidadeDeVagas));
        this.courses.put("2", new Course("Blockchain", 90.00, quantidadeDeVagas));
        this.courses.put("3", new Course("IoT", 80.00, quantidadeDeVagas));
        this.courses.put("4", new Course("Realidade Virtual", 70.00, quantidadeDeVagas));
    }
}
