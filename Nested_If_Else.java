
import java.util.Scanner;

class Nested_If_Else{
    public static void main(String[] args) {
        
        int marks;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Marks:");
        marks = sc.nextInt();

        System.out.println("You have entered: "+marks);

        if(marks>=40){
            if(marks>=85){
                System.out.println("Grade A");
            }else if(marks>=75 && marks<=65){
                System.out.println("Grade B");
            }else{
                System.out.println("Grade C");
            }
        }else{
            System.out.println("Grade D");
        }
    }
}