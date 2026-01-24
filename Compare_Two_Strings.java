
import java.util.Scanner;

public class Compare_Two_Strings{
    public static void main(String[] args) {
        
        String s1, s2;
        Scanner sc = new Scanner(System.in);

        s1 = sc.nextLine();
        s2 = sc.nextLine();

        if(s1.compareTo(s2) > 0){
            System.out.println("s1 is greater than s2.");
        }if(s1.compareTo(s2) < 0){
            System.out.println("s2 is greater than s1.");
        }else{
            System.out.println("Both are equals.");
        }
    }
}