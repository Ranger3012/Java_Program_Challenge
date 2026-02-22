
import java.util.Scanner;

class Prime_Number{
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        for(int num = 2; num <= number; num++){
            boolean isPrime = true;

            for(int i=2; i<=Math.sqrt(num); i++){
                if(num%i == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.println(num);
            }
        }
    }
}