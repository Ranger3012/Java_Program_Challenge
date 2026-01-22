
import java.util.Scanner;

class Factorial{
    public static void main(String[] args) {
        int number, fact = 1;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        while(number != 0){
            fact = fact * number;
            number -= 1;
        }
        System.out.println("Factorial of "+number+" is: " +fact);

    }
}