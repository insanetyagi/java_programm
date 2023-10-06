import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = x.nextInt();
        System.out.println("enter the second number");
        int b = x.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.println("number is even :" + i);
            } else {
                System.out.println("number is odd:" + i);
            }
        }
        x.close();
    }
}