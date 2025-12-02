import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GradeTest {
    @Test
    public void testGradeToString() {
        Grade g = new Grade("Project", 95, 1.0, "2025-11-05");
        assertTrue(g.toString().contains("Project"));
    }
}
