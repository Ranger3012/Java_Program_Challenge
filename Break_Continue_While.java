
import java.util.Scanner;

class Break_While_Loop{
    public static void main(String[] args) {
        int number_Loop;
        String person_working_Loop;
        Scanner sc = new Scanner(System.in);
        number_Loop = sc.nextInt();

        while(number_Loop > 0){
            System.out.println("Loop number: "+number_Loop);

            if(number_Loop == 5){
                break;
            }
            person_working_Loop = sc.next();
            
            if (person_working_Loop.equals("y")) {
                number_Loop -= 1;
                System.out.println("now the loop number is: " + number_Loop);
                continue;
            } else {
            break;
        }

    }
    }
}