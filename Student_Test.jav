public class Student_Test {
    public static void main(String[] args) {

        // Object + reference
        Student s = new Student("S12345", "Jean Dupont");

        // Adding grades
        s.addGrade(85);
        s.addGrade(92);
        s.addGrade(78);
        s.addGrade(88);
        s.addGrade(91);

        // Method calls
        double avg = s.calculateAverage();
        char letter = s.getLetterGrade();

        // Output
        System.out.println("Student ID: " + s.getStudentId());
        System.out.println("Name: " + s.getName());
        System.out.println("Average: " + String.format("%.2f", avg));
        System.out.println("Letter Grade: " + letter);
    }
}
