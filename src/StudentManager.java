import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> database;

    public StudentManager() {
        this.database = new ArrayList<>();
    }

    public void addStudent(Student student) {
        database.add(student);
        System.out.println("✅ Student added successfully!");
    }

    public void generateReport() {
        System.out.println("\n--- 📊 SYSTEM ACADEMIC REPORT ---");
        if (database.isEmpty()) {
            System.out.println("No records found.");
            return;
        }
        for (Student s : database) {
            double pct = GradeCalculator.calculatePercentage(s);
            System.out.printf("ID: %d | Name: %s | Grade: %s | GPA: %.1f\n", 
                s.getId(), s.getName(), GradeCalculator.getLetterGrade(pct), GradeCalculator.getGPA(pct));
        }
    }
}
