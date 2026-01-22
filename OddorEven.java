
import java.util.Scanner;

class OddorEven{
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);

        number = sc.nextInt();

        if(number%2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}