
import java.util.Scanner;

class Add_Two_Number{
    public static void main(String[] args) {
        int x, y, z;
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("x: "+x+" y:"+y);

        z = x+y;
        System.out.println("z:"+z);
    }
}