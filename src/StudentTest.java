import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    @Test
    public void testAddCourseAndGPA() {
        Student s = new Student("Alice", 1);
        Course c1 = new Course("Math", "M101", "Dr. Smith");
        c1.addGrade(new Grade("Exam1", 90, 0.5, "2025-10-01"));
        c1.addGrade(new Grade("Exam2", 80, 0.5, "2025-11-01"));

        Course c2 = new Course("History", "H201", "Dr. Jones");
        c2.addGrade(new Grade("Essay", 85, 1.0, "2025-10-15"));

        s.addCourse(c1);
        s.addCourse(c2);

        assertTrue(s.calculateGPA() > 0);
    }
}
