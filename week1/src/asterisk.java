import java.util.*;

public class asterisk {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");

        int h = sc.nextInt();
        int i, j;

        for (i = 0; i < h; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println();
        for (i = 0; i < h; i++) {
            for (j = 0; j < h - i - 1; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
