
import java.util.Scanner;

class Get_Input_From_User{
    public static void main(String[] args) {
        int a;
        float b;
        String c;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String:");
        c = sc.nextLine();
        System.out.println("You have entered:" +c);

         System.out.print("Enter an integer:");
        a = sc.nextInt();
        System.out.println("You have entered:" +a);

         System.out.print("Enter a float:");
        b = sc.nextFloat();
        System.out.println("You have entered:" +b);
    }
}