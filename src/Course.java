import java.util.ArrayList;

/**
 * Represents a course with a name, code, instructor, and grades.
 */
public class Course {
    private String courseName;
    private String courseCode;
    private String instructorName;
    private ArrayList<Grade> grades;

    public Course(String courseName, String courseCode, String instructorName) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructorName = instructorName;
        this.grades = new ArrayList<>();
    }

    public String getCourseName() { return courseName; }
    public void setCourseName(String name) { this.courseName = name; }

    public String getCourseCode() { return courseCode; }
    public void setCourseCode(String code) { this.courseCode = code; }

    public String getInstructorName() { return instructorName; }
    public void setInstructorName(String name) { this.instructorName = name; }

    public ArrayList<Grade> getGrades() { return grades; }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    /**
     * Calculates weighted average of grades.
     */
    public double calculateAverage() {
        if (grades.isEmpty()) return 0.0;
        double totalScore = 0.0;
        double totalWeight = 0.0;
        for (Grade g : grades) {
            totalScore += g.getScore() * g.getWeight();
            totalWeight += g.getWeight();
        }
        return totalWeight == 0 ? 0.0 : totalScore / totalWeight;
    }

    @Override
    public String toString() {
        return courseName + " (" + courseCode + ") - Instructor: " + instructorName;
    }
}
