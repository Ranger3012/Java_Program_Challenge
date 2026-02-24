
import java.util.Scanner;

class Substring_of_String{
    public static void main(String[] args) {
        String string, sub;
        int length;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your string: ");
        string = sc.nextLine();

        length = string.length();

        System.out.println("Substrings are:");

        for(int i = 0; i < length; i++){
            for(int j = 1; j<= length-i; j++){
                sub = string.substring(i, i+j);
                System.out.println(sub);
            }
        }





    }
}