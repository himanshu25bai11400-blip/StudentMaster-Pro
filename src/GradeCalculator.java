public class GradeCalculator {
    public static double calculatePercentage(Student student) {
        if (student.getSubjects() == 0) return 0.0;
        return student.getTotalMarks() / student.getSubjects();
    }

    public static String getLetterGrade(double percentage) {
        if (percentage >= 90) return "A";
        if (percentage >= 80) return "B";
        if (percentage >= 70) return "C";
        if (percentage >= 60) return "D";
        return "F";
    }

    public static double getGPA(double percentage) {
        if (percentage >= 90) return 4.0;
        if (percentage >= 80) return 3.0;
        if (percentage >= 70) return 2.0;
        if (percentage >= 60) return 1.0;
        return 0.0;
    }
}
