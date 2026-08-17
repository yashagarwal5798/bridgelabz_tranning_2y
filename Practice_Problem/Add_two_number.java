import java.util.Scanner;

/**
 * Add_two_number
 */
public class Add_two_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        int n = sc.nextInt();
        System.out.println("Enter a second number: ");
        int x = sc.nextInt();
        int sum  = n + x;
        System.out.println("ADD two number: "+sum);
    }
}