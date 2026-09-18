 StudentMaster-Pro:-

 
This project is a terminal-based Java application that allows administrators to perform CRUD (Create, Read, Update, Delete) operations on student records, automatically calculate GPA based on standardized grading scales, and generate formatting academic reports. It runs entirely locally and utilizes in-memory data structures.


 🎓 StudentMaster Pro

Overview:-

StudentMaster Pro is a modular Java application designed to manage student records and compute academic performance metrics. It applies core Object-Oriented Programming principles to solve real-world educational administration problems.

 Features:-
 
Functional Module 1 (Data Input & CRUD):  Seamlessly add and manage student records in memory.
Functional Module 2 (Data Processing):    Dynamically convert raw scores into percentages, letter grades, and GPA.
Functional Module 3 (Reporting):          Generate comprehensive performance summaries for all enrolled students.

Technologies Used:-

Java (JDK 8+): Core implementation language.
Scanner API: For secure and validated user input.
Collection Framework (ArrayList)**: For dynamic memory management.

 Steps to Install & Run:-
 
1. Clone the repository: `git clone https://github.com/yourusername/StudentMaster-Pro.git`
2. Navigate to the source directory: `cd StudentMaster-Pro/src`
3. Compile all files: `javac *.java`
4. Execute the application: `java Main`

 Instructions for Testing:-
 
Validation Testing:-

Attempt to enter negative numbers or letters when prompted for marks. The `InputValidator` class will catch these and prompt for correction.

Functional Testing:-

Add a student, assign marks, and view the report to ensure the GPA calculation logic applies correctly.
