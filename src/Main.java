import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        boolean running = true;

        System.out.println("==================================");
        System.out.println(" Welcome to StudentMaster Pro ");
        System.out.println("==================================");

        while (running) {
            System.out.println("\n1. Add New Student\n2. View Academic Report\n3. Exit");
            int choice = InputValidator.getValidInt(scanner, "Choose an option (1-3): ", 1, 3);

            if (choice == 1) {
                System.out.print("Enter Student Name: ");
                scanner.nextLine(); // Consume newline
                String name = scanner.nextLine();
                int id = InputValidator.getValidInt(scanner, "Enter Student ID (1-9999): ", 1, 9999);
                int subjects = InputValidator.getValidInt(scanner, "Enter number of subjects (1-10): ", 1, 10);
                
                double totalMarks = 0;
                for (int i = 1; i <= subjects; i++) {
                    totalMarks += InputValidator.getValidInt(scanner, "Enter marks for subject " + i + " (0-100): ", 0, 100);
                }
                
                manager.addStudent(new Student(name, id, totalMarks, subjects));
            } else if (choice == 2) {
                manager.generateReport();
            } else {
                running = false;
                System.out.println("Exiting system. Goodbye!");
            }
        }
        scanner.close();
    }
}
