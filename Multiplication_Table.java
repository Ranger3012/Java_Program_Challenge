
import java.util.Scanner;

class Multiplication_Table{
    public static void main(String[] args) {
        int i, number;
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);

        number = sc.nextInt();

        for(i=1; i<=10; i++){
            System.out.println(number+" x "+i+" is :" +number*i);
        }

    }
}