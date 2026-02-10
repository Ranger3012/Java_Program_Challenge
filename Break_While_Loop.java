
import java.util.Scanner;

class Break_While_Loop{
    public static void main(String[] args) {
        int number_Loop;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter number Loop:");
            number_Loop = sc.nextInt();

            if(number_Loop == 0){
                break;
            } 
            
        }
    }
}