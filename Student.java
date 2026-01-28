import java.util.ArrayList;

public class Student {

    // Variables
    private String studentId;
    private String name;
    private ArrayList<Integer> grades;   // ArrayList (dynamic collection)

    // Constructor
    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // Getters
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    // Method: Add grade (validation)
    public void addGrade(int grade) {
        if (grade < 0 || grade > 100) {
            System.out.println("Error: Grade must be between 0 and 100.");
            return;
        }
        grades.add(grade);
        System.out.println("Grade added: " + grade);
    }

    // Method: Calculate average (loop)
    public double calculateAverage() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (int g : grades) {   // loop
            sum += g;
        }

        return (double) sum / grades.size();
    }

    // Method: Letter grade
    public char getLetterGrade() {
        double avg = calculateAverage();

        if (avg >= 90) return 'A';
        else if (avg >= 80) return 'B';
        else if (avg >= 70) return 'C';
        else if (avg >= 60) return 'D';
        else return 'F';
    }
}
