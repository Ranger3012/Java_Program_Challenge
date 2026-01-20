
import java.util.Scanner;

class Convert_Fehrenheit_To_Celsius{
    public static void main(String[] args) {
        float temperature;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Temp in Fahrenheit:");
        temperature = sc.nextFloat();

        temperature = ((temperature-32)*5)/9;

        System.out.println("Temp in Celsius: " +temperature);
    }
}