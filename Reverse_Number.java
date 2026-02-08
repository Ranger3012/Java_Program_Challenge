
import java.util.Scanner;

class Reverse_Number{
    public static void main(String[] args) {
        int number, reverse = 0;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        while(number != 0){
            reverse = reverse * 10;
            reverse = reverse + (number%10);
            number = number/10;
        }

        System.out.println("Reverse of given number is: " +reverse);
    }
}