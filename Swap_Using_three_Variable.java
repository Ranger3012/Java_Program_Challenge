
import java.util.Scanner;

class Swap_Using_three_Variable{
    public static void main(String[] args) {
        int x, y, z;
        System.out.println("Enter x and y:");
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("You have entered x:" +x+" entered y:" +y);

        z = x;
        x = y;
        y = z;

        System.out.println("Answer x:" +x+ " y:" +y);
    }
}