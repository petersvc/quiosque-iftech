import java.util.HashMap;

public class CoursesRepository {
    private final HashMap<String, Course> courses = new HashMap<>();;
    private final int slots;

    public CoursesRepository() {
        this.loadCourses();
        this.slots = this.courses.values().stream()
                .mapToInt(Course::getSlots)
                .sum();
    }

    public Course findCourse(String key) {
        return courses.getOrDefault(key, null);
    }

    public HashMap<String, Course> getCourses() {
        return this.courses;
    }

    private void loadCourses() {
        this.courses.put("1", new Course("ChatGPT em Detalhes", 100.00, 10));
        this.courses.put("2", new Course("Blockchain", 90.00, 10));
        this.courses.put("3", new Course("IoT", 80.00, 10));
        this.courses.put("4", new Course("Realidade Virtual", 70.00, 10));
    }

    public int getSlots() {
        return this.slots;
    }
}
