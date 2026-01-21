
import java.util.Scanner;

class Condition2{
    public static void main(String[] args) {
        int marksObtained, passingMarks;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Marks:");
        marksObtained = sc.nextInt();
        passingMarks = 40;

        if(marksObtained >= 40){
            System.out.println("You Passed!");
        }else{
            System.out.println("Do more hardwork!");
        }
    }
}