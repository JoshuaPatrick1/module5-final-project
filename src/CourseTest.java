import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CourseTest {
    @Test
    public void testCalculateAverage() {
        Course c = new Course("Science", "S101", "Dr. Brown");
        c.addGrade(new Grade("Lab", 100, 0.4, "2025-09-20"));
        c.addGrade(new Grade("Exam", 80, 0.6, "2025-10-10"));

        assertEquals(88.0, c.calculateAverage(), 0.01);
    }
}
