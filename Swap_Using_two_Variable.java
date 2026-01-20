
import java.util.Scanner;

class Swap_Using_two_Variable{
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a and b:");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("You have entered a:" +a+"b:"+b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("Answer a:"+a+ "b:"+b);
    }
}