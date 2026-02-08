
import java.util.Scanner;

class While_Loop{
    public static void main(String[] args) {
        int loop_Count;
        Scanner sc = new Scanner(System.in);
        loop_Count = sc.nextInt();

        while(loop_Count > 0){
            System.out.println("Current Loop Number is: "+loop_Count);
            loop_Count -= 1; 
        }

        System.out.println("You are out of Loop Count");

    }
}