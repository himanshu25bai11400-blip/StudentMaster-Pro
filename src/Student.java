public class Student {
    private String name;
    private int id;
    private double totalMarks;
    private int subjects;

    public Student(String name, int id, double totalMarks, int subjects) {
        this.name = name;
        this.id = id;
        this.totalMarks = totalMarks;
        this.subjects = subjects;
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public double getTotalMarks() { return totalMarks; }
    public int getSubjects() { return subjects; }
}
