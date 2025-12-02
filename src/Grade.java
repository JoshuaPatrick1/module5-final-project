/**
 * Represents a single grade for an assignment.
 */
public class Grade {
    private String assignmentName;
    private double score;
    private double weight;
    private String date;

    public Grade(String assignmentName, double score, double weight, String date) {
        this.assignmentName = assignmentName;
        this.score = score;
        this.weight = weight;
        this.date = date;
    }

    public String getAssignmentName() { return assignmentName; }
    public void setAssignmentName(String name) { this.assignmentName = name; }

    public double getScore() { return score; }
    public void setScore(double score) { this.score = score; }

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    @Override
    public String toString() {
        return assignmentName + ": " + score + " (Weight: " + weight + ", Date: " + date + ")";
    }
}
