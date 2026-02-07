public class Star_Console_Using_Loop {
    public static void main(String[] args) {
       
        for(int rows = 1; rows <= 5; rows++){
            for(int i = 1; i<=rows; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}