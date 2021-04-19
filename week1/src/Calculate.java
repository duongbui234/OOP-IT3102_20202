import java.util.*;

public class Calculate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int a = sc.nextInt();
        System.out.println("Input the second number: ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("Sum of two number is: " + sum);

        int sub = a - b;
        System.out.println("Subtract of two number is: " + sub);

        int multiply = a * b;
        System.out.println("Multiply of two number is: " + multiply);

        float div = (float) a / b;
        System.out.println("Divide of two number is: " + div);

    }
}
