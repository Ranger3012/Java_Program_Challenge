
import java.util.Scanner;

class Largest_Of_Three_Number{
    public static void main(String[] args) {
        int x, y, z;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x, y, z:");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        System.out.println("You have entered x:"+x+" y:"+y+" z:"+z);

        if(x>y){
            if(z>y){
                System.out.println(+z+" is bigger than "+y+" and "+x);
            }else{
                System.out.println(+x+" is bigger than "+y+" and "+z);
            }
        }else if (y>x) {
            if(z>x){
                System.out.println(+z+" is bigger than "+y+" and "+x);
            }else{
                System.out.println(+y+" is bigger than "+z+" and "+x);
            }
        }else{
            System.out.println(+z+" is bigger than "+y+" and "+x);
        }
    }
}